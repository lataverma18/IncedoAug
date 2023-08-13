package coreconeptsteam.CoreJavaProject;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import coreconeptsteam.CoreJavaProject.entities.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	EntityManagerFactory emf= Persistence.createEntityManagerFactory("p1");
        EntityManager em=emf.createEntityManager();
        
        em.getTransaction().begin();
		int id=101;
		
		  
		  Employee emp=new Employee();  emp.setName("Rohit Sharma");
		  emp.setSalary(40000); emp.setDepartment("QA");
		 
		  
		  em.persist(emp);
		 // em.merge(emp); //find+updation
		 
			/*
			 * Employee e=em.find(Employee.class, 101);
			 * System.out.println("Fetched Record is: "+e.getId()+"\t"+e.getName()+"\t"+e.
			 * getSalary()+"\t"+e.getDepartment());
			 */
        	System.out.println("Inserted Successfully!!!");
			/*
			 * Employee e=em.find(Employee.class,id); if(e!=null) { em.remove(e);
			 * System.out.println("Record deleted Successfully!!!"); } else
			 * System.out.println("Record not foound for id: "+id);
			 */
		//  System.out.println("Updated Successfully!!!");
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
}
