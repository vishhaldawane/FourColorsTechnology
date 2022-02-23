package com.fourcolors;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fourcolors.dao.Department;
import com.fourcolors.dao.DepartmentDAOImpl;


public class JdbcServlet2 extends HttpServlet {
	
	//Chef
	DepartmentDAOImpl deptDao ; 
	
    public JdbcServlet2() {
    	System.out.println("JdbcServlet2() ctor...");
    }
    
	public void init(ServletConfig config) throws ServletException {
		deptDao = new DepartmentDAOImpl(); //MODEL
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		PrintWriter pw = response.getWriter();	//BL
		response.setContentType("text/html"); //BL
	
			List<Department> deptList = deptDao.selectDepartments();
	
			//self presenting
			pw.println("<table border=5 cellspacing=10 cellpadding=10>");
			pw.println("<thead> <th> DEPTNO </th> <th> NAME </th><th> LOCATION </th></thead>");
			
			
			Department deptTemp = new Department(); //blank object
			pw.println("<form action='crud'>");
				pw.println("<tr>");
					pw.println("<td>"+"<input type=text name=deptno value="+deptTemp.getDepartmentNumber()+" ></td>");
					pw.println("<td>"+"<input type=text name=deptname value="+deptTemp.getDepartmentName()+"></td>");
					pw.println("<td>"+"<input type=text name=deptloc value="+deptTemp.getDepartmentLocation()+"></td>");	
					
					pw.println("<td>"+"<input type=submit style='background-color:Green;color:white' name=submit value=Add>"+"</td>");
					
				pw.println("</tr>");
		
			pw.println("</form>");
			
			for(Department dept : deptList) {
				
				pw.println("<form action='crud'>");
				pw.println("<tr>");
					pw.println("<td>"+"<input type=text name=deptno value='"+dept.getDepartmentNumber()+"' ></td>");
					pw.println("<td>"+"<input type=text name=deptname value='"+dept.getDepartmentName()+"'></td>");
					pw.println("<td>"+"<input type=text name=deptloc value='"+dept.getDepartmentLocation()+"'></td>");	
					
					pw.println("<td>"+"<input type=submit style='background-color:blue;color:white' name=submit value=Edit>"+"</td>");
					pw.println("<td>"+"<input type=submit style='background-color:red;color:white' name=submit  value=Delete>"+"</td>");
				pw.println("</tr>");
				pw.println("</form>");
						
		
			} 
			pw.println("</table>");	
			//pw.println("</form'>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);    
	}

	
	public void destroy() {
		
			System.out.println("destroy is called.....");
			
		
	}
}


