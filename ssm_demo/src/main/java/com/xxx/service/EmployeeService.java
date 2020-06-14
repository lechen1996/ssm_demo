package com.xxx.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xxx.dao.IEmployeeDao;
import com.xxx.po.Employee;

@Service
public class EmployeeService implements IEmployeeService {
	@Autowired
	private IEmployeeDao dao;

	public List<Employee> getAll() {
		List<Employee> list=this.dao.selectAll();
		return list;
	}

	public void insertEmployee(Employee employee) {
		dao.insert(employee);
		
	}

	public void update(Employee employee) {
		dao.update(employee);
		
	}

	public void delete(int id) {
		dao.delete(id);
		
	}

	public Employee editEmployee(int id) {
		return dao.editEmployee(id);
	}
	


}
