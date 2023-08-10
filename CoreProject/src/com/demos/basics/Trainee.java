package com.demos.basics;

public class Trainee {
	private int id;
	private String name;
	static public String technology;
	
	
	public static String getTechnology() {
		return technology;
	}
	public static void setTechnology(String technology) {
		Trainee.technology = technology;
	}
	static void get() 
		{
		
		System.out.println("Static Method "+technology);
		}
	void put()
	{
		System.out.println("Static Method "+id);
	}
	static
	{
		System.out.println("Trainee's Static Block");
		technology="Java";
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
