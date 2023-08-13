package coreconeptsteam.CoreJavaProject;

import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import coreconeptsteam.CoreJavaProject.entities.Customer;
import coreconeptsteam.CoreJavaProject.entities.Department;
import coreconeptsteam.CoreJavaProject.entities.Officer;
import coreconeptsteam.CoreJavaProject.entities.Product;

public class ManyToManyDemo {

	public static void main(String[] args) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("p1");
        EntityManager em=emf.createEntityManager();
        em.getTransaction().begin();
        
        Customer c1=new Customer();
        c1.setCname("Neha");
        	Set<Product> plist=new LinkedHashSet<>();
        	plist.add(new Product("Bedsheet", 2000));
        	plist.add(new Product("FaceWash", 1500));
        c1.setProducts(plist);
        
        Customer c2=new Customer();
        c2.setCname("Deepika");
        	Set<Product> plist2=new LinkedHashSet<>();
        	plist2.add(new Product("Mobile", 80000));
        	plist2.add(new Product("Laptop", 100000));
        c2.setProducts(plist2);
        
        em.persist(c1);
        em.persist(c2);
        
        System.out.println("Inserted Successfully!!!");
        
        em.getTransaction().commit();
        em.close();
        emf.close();
	}
}

