package com.jsp.employee.Service;

import java.util.List;

import com.jsp.employee.Dao.EmployeeDao;
import com.jsp.employee.Dto.EmployeeDto;

public class EmployeeService {
	
	EmployeeDao employeeDao=new EmployeeDao();
	
	//save/insert  employee data
	public EmployeeDto saveEmployee(EmployeeDto employeeDto) {
		return employeeDao.saveEmployee(employeeDto);
	}
	
	//delete  employee data 
	public boolean deleteEmployeeById(int id) {
		return employeeDao.deleteEmployeeById(id);
	}
	
	//update name data in employee data 
	public void updateEmployee(int id,String name) {
		employeeDao.updateEmployee(id, name); 
	}
	
	//update email data in employee data 
	public void updateEmployee1(int id, String email) {
		employeeDao.updateEmployee1(id, email);
	}
	
	//select one data by id in employee data 
	public void getById(int id) {
		employeeDao.getById(id);
	}
	
//	//select all data by id in employee data 
//	public EmployeeDto getAll(EmployeeDto employeeDto) {
//		return employeeDao.getAll(employeeDto);
//		
//	}

	//select all data by id in employee data (sir)
	public List<EmployeeDto> getAllEmployee(EmployeeDto employeeDto){
		return employeeDao.getAllEmployee(employeeDto);
	}
}
