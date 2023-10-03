package com.jsp.employee.Controller;

import com.jsp.employee.Service.EmployeeService;

public class EmployeeUpdateEmail {

	public static void main(String[] args) {
		EmployeeService employeeService=new EmployeeService();
		employeeService.updateEmployee1(1, "virat@mail.com");	//email updated mayur@mail.com>>virat@mail.com

	}
}


/*

1	virat@mail.com	Virat
2	pratik@mail.com	pratik
3	rohit@mail.com	rohit
5	tejas@mail.com	tejas

*/