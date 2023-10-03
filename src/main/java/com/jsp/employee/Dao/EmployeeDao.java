package com.jsp.employee.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.employee.Dto.EmployeeDto;

public class EmployeeDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("tushar");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	
	//save/insert  employee data 
	public EmployeeDto saveEmployee(EmployeeDto employeeDto) {
		employeeDto.getId();
		employeeDto.getName();
		employeeDto.getEmail();

		entityTransaction.begin();
		entityManager.persist(employeeDto);	//save data
		entityTransaction.commit();
		return employeeDto;

	}

//==========================//=======================//======================//=================	
	//delete  employee data 
	public boolean deleteEmployeeById(int id) {
		EmployeeDto employeeDto = entityManager.find(EmployeeDto.class, id); //1st find data

		if (employeeDto != null) {
			entityTransaction.begin();
			entityManager.remove(employeeDto);	//remove data
			entityTransaction.commit();

		}
		return false;
	}

//==========================//=======================//======================//=================	
	//update name in employee data 
	public void updateEmployee(int id, String name) {
		EmployeeDto employeeDto = entityManager.find(EmployeeDto.class, id);

		employeeDto.setName(name);

		if (employeeDto != null) {
			entityTransaction.begin();
			entityManager.merge(employeeDto);	//update data
			entityTransaction.commit();
		}
	}
	
	
//==========================//=======================//======================//=================	
		//update email in employee data 
		public void updateEmployee1(int id, String email) {
			EmployeeDto employeeDto = entityManager.find(EmployeeDto.class, id);

			employeeDto.setEmail(email);

			if (employeeDto != null) {
				entityTransaction.begin();
				entityManager.merge(employeeDto);	//update data
				entityTransaction.commit();
			}
		}

//==========================//=======================//======================//=================		
	//select one data by id in employee data 
	public void getById(int id) {
		EmployeeDto employeeDto = entityManager.find(EmployeeDto.class, id);

		System.out.println(employeeDto.getId());
		System.out.println(employeeDto.getName());
		System.out.println(employeeDto.getEmail());

	}

//==========================//=======================//======================//=================	
	//select all data by id in employee data 
//	public EmployeeDto getAll(EmployeeDto employeeDto) {
//		String sql = "SELECT e FROM EmployeeDto e";
//
//		Query query = entityManager.createQuery(sql);
//		
//	List<EmployeeDto> employeeDtos=	query.getResultList();
//	for(EmployeeDto e: employeeDtos) {
//		System.out.println(e.getId());
//		System.out.println(e.getName());
//		System.out.println(e.getEmail());
//		System.out.println("============================");
//		
//	}
//	return employeeDto;
//	}
	
	
	
	//sir
	public List<EmployeeDto> getAllEmployee(EmployeeDto employeeDto){
		String sql="SELECT e FROM EmployeeDto e";
		Query query=	entityManager.createQuery(sql);
		
		List<EmployeeDto> employeeDtos=query.getResultList();
		for(EmployeeDto e:employeeDtos) {
		System.out.println(e.getId());
		System.out.println(e.getName());
		System.out.println(e.getEmail());
		System.out.println("============================");
		}
		return employeeDtos;
		
	}

}
