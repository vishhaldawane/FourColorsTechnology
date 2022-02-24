<%@page import="com.fourcolors.dao.DepartmentDAOImpl"%>
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

<h1> This is CrudServlet2.jsp and not a typical servlet.... </h1>

	<% 
	DepartmentDAOImpl deptDao = new DepartmentDAOImpl(); //MODEL
	String action = request.getParameter("submit"); //BL	
	
			if(action.equals("Add")) { //BL
				
				int newDeptno = Integer.parseInt(request.getParameter("deptno")); // BL
				String newDeptName = request.getParameter("deptname");	 //BL
				String newDeptLoc = request.getParameter("deptloc");	 //BL
			
				Department dept = new Department();
				dept.setDepartmentNumber(newDeptno);
				dept.setDepartmentName(newDeptName);
				dept.setDepartmentLocation(newDeptLoc);
				
				deptDao.insertDepartment(dept); //DL
		%>
		
		<jsp:include page="DeptInserted.jsp"/>
		
		<% 		
			}
			else if(action.equals("Delete")) { //BL	
				String deptno = request.getParameter("deptno");	 //BL
				int existingDeptno = Integer.parseInt(deptno);
				deptDao.deleteDepartment(existingDeptno); //DL
		%>
				<jsp:include page="DeptDeleted.jsp"/>;
		
		<% 	}
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
			%>				
					<jsp:include page="DeptUpdated.jsp"/>;
			<%}%>
</body>
</html>