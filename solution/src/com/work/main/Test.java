package com.work.main;

import java.time.LocalDate;

import com.work.model.Employee;

public class Test {
	public static void main(String[] args) {
		
		Employee employee = new Employee("John Doe", 900, 45, LocalDate.of(2015, 5, 17)); 
		Employee employee1 = new Employee("Max Well", 1500, 40, LocalDate.of(2011, 10, 17)); 

		System.out.println(employee);
		employee.raiseSalary();
		System.out.println(employee);

		
		System.out.println(employee1);
		employee1.raiseSalary();
		System.out.println(employee1);
		
		
	}
}
