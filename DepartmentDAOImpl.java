package com.fourcolors.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DepartmentDAOImpl //implements DepartmentDAO { //3. Pojo Crud Interface assurance of all the function implementations
{
	Connection conn;
	ResultSet result;
	Statement statement;
	PreparedStatement preparedStatement;
	
	
	public DepartmentDAOImpl() {
		try {
			//1	
			DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			System.out.println("Driver registerd....");			
			//2
			conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/mydb", "SA", "");
			System.out.println("Connected to the DB : "+conn);			
			//3
			statement = conn.createStatement();System.out.println("Statement made "+statement);	
		} catch (SQLException e) {e.printStackTrace();}
	}
	

	public void insertDepartment(Department deptObj) {
		try {
			int newDeptno = deptObj.getDepartmentNumber();
			String newDeptName = deptObj.getDepartmentName();
			String newDeptLoc = deptObj.getDepartmentLocation();
			
			PreparedStatement pst = conn.prepareStatement("insert into dept_Fc values (?,?,?)");
			pst.setInt(1, newDeptno);
			pst.setString(2, newDeptName);
			pst.setString(3, newDeptLoc); 
			
			System.out.println("PreparedStatement made "+pst); //
			
			int row = pst.executeUpdate();
			System.out.println(row+" row(s) inserted.....");
	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	
	public Department selectDepartment(int deptNumber) {

		Department deptObj = null; //a null object 
		
		try
		{
			result  = statement.executeQuery("select * FROM DEPT_FC where deptno="+deptNumber);	
			
			if(result.next()) {
				int deptno = result.getInt(1); // grab the table's column's data
				String dname = result.getString(2);
				String loc  = result.getString(3);
				
				deptObj = new Department();
				deptObj.setDepartmentNumber(deptno); // push/associate table's column's data  with object's field
					deptObj.setDepartmentName(dname);
					deptObj.setDepartmentLocation(loc);

			}
		}
		catch(SQLException e) {
			System.out.println("Exception : "+e);
		}
		return deptObj;
	}

	
	public List<Department> selectDepartments() {
		
		List<Department> deptList = new ArrayList<Department>(); //blank array list

		try
		{
			result  = statement.executeQuery("select * FROM DEPT_FC");	
			
			while(result.next()) {
				int deptno = result.getInt(1); // grab the table's column's data
				String dname = result.getString(2);
				String loc  = result.getString(3);
				
				Department deptObj = new Department(); //a blank object - like an empty row of the table
					deptObj.setDepartmentNumber(deptno); // push/associate table's column's data  with object's field
					deptObj.setDepartmentName(dname);
					deptObj.setDepartmentLocation(loc);

				deptList.add(deptObj); // fill up the array list 
				
			}
		}
		catch(SQLException e) {
			System.out.println("Exception : "+e);
		}
		return deptList;
	}

	
	public void updateDepartment(Department deptObj) {
		try {
	
			int existingDeptno = deptObj.getDepartmentNumber();
			String modifiedDeptName = deptObj.getDepartmentName();
			String modifiedDeptLoc = deptObj.getDepartmentLocation();
			
			PreparedStatement pst = conn.prepareStatement("update dept_Fc set deptname=?, deptloc=? where deptno=?");
			pst.setInt(3, existingDeptno);
			pst.setString(1, modifiedDeptName);
			pst.setString(2, modifiedDeptLoc);
			
			System.out.println("PreparedStatement made "+pst);
			
			int row = pst.executeUpdate();
			System.out.println(row+" row(s) updated.....");
			
		
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	
	public void deleteDepartment(int deptNumber) {
		try {
			
			PreparedStatement pst = conn.prepareStatement("delete from dept_Fc where deptno=?");
			pst.setInt(1, deptNumber);
		
			
			System.out.println("PreparedStatement made "+pst);
			
			int row = pst.executeUpdate();
			System.out.println(row+" row(s) deleted.....");
			
		
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
