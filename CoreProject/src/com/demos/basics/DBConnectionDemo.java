package com.demos.basics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConnectionDemo {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("org.postgresql.Driver");
		Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/TempDB", "postgres", "system");
		/*
		 * PreparedStatement ps=con.prepareStatement("select * from Employee");
		 * ResultSet rs=ps.executeQuery(); while(rs.next()) {
		 * System.out.println(rs.getInt("Id")+"\t"+rs.getString("Name")+"\t"+rs.getInt(
		 * "Salary")+"\t"+rs.getString("Department")); }
		 */
		/*
		 * int empId=106; String name="Urvi"; int salary=34000; String
		 * dept="Production";
		 * 
		 * 
		 * PreparedStatement
		 * ps=con.prepareStatement("insert into Employee values(?,?,?,?)"); ps.setInt(1,
		 * empId); ps.setString(2, name); ps.setInt(3, salary); ps.setString(4, dept);
		 * int rowAffected=ps.executeUpdate(); if(rowAffected==1)
		 * System.out.println("Inserted Successfully"); else
		 * System.out.println("Problem in Insertion");
		 */
		// rs.close();

		/*
		 * int empId=106; int salary=38000;
		 * 
		 * PreparedStatement
		 * ps=con.prepareStatement("update Employee set salary=? where Id=?");
		 * ps.setInt(1, salary); ps.setInt(2, empId); int
		 * rowAffected=ps.executeUpdate(); if(rowAffected==1)
		 * System.out.println("Updated Successfully"); else
		 * System.out.println("Problem in Updation");
		 */
		
		  int empId=106; 
		  PreparedStatement ps=con.prepareStatement("delete from Employee where Id=?"); 
		  ps.setInt(1,empId);
		  
		  int rowAffected=ps.executeUpdate(); 
		  if(rowAffected==1)
		  System.out.println("Deleted Successfully"); else
		  System.out.println("Problem in Deletion");
		 
		  // rs.close();
		ps.close();
		con.close();
	}
}
