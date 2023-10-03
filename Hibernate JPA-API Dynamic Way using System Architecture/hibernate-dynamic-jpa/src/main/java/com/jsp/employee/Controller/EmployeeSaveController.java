package com.jsp.employee.Controller;

import com.jsp.employee.Dto.EmployeeDto;
import com.jsp.employee.Service.EmployeeService;

public class EmployeeSaveController {
	public static void main(String[] args) {
		EmployeeDto employeeDto= new EmployeeDto();
		employeeDto.setName("tejas");
		employeeDto.setEmail("tejas@mail.com");
		
		EmployeeService employeeService=new EmployeeService();
		employeeService.saveEmployee(employeeDto);
	}

}

/*
 
id  email           name
1	mayur@mail.com	mayur
2	pratik@mail.com	pratik
3	rohit@mail.com	rohit
4	tushar@mail.com	tushar
5	tejas@mail.com	tejas
		*/