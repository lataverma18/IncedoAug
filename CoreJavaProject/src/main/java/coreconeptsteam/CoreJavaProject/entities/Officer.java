package coreconeptsteam.CoreJavaProject.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Officer {
	@Id
	@GeneratedValue
	private int oid;
	private String oname;
	private int osalary;
	
	public Officer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Officer(String oname, int osalary) {
		this.oname = oname;
		this.osalary = osalary;
	}
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public String getOname() {
		return oname;
	}
	public void setOname(String oname) {
		this.oname = oname;
	}
	public int getOsalary() {
		return osalary;
	}
	public void setOsalary(int osalary) {
		this.osalary = osalary;
	}
}
