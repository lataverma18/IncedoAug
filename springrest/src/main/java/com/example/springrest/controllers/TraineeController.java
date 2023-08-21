package com.example.springrest.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springrest.entities.Trainee;
import com.example.springrest.repository.TraineeRepository;

@RestController
@RequestMapping("/v1/api")
public class TraineeController {

	@Autowired
	TraineeRepository tr;
	
	@GetMapping("/trainees")
	public List<Trainee> fetchAll()
	{
		return tr.findAll();
	}
	@GetMapping("/trainees/pageable/{pages}")
	public Page<Trainee> fetchAllByPages(@PathVariable("pages") int pages)
	{
		return tr.findAll(PageRequest.of(0, pages,Sort.by(Direction.DESC,"traineeId")));
	}
	@GetMapping("/trainees/{id}")
	public ResponseEntity<Trainee> fetchById(@PathVariable("id") int id)
	{
		Optional<Trainee> op=tr.findById(id);
		if(op.isPresent())
		{
			ResponseEntity<Trainee> re=new ResponseEntity<>(op.get(),HttpStatus.OK);
			return re;
		}
		else
		{
			ResponseEntity<Trainee> re=new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
			return re;
		}	
	}
	@GetMapping("/trainees/byName/{name}")
	public Trainee fetchByName(@PathVariable("name") String name)
	{
		return tr.findByTraineeName(name);
	}
	@PostMapping("/trainees")
	public Trainee insertTrainee(@RequestBody Trainee trainee)
	{
		return tr.save(trainee);
	}
	@PutMapping("/trainees/{id}")
	public Trainee updateTrainee(@RequestBody Trainee trainee,@PathVariable("id") int id)
	{
		if(id==trainee.getTraineeId())
		{
			if(tr.existsById(id))
				return tr.save(trainee);
		}
			return null;
	}
	@DeleteMapping("/trainees/{id}")
	public String deleteTraineeById(@PathVariable("id") int id)
	{
		if(tr.existsById(id))
		{
			tr.deleteById(id);
			return "Deleted Successfully!!!";
		}
		else
			return "Not Found"; 
	}
	@DeleteMapping("/trainees/byName/{name}")
	public String deleteTraineeById(@PathVariable("name") String name)
	{
		if(tr.existsByTraineeName(name))
		{
			tr.deleteByTraineeName(name);
			return "Deleted Successfully!!!";
		}
		else
			return "Not Found"; 
	}
}
