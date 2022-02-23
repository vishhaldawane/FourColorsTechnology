package com.fourcolors.dao;

import java.util.List;

public class DepartmentDAOTest {

	public static void main(String[] args) { //Mom

		//Mom -> Maid -> maid has prepared the idli - she has to keep them ready in the steamer
		
		DepartmentDAOImpl deptDao = new DepartmentDAOImpl(); //maid
		
		
		deptDao.deleteDepartment(50);
		
//		List<Department> deptList = deptDao.selectDepartments();
//		
//		for (Department department : deptList) {
//			System.out.println("Dept Number   : "+department.getDepartmentNumber());
//			System.out.println("Dept Name     : "+department.getDepartmentName());
//			System.out.println("Dept Location : "+department.getDepartmentLocation());
//			System.out.println("------------------");
//		}
		

	}

}
