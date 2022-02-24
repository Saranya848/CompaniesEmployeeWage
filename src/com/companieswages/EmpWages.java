package com.companieswages;

public class EmpWages {
	public static void empdata(int fulltime, int parttime) {
		final int wagesperhrs = 20;
		int empHours = 0, ftempHours = 16, ptempHours = 8;
		// number for 0 for absent 1 for present
		int empCheck = (int) Math.floor(Math.random() * 10) % 2;
		// System.out.println(empCheck);

		// if condition to check employee is working full time, part time or absent
		if (empCheck == fulltime)
			System.out.println("Employee Wage is " + wagesperhrs * ftempHours);
		else if (empCheck == parttime)

			// Calculating daily wages for part time
			System.out.println("Employee Wage is " + wagesperhrs * ptempHours);
		else
			System.out.println("Employee Wage is " + wagesperhrs * empHours);

	}

	public static void main(String[] args) {
		int parttime = 1, fulltime = 2;
		// declaring constants
		empdata(parttime, fulltime);
	}
}
