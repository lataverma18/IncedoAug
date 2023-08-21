package com.example.springrest.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;
import com.example.springrest.entities.Trainee;
import com.example.springrest.exceptions.TraineeIdNotFoundException;
import com.example.springrest.exceptions.TraineeNameNotFoundException;
import com.example.springrest.repository.TraineeRepository;

@Service("ts")
public class TraineeService implements ITraineeService{
	@Autowired
	TraineeRepository tr;
	
	public List<Trainee> fetchAll()
	{
		return tr.findAll();
	}
	
	public Page<Trainee> fetchAllByPages(int pages)
	{
		return tr.findAll(PageRequest.of(0, pages,Sort.by(Direction.DESC,"traineeId")));
	}
	
	public Trainee fetchById(int id)
	{
		Optional<Trainee> op=tr.findById(id);
		if(op.isPresent())
		{
			return op.get();
		}
		else
		{
			throw new TraineeIdNotFoundException("No Record Found for Id :"+ id);
		}	
	}
	
	public Trainee fetchByName(String name)
	{
		return tr.findByTraineeName(name);
	}
	
	public Trainee insertTrainee(Trainee trainee)
	{
		return tr.save(trainee);
	}
	
	public Trainee updateTrainee(Trainee trainee,int id)
	{
		if(tr.existsById(id))
			return tr.save(trainee);
		else
			throw new TraineeIdNotFoundException("No Record Found for Id :"+ id);
	}
	
	public String deleteTraineeById(int id)
	{
		if(tr.existsById(id))
		{
			tr.deleteById(id);
			return "Deleted Successfully!!!";
		}
		else
			throw new TraineeIdNotFoundException("No Record Found for Id :"+ id); 
	}
	
	public String deleteTraineeByName(String name)
	{
		if(tr.existsByTraineeName(name))
		{
			tr.deleteByTraineeName(name);
			return "Deleted Successfully!!!";
		}
		else
			throw new TraineeNameNotFoundException("No Record Found for Name :"+ name); 
	}
}
