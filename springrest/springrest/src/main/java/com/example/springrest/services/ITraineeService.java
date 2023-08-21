package com.example.springrest.services;

import java.util.List;
import org.springframework.data.domain.Page;
import com.example.springrest.entities.Trainee;

public interface ITraineeService {
	public List<Trainee> fetchAll();	
	public Page<Trainee> fetchAllByPages(int pages);
	public Trainee fetchById(int id);
	public Trainee fetchByName(String name);
	public Trainee insertTrainee(Trainee trainee);
	public Trainee updateTrainee(Trainee trainee,int id);
	public String deleteTraineeById(int id);
	public String deleteTraineeByName(String name);
}
