package com.xxx.dao;

import java.util.List;

import com.xxx.po.Employee;


public interface IEmployeeDao {
	public List<Employee> selectAll();
	public void insert(Employee employee);
	public void update(Employee employee);
	public void delete(int id);
	public Employee editEmployee(int id);
}
