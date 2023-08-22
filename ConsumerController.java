package com.example.demo.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.dto.Employee;

@RestController
@RequestMapping("/consumerapi")
public class ConsumerController {
	String url="http://localhost:8085/eapi/employees";
	@Autowired
	RestTemplate rt;
	
	@GetMapping("/employees/{id}")
	public Employee getEmpById(@PathVariable("id") int id)
	{
		url=url+"/"+id;
		Employee emp=rt.getForObject(url, Employee.class);
		return emp;
	}
	@GetMapping("/employees")
	public List<Employee> getEmps()
	{
		List<Employee> emps=Arrays.asList(rt.getForObject(url, Employee[].class));
		return emps;
	}
	@PostMapping("/employees")
	public Employee addEmp(@RequestBody Employee emp)
	{
		Employee e=rt.postForObject(url, emp, Employee.class);
		return e;
	}
	@PutMapping("/employees/{id}")
	public String addEmp(@PathVariable("id") int id, @RequestBody Employee emp)
	{
		url=url+"/"+id;
		rt.put(url, emp);
		return "Updated Successfully!!!";
	}
	@DeleteMapping("/employees/{id}")
	public String addEmp(@PathVariable("id") int id)
	{
		url=url+"/"+id;
		rt.delete(url);
		//rt.getForEntity(url, Employee.class);
		return "Deleted Successfully!!!";
	}	
}
