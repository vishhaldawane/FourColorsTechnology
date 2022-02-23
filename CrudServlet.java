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


public class CrudServlet extends HttpServlet {
	
	Connection conn ;
	Statement  st ;
	ResultSet  result;
	
    public CrudServlet() {
    	System.out.println("JdbcServlet() ctor...");
    }
    
	public void init(ServletConfig config) throws ServletException {
		try {
			//1	
			DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			System.out.println("Driver registerd....");			
			//2
			conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/mydb", "SA", "");
			System.out.println("Connected to the DB : "+conn);			
			//3
			st = conn.createStatement();System.out.println("Statement made "+st);	
		} catch (SQLException e) {e.printStackTrace();}
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		
		
		
			String action = request.getParameter("submit");
			
			PrintWriter pw = response.getWriter();		
			//pw.println(action+" invoked..."+deptno);
			
			response.setContentType("text/html");
			
			if(action.equals("Delete")) {
				
				String deptno = request.getParameter("deptno");	
				
				pw.println("<h2>Deleting this department number "+deptno+" </h2>");
				
			
				int existingDeptno = Integer.parseInt(deptno);
				
				try {
					
					Statement st = conn.createStatement();
					ResultSet rs = st.executeQuery("select * from dept_fc where deptno="+existingDeptno);
					
					if(rs.next()) {
							
						
						PreparedStatement pst = conn.prepareStatement("delete from dept_Fc where deptno=?");
						pst.setInt(1, existingDeptno);
					
						System.out.println("PreparedStatement made "+pst);
					
						int row = pst.executeUpdate();
						System.out.println(row+" row(s) deleted.....");
						pw.println("<h3>Row Deleted "+deptno+" </h3>");
						pw.println("<a href='http://localhost:8080/JdbcWebProject/jdbc'>Go Back</a>");
					
					}
					else {
						pw.println("<h3>Row NOT Found  "+deptno+" </h3>");
						pw.println("<a href='http://localhost:8080/JdbcWebProject/jdbc'>Go Back</a>");
					}
				
					
					
					//RequestDispatcher rd = request.getRequestDispatcher("/jdbc");
					//rd.forward(request, response);
				}
				catch(SQLException e) {
					System.out.println("deleting exception : "+e);
				}
			}
			else if(action.equals("Edit")) {
				try
				{
					
					String deptno = request.getParameter("deptno");	
					pw.println("<h2>Editing this department number "+deptno+" </h2>");
					
					
					int existingDeptno = Integer.parseInt(deptno);
					
					String modifiedDeptName = request.getParameter("deptname");	
	
					String modifiedDeptLoc = request.getParameter("deptloc");	
					
					PreparedStatement pst = conn.prepareStatement("update dept_Fc set deptname=?, deptloc=? where deptno=?");
				
					pst.setString(1, modifiedDeptName);
					pst.setString(2, modifiedDeptLoc);
					pst.setInt(3, existingDeptno);
					
					System.out.println("PreparedStatement made "+pst);
					
					int row = pst.executeUpdate();
					System.out.println(row+" row(s) updated.....");
					pw.println("<h3>Row Updated "+row+" </h3>");
					pw.println("<a href='http://localhost:8080/JdbcWebProject/jdbc'>Go Back</a>");
				}
				catch(SQLException e) {
					System.out.println("Modifing exception  "+e);
				}
				

			}

		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);    
	}

	
	public void destroy() {
		try {
			result.close();
			st.close();
			conn.close();
			DriverManager.deregisterDriver(new org.hsqldb.jdbc.JDBCDriver());
			System.out.println("driver is de-registered....");
			System.out.println("Driver registerd....");		
			System.out.println("DB resources are closed.....");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}


