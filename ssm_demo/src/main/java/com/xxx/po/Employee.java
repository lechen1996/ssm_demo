package com.xxx.po;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class Employee {
	private int id;
	@Max(value=100,message="最大年龄不超过100")
	@Min(value=20,message="最小年龄不低于20")
	private int age;
	@NotEmpty(message="员工姓名不能为空")
	@Size(min=2,max=4,message="用户名长度为{min}-{max}之间")
	private String name;
	@Pattern(regexp="[男|女]",message="性别输入有误")
	private String sex;
	@NotEmpty(message="员工住址不能为空")
	@Size(min=2,max=10,message="住址长度在{min}-{max}之间")
	private String address;
	public Employee(int id, int age, String name, String sex, String address) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
		this.sex = sex;
		this.address = address;
	}
	
	public Employee(int age, String name, String sex, String address) {
		super();
		this.age = age;
		this.name = name;
		this.sex = sex;
		this.address = address;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
