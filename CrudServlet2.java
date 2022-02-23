package com.fourcolors;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fourcolors.dao.Department;
import com.fourcolors.dao.DepartmentDAOImpl;

/*
 
  
  	Food restaurant 
  	|
  	Governed by One Person - Jack
  	
  	1. Jack is the Order taker - Jack - Servlet [ C ONTROLLER ] - BL
  	2. Jack is the Chef - Jane,Anjali					[ M odel ] data - DL - DAO
  	3. Jack is the Presenter - Julie 			[ V IEW ] JSP   - PL
  	

Customer1		Customer2		Customer3		Customer4		Customer5
|				|				|				|				|
Pizza			Idli Sambar		Fried Rice		Paneer Chilly   Juice


table1		table2		table3			table4		table5
5			5			5				5			5		= 25 

100



DAO
	1. POJO - plain old java object [ similar to the table's structure ]
	2. POJO's CRUD interface
	3. Pojo's CRUD interface implementation
	
	class Department
	{
	
	}


*/
public class CrudServlet2 extends HttpServlet {
	
	DepartmentDAOImpl deptDao; //MODEL
	
    public CrudServlet2() {
    	System.out.println("CrudServlet2() ctor...");
    }
    
	public void init(ServletConfig config) throws ServletException {
		deptDao = new DepartmentDAOImpl(); //MODEL
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		
			String action = request.getParameter("submit"); //BL	
			PrintWriter pw = response.getWriter();		//BL
			response.setContentType("text/html"); //BL
			
			if(action.equals("Add")) { //BL
				
				int newDeptno = Integer.parseInt(request.getParameter("deptno")); // BL
				String newDeptName = request.getParameter("deptname");	 //BL
				String newDeptLoc = request.getParameter("deptloc");	 //BL
			
				Department dept = new Department();
				dept.setDepartmentNumber(newDeptno);
				dept.setDepartmentName(newDeptName);
				dept.setDepartmentLocation(newDeptLoc);
				
				deptDao.insertDepartment(dept); //DL
							
				RequestDispatcher rd = request.getRequestDispatcher("DeptInserted.jsp"); //PL
				rd.forward(request, response);
				
				//		pw.println("<h3>This Department Number Already Exists!!! "+newDeptno+" </h3>");
				//		pw.println("<a href='http://localhost:8080/JdbcWebProject/jdbc'>Go Back</a>");
	
			}
			else if(action.equals("Delete")) { //BL	
				String deptno = request.getParameter("deptno");	 //BL
				int existingDeptno = Integer.parseInt(deptno);
				deptDao.deleteDepartment(existingDeptno); //DL
				RequestDispatcher rd = request.getRequestDispatcher("DeptDeleted.jsp");
				rd.forward(request, response);//PL
					//	pw.println("<h3>Row NOT Found  "+deptno+" </h3>");
					//	pw.println("<a href='http://localhost:8080/JdbcWebProject/jdbc'>Go Back</a>");
			}
			else if(action.equals("Edit")) {
					String deptno = request.getParameter("deptno");	
					
					int existingDeptno = Integer.parseInt(deptno);
					
						String modifiedDeptName = request.getParameter("deptname");	
	
						String modifiedDeptLoc = request.getParameter("deptloc");	
					
						Department dept = new Department();
						dept.setDepartmentNumber(existingDeptno);
						dept.setDepartmentName(modifiedDeptName);
						dept.setDepartmentLocation(modifiedDeptLoc);
							
						deptDao.updateDepartment(dept);
					
						RequestDispatcher rd = request.getRequestDispatcher("DeptUpdated.jsp");
						rd.forward(request, response);
						
					//	pw.println("<h3>Row NOT found  "+existingDeptno+" </h3>");
					//	pw.println("<a href='http://localhost:8080/JdbcWebProject/jdbc'>Go Back</a>");
			}

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);    
	}

	
	public void destroy() {	
			System.out.println("destroy is invoked........");

	}
}


