package com.jsp.employee.Controller;

import com.jsp.employee.Service.EmployeeService;

public class EmployeeUpdate {
	public static void main(String[] args) {
		EmployeeService employeeService=new EmployeeService();
		employeeService.updateEmployee(1, "Virat");	//name updated mayur>>Virat
	}

}

/*

id  email           name
1	mayur@mail.com	Virat
2	pratik@mail.com	pratik
3	rohit@mail.com	rohit
5	tejas@mail.com	tejas
*/