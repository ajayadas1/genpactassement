package com.org.gen.hand28;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the number of Employees :");
			int x=Integer.parseInt(br.readLine());
			Employee[] elist = new Employee[x];
			for(int i=0;i<x;i++)
			{
				int id=i+1;
				System.out.println("Enter the player name :");
				String name=br.readLine();
				System.out.println("Enter the player department :");
				String department=br.readLine();
				System.out.println("Enter the player age :");
				int age=Integer.parseInt(br.readLine());
				System.out.println("Enter the player salary :");
				int salary=Integer.parseInt(br.readLine());
				elist[i]=new Employee(id,name,department,age,salary);
				EmployeeBO ebo = new EmployeeBO();
				ebo.displayAllEmployeedetails(elist);
			}
		}
		catch(Exception e){}
	}

}
