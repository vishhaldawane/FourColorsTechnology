<%@page import="java.util.List"%>
<%@page import="com.fourcolors.dao.Department"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1> This data is shown by ShowDepartment.jsp page </h1>
<table border=5 cellspacing=10 cellpadding=10>
	<tr> <th> DEPTNO </th> <th> NAME </th><th> LOCATION </th></tr>
			<% Department deptTemp = new Department(); %>
			<form action='crud'>
				<tr>
					<td><input type=text name=deptno value=<%=deptTemp.getDepartmentNumber()%> ></td>
					<td><input type=text name=deptname value="<%=deptTemp.getDepartmentName()%>"></td>
					<td><input type=text name=deptloc value="<%=deptTemp.getDepartmentLocation()%>"></td>	
					
					<td><input type=submit style='background-color:Green;color:white' name=submit value=Add></td>
					
				</tr>
		
			</form>
			
			<% 
				List<Department> deptList = (List<Department>) request.getAttribute("AllDepts");
			   for(Department dept : deptList) { 
			   
			 %>
				
				<form action='crud'>
				<tr>
					<td><input type=text name=deptno value='<%=dept.getDepartmentNumber() %>' ></td>
					<td><input type=text name=deptname value='<%=dept.getDepartmentName() %>'></td>
					<td><input type=text name=deptloc value='<%=dept.getDepartmentLocation() %>'></td>	
					
					<td><input type=submit style='background-color:blue;color:white' name=submit value=Edit></td>
					<td><input type=submit style='background-color:red;color:white' name=submit  value=Delete></td>
				</tr>
				</form>

			<%} %> 
			</table>	
</body>
</html>