package com.org.gen.hand28;

public class Employee {
	private int id;
	private String name;
	private String department;
	private int age;
	private int salary;
	

	public Employee(int id, String name, String department, int age, int salary) {
		super();
		this.id=id;
		this.name=name;
		this.department=department;
		this.age=age;
		this.salary=salary;
	}
	public int getId()
	{
		return id;
	}
	public void setId()
	{
		this.id=id;
	}
	public String getName()
	{
		return name;
	}
	public void setName()
	{
		this.name=name;
	}
	public String getDepartment()
	{
		return department;
	}
	public void setDepartment()
	{
		this.department=department;
	}
	public int getAge()
	{
		return age;
	}
	public void setAge()
	{
		this.age=age;
	}
	public int getSalary()
	{
		return salary;
	}
	public void setSalary()
	{
		this.salary=salary;
	}
	@Override
	public String toString()
	{
		String str=String.format("%-15s %-30s %-30s %-10s %-10s\n", id,name,department,age,salary);
		return str;
	}
}
