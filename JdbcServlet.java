package com.fourcolors;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class JdbcServlet extends HttpServlet {
	//self cooking
	Connection conn ;Statement  st ;ResultSet  result;
	
    public JdbcServlet() {System.out.println("JdbcServlet() ctor...");}
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
		PrintWriter pw = response.getWriter();	
		response.setContentType("text/html");
		try {		

			result  = st.executeQuery("select * FROM DEPT_FC");	
			
			//self presenting
			pw.println("<table border=5 cellspacing=10 cellpadding=10>");
			pw.println("<thead> <th> DEPTNO </th> <th> NAME </th><th> LOCATION </th></thead>");
			int newDeptNo=0;
			String newDeptName=null;
			String newDeptLoc=null;
			
			pw.println("<form action='crud'>");
				pw.println("<tr>");
					pw.println("<td>"+"<input type=text name=deptno value="+newDeptNo+" ></td>");
					pw.println("<td>"+"<input type=text name=deptname value="+newDeptName+"></td>");
					pw.println("<td>"+"<input type=text name=deptloc value="+newDeptLoc+"></td>");	
					
					pw.println("<td>"+"<input type=submit style='background-color:Green;color:white' name=submit value=Add>"+"</td>");
					
				pw.println("</tr>");
		
			pw.println("</form>");
			
			while(result.next()) {
				int deptno = result.getInt(1);
				String dname = result.getString(2);
				String loc  = result.getString(3);	
				pw.println("<form action='crud'>");
				pw.println("<tr>");
					pw.println("<td>"+"<input type=text name=deptno value='"+deptno+"' ></td>");
					pw.println("<td>"+"<input type=text name=deptname value='"+dname+"'></td>");
					pw.println("<td>"+"<input type=text name=deptloc value='"+loc+"'></td>");	
					
					pw.println("<td>"+"<input type=submit style='background-color:blue;color:white' name=submit value=Edit>"+"</td>");
					pw.println("<td>"+"<input type=submit style='background-color:red;color:white' name=submit  value=Delete>"+"</td>");
				pw.println("</tr>");
				pw.println("</form>");
						
			}
			pw.println("</table>");	
			} catch (SQLException e) {
				e.printStackTrace();
			}
			//pw.println("</form'>");
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


