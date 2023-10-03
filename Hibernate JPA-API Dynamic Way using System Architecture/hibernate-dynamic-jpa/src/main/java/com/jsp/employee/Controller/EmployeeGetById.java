package com.jsp.employee.Controller;

import com.jsp.employee.Service.EmployeeService;

public class EmployeeGetById {

	public static void main(String[] args) {
		EmployeeService employeeService=new EmployeeService();
		employeeService.getById(3);

	}

}

/*
3
rohit
rohit@mail.com
*/