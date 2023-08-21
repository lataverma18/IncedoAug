package com.example.springrest.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandling {
	@ExceptionHandler(TraineeIdNotFoundException.class) 
	public ResponseEntity<String> handlingIdNotFound(TraineeIdNotFoundException te) 
	{
		return new ResponseEntity<String>(te.getMessage(),HttpStatus.NOT_FOUND); 
	}
}
