package coreconeptsteam.CoreJavaProject;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import coreconeptsteam.CoreJavaProject.entities.Address;
import coreconeptsteam.CoreJavaProject.entities.Employee;

public class OneToOneDemo {

	public static void main(String[] args) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("p1");
        EntityManager em=emf.createEntityManager();
        em.getTransaction().begin();
        	Employee emp= new Employee();
        	emp.setName("Ronit");
        	emp.setSalary(45000);
        	emp.setDepartment("Production");
        		Address ad1=new Address();
        		ad1.setAddress("E-4675/56");
        		ad1.setCity("Gurugram");
        		ad1.setState("Haryana");
        		ad1.setPincode("122005");
        	emp.setAddress(ad1);
        	
        	em.persist(emp);
        	System.out.println("Inserted Successfully!!!");
        
        em.getTransaction().commit();
        em.close();
        emf.close();
	}

}
