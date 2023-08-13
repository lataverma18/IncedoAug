package coreconeptsteam.CoreJavaProject.entities;

import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Product {
	@Id
	@GeneratedValue
	private int pid;
	private String pname;
	private int pprice;
	
	@ManyToMany(mappedBy ="products" )
	Set<Customer> customers=new LinkedHashSet<>();
	
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(String pname, int pprice) {
		super();
		this.pname = pname;
		this.pprice = pprice;
	}
	public Set<Customer> getCustomers() {
		return customers;
	}
	public void setCustomers(Set<Customer> customers) {
		this.customers = customers;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPprice() {
		return pprice;
	}
	public void setPprice(int pprice) {
		this.pprice = pprice;
	}
}
