package com.xxx.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


import com.xxx.po.Employee;
import com.xxx.service.IEmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private IEmployeeService service;
	
	//查询所有员工信息
	@RequestMapping("getAllEmployee")
	public String getAllEmployee(Map<String, Object> map){
		List<Employee> list=service.getAll();
		map.put("employees", list);
		return "show";
	}
	
	//添加员工信息
	@RequestMapping("add")
	public String add(){
		return "add";
	}
	
	@RequestMapping("addEmployee")
	public String addEmployee(HttpServletRequest request,Map<String, Object> map,
			@Valid Employee employee,BindingResult bindingResult,Model model){
		//获取校验的错误信息
		if(bindingResult.getErrorCount()>0){
			FieldError ageError=bindingResult.getFieldError("age");
			FieldError nameError=bindingResult.getFieldError("name");
			FieldError sexError=bindingResult.getFieldError("sex");
			FieldError addressError=bindingResult.getFieldError("address");
			if(ageError!=null){
				String agemsg=ageError.getDefaultMessage();
				model.addAttribute("agemsg", agemsg);
			}
			if(nameError!=null){
				String namemsg=nameError.getDefaultMessage();
				model.addAttribute("namemsg", namemsg);
			}
			if(sexError!=null){
				String sexmsg=sexError.getDefaultMessage();
				model.addAttribute("sexmsg", sexmsg);
			}
			if(addressError!=null){
				String addressmsg=addressError.getDefaultMessage();
				model.addAttribute("addressmsg", addressmsg);
			}
			return "add";
		}
		int age=Integer.parseInt(request.getParameter("age"));
		String name=request.getParameter("name");
		String sex=request.getParameter("sex");
		String address=request.getParameter("address");
		Employee emp=new Employee(age,name,sex,address);
		service.insertEmployee(emp);
		List<Employee> list=service.getAll();
		map.put("employees", list);
		return "show";
	}
	
	//修改员工信息
	@RequestMapping("edieEmployee/{id}")
	public String editEmployee(@PathVariable("id") Integer id,HttpServletRequest request,Map<String, Object> map){
		Employee employee=service.editEmployee(id);
		map.put("employee", employee);
		return "edit";
	}
	
	@RequestMapping("updateEmployee/{id}")
	public String updateEmployee(@PathVariable("id") Integer id,HttpServletRequest request,Map<String, Object> map){
		int age=Integer.parseInt(request.getParameter("age"));
		String name=request.getParameter("name");
		String sex=request.getParameter("sex");
		String address=request.getParameter("address");
		Employee employee=new Employee(id,age,name,sex,address);
		service.update(employee);
		List<Employee> list=service.getAll();
		map.put("employees", list);
		return "show";
	}
	
	//删除员工信息
	@RequestMapping("deleteEmployee/{id}")
	public String deleteEmployee(@PathVariable("id") Integer id,HttpServletRequest request,Map<String, Object> map){
		service.delete(id);
		List<Employee> list=service.getAll();
		map.put("employees", list);
		return "show";
	}
	
}

