package coreconeptsteam.CoreJavaProject.entities;

import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Department {
	@Id
	@GeneratedValue
	private int did;
	private String dname;
	private String dmanager;
	
	
	@OneToMany(cascade = CascadeType.ALL)
	Set<Officer> officers=new LinkedHashSet<>();
	
	
	public Set<Officer> getOfficers() {
		return officers;
	}
	public void setOfficers(Set<Officer> officers) {
		this.officers = officers;
	}
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getDmanager() {
		return dmanager;
	}
	public void setDmanager(String dmanager) {
		this.dmanager = dmanager;
	}
}
