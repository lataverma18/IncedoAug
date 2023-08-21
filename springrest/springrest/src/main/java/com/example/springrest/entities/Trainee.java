package com.example.springrest.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Trainee {
	@Id
	private int traineeId;
	private String traineeName;
	private String traineeTechnology;
	private int traineeAge;
	private String traineeEmail;
	public int getTraineeId() {
		return traineeId;
	}
	public void setTraineeId(int traineeId) {
		this.traineeId = traineeId;
	}
	public String getTraineeName() {
		return traineeName;
	}
	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}
	public String getTraineeTechnology() {
		return traineeTechnology;
	}
	public void setTraineeTechnology(String traineeTechnology) {
		this.traineeTechnology = traineeTechnology;
	}
	public int getTraineeAge() {
		return traineeAge;
	}
	public void setTraineeAge(int traineeAge) {
		this.traineeAge = traineeAge;
	}
	public String getTraineeEmail() {
		return traineeEmail;
	}
	public void setTraineeEmail(String traineeEmail) {
		this.traineeEmail = traineeEmail;
	}
	public Trainee(int traineeId, String traineeName, String traineeTechnology, int traineeAge, String traineeEmail) {
		super();
		this.traineeId = traineeId;
		this.traineeName = traineeName;
		this.traineeTechnology = traineeTechnology;
		this.traineeAge = traineeAge;
		this.traineeEmail = traineeEmail;
	}
	public Trainee() {
		super();
		// TODO Auto-generated constructor stub
	}
}
