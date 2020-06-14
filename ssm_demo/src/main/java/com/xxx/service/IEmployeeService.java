package com.xxx.service;

import java.util.List;

import com.xxx.po.Employee;

public interface IEmployeeService {
	public List<Employee> getAll();
	public void insertEmployee(Employee employee);
	public void update(Employee employee);
	public void delete(int id);
	public Employee editEmployee(int id);
}
