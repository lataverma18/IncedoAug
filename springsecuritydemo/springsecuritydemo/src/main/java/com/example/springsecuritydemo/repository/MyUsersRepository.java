package com.example.springsecuritydemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springsecuritydemo.entities.MyUsers;
@Repository("ur")
public interface MyUsersRepository extends JpaRepository<MyUsers, String> {

}
