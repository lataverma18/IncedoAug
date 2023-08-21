package com.example.springrest.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springrest.entities.Trainee;
import com.example.springrest.exceptions.IncorrectTraineeDetailException;
import com.example.springrest.exceptions.TraineeIdNotFoundException;
import com.example.springrest.exceptions.TraineeNameNotFoundException;
import com.example.springrest.repository.TraineeRepository;
import com.example.springrest.services.ITraineeService;
import com.example.springrest.services.TraineeService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@RestController
@RequestMapping(path="/v1/api")
public class TraineeController {

	@Autowired
	ITraineeService ts;
	
	@Operation(summary = "To Fetch All")
	@GetMapping(path="/trainees",produces ={MediaType.APPLICATION_XML_VALUE})
	public List<Trainee> fetchAll()
	{
		return ts.fetchAll();
	}
	@GetMapping("/trainees/pageable/{pages}")
	public Page<Trainee> fetchAllByPages(@PathVariable("pages") int pages)
	{
		return ts.fetchAllByPages(pages);
	}
	@GetMapping(path="/trainees/{id}",produces ={MediaType.APPLICATION_XML_VALUE})
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "OK",content = @Content(mediaType =MediaType.APPLICATION_XML_VALUE,schema = @Schema(allOf = Trainee.class) )),
			@ApiResponse(responseCode = "404", description = "NOT_FOUND",content = @Content(mediaType =MediaType.APPLICATION_XML_VALUE,schema = @Schema(allOf = String.class) ))
	})
	public ResponseEntity<Trainee> fetchById(@PathVariable("id") int id)
	{
		return new ResponseEntity<>(ts.fetchById(id),HttpStatus.OK);	
	}
	@GetMapping("/trainees/byName/{name}")
	public Trainee fetchByName(@PathVariable("name") String name)
	{
		return ts.fetchByName(name);
	}
	@PostMapping("/trainees")
	public Trainee insertTrainee(@RequestBody Trainee trainee)
	{
		return ts.insertTrainee(trainee);
	}
	@PutMapping("/trainees/{id}")
	public Trainee updateTrainee(@RequestBody Trainee trainee,@PathVariable("id") int id)
	{
		if(id==trainee.getTraineeId())
		{
			return ts.updateTrainee(trainee, id);
		}
		else
		{
			throw new IncorrectTraineeDetailException("Id is not same in Request Body :"+id);
		}
	}
	@DeleteMapping("/trainees/{id}")
	public String deleteTraineeById(@PathVariable("id") int id)
	{
		return ts.deleteTraineeById(id);
	}
	@DeleteMapping("/trainees/byName/{name}")
	public String deleteTraineeByName(@PathVariable("name") String name)
	{
		return ts.deleteTraineeByName(name);
	}
	
	/*
	 * @ExceptionHandler(TraineeIdNotFoundException.class) public
	 * ResponseEntity<String> handlingIdNotFound(TraineeIdNotFoundException te) {
	 * return new ResponseEntity<String>(te.getMessage(),HttpStatus.NOT_FOUND); }
	 */
}
