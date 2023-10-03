package com.jsp.employee.Controller;

import com.jsp.employee.Service.EmployeeService;

public class EmployeeDeleteById {

	public static void main(String[] args) {
		EmployeeService employeeService=new EmployeeService();
		employeeService.deleteEmployeeById(4);

	}
}

/*

id  email           name
1	mayur@mail.com	mayur
2	pratik@mail.com	pratik
3	rohit@mail.com	rohit
5	tejas@mail.com	tejas
*/