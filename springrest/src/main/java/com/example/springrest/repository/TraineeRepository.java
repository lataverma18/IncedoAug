package com.example.springrest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.example.springrest.entities.Trainee;

import jakarta.transaction.Transactional;

@Repository("tr")
public interface TraineeRepository extends JpaRepository<Trainee, Integer> {
	Trainee findByTraineeName(String name);
	@Transactional
	void deleteByTraineeName(String name);
	boolean existsByTraineeName(String name);
}
