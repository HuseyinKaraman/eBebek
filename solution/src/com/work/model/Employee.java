package com.work.model;

import java.time.LocalDate;
import java.time.Period;

public class Employee {

	private String name;
	private double salary;
	private int workHours;
	private LocalDate hireYear;

	private double totalSalary;
	private double taxFee;
	private double extraFee;
	private double raise;

	public Employee(String name, double salary, int workHours, LocalDate hireYear) {
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;

		this.totalSalary = 0;
	}

	public double tax() {
		return this.taxFee = this.salary >= 1000 ? ((this.salary * 3) / 100) : 0;
	}

	public double bonus() {
		return this.extraFee = this.workHours > 40 ? ((this.workHours - 40) * 30) : 0;
	}

	public double raiseSalary() {
		LocalDate currentDate = LocalDate.of(2021, 1, 1);
		Period period = Period.between(this.hireYear, currentDate);
		int passYear = period.getYears();

		this.extraFee = this.bonus();
		this.taxFee = this.tax();

		if (passYear < 10) {
			raise += (this.salary * 5 / 100);
		} else if (passYear > 9 && passYear < 20) {
			raise += (this.salary * 10 / 100);
		} else if (passYear > 19) {
			raise += (this.salary * 15 / 100);
		}
		this.salary += raise;

		return totalSalary = this.salary + this.extraFee - this.taxFee;
	}

	@Override
	public String toString() {
		return this.totalSalary != 0
				? "Employee [name=" + name + ", salary=" + salary + ", workHours=" + workHours + ", hireYear="
						+ hireYear + ", total Salary= " + this.totalSalary + ", tax=" + this.taxFee + ", bonus="
						+ this.extraFee + ", raise= " + raise + " ]"
				: "Employee [name=" + name + ", salary=" + salary + ", workHours=" + workHours + ", hireYear="
						+ hireYear;
	}

}
