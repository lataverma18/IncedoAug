package coreconeptsteam.CoreJavaProject;

import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import coreconeptsteam.CoreJavaProject.entities.Department;
import coreconeptsteam.CoreJavaProject.entities.Officer;

public class OneToManyDemo {

	public static void main(String[] args) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("p1");
        EntityManager em=emf.createEntityManager();
        em.getTransaction().begin();
        
        Department d1=new Department();
        d1.setDname("Production");
        d1.setDmanager("Rahul");
        	Set<Officer> s1=new LinkedHashSet<>();
        	s1.add(new Officer("Harsh",46000));
        	s1.add(new Officer("Veena",42000));
        	s1.add(new Officer("Harish",41000));
        d1.setOfficers(s1);
        
        Department d2=new Department();
        d2.setDname("QA");
        d2.setDmanager("Raj");
        	Set<Officer> s2=new LinkedHashSet<>();
        	s2.add(new Officer("Neeta",46000));
        	s2.add(new Officer("Sapna",42000));
        	s2.add(new Officer("Indu",41000));
        d2.setOfficers(s2);
        
        em.persist(d1);
        em.persist(d2);
        
        System.out.println("Inserted Successfully!!!");
        
        em.getTransaction().commit();
        em.close();
        emf.close();
	}
}

