package com.companieswages;

public class EmpWages {
	public static void empdata(int fulltime, int parttime) {
		final int wagesperhrs = 20;
		int empHours = 0;
		// number for 0 for absent 1 for present
		int empCheck = (int) Math.floor(Math.random() * 10) % 2;
		// System.out.println(empCheck);

		// if condition to check employee is working full time, part time or absent
		if (empCheck == fulltime)
			empHours = 8;
		else if (empCheck == parttime)
			empHours = 4;
		else
			empHours = 0;
		// Calculating daily wages
		int dailywages = wagesperhrs * empHours;
		System.out.println("Employee Wage is " + dailywages);

	}

	public static void main(String[] args) {
		int parttime = 1, fulltime = 2;
		// declaring constants
		empdata(parttime, fulltime);
	}
}
