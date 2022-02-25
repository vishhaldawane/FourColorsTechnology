package com.java;

import java.util.ArrayList;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/deptservice")
public class MyDepartmentService {

	static ArrayList<Department> deptList = new ArrayList<Department>();
	
	static {
		System.out.println("adding all the departments to the list...");
		Department dept1 = new Department(10,"IT","NY");
		Department dept2 = new Department(20,"Testing","ND");
		Department dept3 = new Department(30,"Sales","NJ");
		Department dept4 = new Department(40,"Purchase","NM");
		
		
		deptList.add(dept1);
		deptList.add(dept2);
		deptList.add(dept3);
		deptList.add(dept4);
		System.out.println("added all the departments to the list...");
		
	}
	public MyDepartmentService() {
		// TODO Auto-generated constructor stub
		System.out.println("MyDepartmentService() ctor.. is ready...");
	}
	
	@GET
	@Path("/getDepts")
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<Department> getAllDepartments() {
		System.out.println("/getDepts");
		return deptList;
	}
	
	@GET
	@Path("/getDept/{deptno}")
	@Produces(MediaType.APPLICATION_JSON)
	public Department getSingleDepartment(@PathParam("deptno") int x) {
		System.out.println("/getDept");
		Department tempDept = null;
		for(Department dept : deptList) {
			if(dept.getDepartmentNumber() == x ) {
				tempDept = dept;
				break;
			}
		}
		return tempDept;
	}
	
	@POST
	@Path("/addDept")
	@Produces(MediaType.APPLICATION_JSON)
	public Response addDepartment(Department deptObj) {
		System.out.println("/addDept");
		deptList.add(deptObj);
		return Response.status(201).build();
		
	}
	
	@PUT
	@Path("/updateDept")
	@Produces(MediaType.APPLICATION_JSON)
	public Department updateDepartment(Department deptToModify) {
		System.out.println("/updateDept");
		for(int i=0;i<deptList.size();i++) {
			Department deptFound = deptList.get(i);
			
			System.out.println("Department to modify is "+deptToModify.getDepartmentNumber());
			
			if(deptFound.getDepartmentNumber() == deptToModify.getDepartmentNumber()) {
			
				deptList.remove(deptFound);
				deptList.add(i, deptToModify);//of this new deptname , deptloc
				
				System.out.println("dept modified...");
				break;
			}
		}
		return deptToModify;
	}
	
	@DELETE
	@Path("/deleteDept/{deptno}")
	public Response deleteDepartment(@PathParam("deptno") int x) {
		System.out.println("/deleteDept");
		
		
		Department tempDept = null;
		for(int i=0;i<deptList.size();i++) {
			Department deptFound = deptList.get(i);
			if(deptFound.getDepartmentNumber() == x ) {
				
				deptList.remove(deptFound);
				break;
			}
		}
		return Response.status(201).build();
		
	}

}


