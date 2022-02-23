package com.fourcolors.dao;

import java.util.List;

//Create Read/ReadAll Update Delete

public interface DepartmentDAO { //2. POJO crud interface
	void 			  insertDepartment(Department deptObj);
	Department  	  selectDepartment(int deptNumber);
	List<Department>  selectDepartments();
	void updateDepartment(Department deptObj);
	void deleteDepartment(int deptNumber);
}
