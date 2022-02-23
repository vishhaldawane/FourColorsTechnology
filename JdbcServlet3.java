package com.fourcolors;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fourcolors.dao.Department;
import com.fourcolors.dao.DepartmentDAOImpl;


public class JdbcServlet3 extends HttpServlet {
	
	//Chef
	DepartmentDAOImpl deptDao ; //DL
	
    public JdbcServlet3() {
    	System.out.println("JdbcServlet3() ctor...");
    }
    
	public void init(ServletConfig config) throws ServletException {
		deptDao = new DepartmentDAOImpl(); //MODEL
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		
		PrintWriter pw = response.getWriter();	//BL
		
		response.setContentType("text/html"); //BL
	
			List<Department> deptList = deptDao.selectDepartments(); //DL
	
			//Presented by JSP
			RequestDispatcher rd = request.getRequestDispatcher("ShowAllDepartments.jsp");
			System.out.println("showing dept details via the jsp page....");
			request.setAttribute("AllDepts",deptList);
			rd.forward(request, response);	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);    
	}

	
	public void destroy() {
		
			System.out.println("destroy is called.....");
	
	}
}


