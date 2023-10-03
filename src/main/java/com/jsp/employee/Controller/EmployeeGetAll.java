package com.jsp.employee.Controller;

import com.jsp.employee.Dto.EmployeeDto;
import com.jsp.employee.Service.EmployeeService;

public class EmployeeGetAll {
	

//	public static void main(String[] args) {
//		EmployeeDto employeeDto = new EmployeeDto();
//		EmployeeService employeeService=new EmployeeService();
//		employeeService.getAll(employeeDto);
//	}

	//or sir
	public static void main(String[] args) {
		EmployeeDto employeeDto = new EmployeeDto();
		EmployeeService employeeService=new EmployeeService();
		employeeService.getAllEmployee(employeeDto);
	}
}














/*
1
Virat
mayur@mail.com
============================
2
pratik
pratik@mail.com
============================
3
rohit
rohit@mail.com
============================
5
tejas
tejas@mail.com
============================
*/