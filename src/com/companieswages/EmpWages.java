package com.companieswages;

public class EmpWages {
	public static void empdata(int fulltime, int parttime) {
		final int wagesperhrs = 20;
		int empHours = 0, ftempHours = 16, ptempHours = 8;
		// number for 0 for absent 1 for present
		int empCheck = (int) Math.floor(Math.random() * 10) % 2;
		// System.out.println(empCheck);

		switch (empCheck) {
		case 0:
			System.out.println("Employee Wage is " + wagesperhrs * empHours);// Employee absent
			break;
		case 1:
			System.out.println("Employee Wage is " + wagesperhrs * ptempHours);// Employee Parttime present
			break;
		default:
			System.out.println("Employee Wage is " + wagesperhrs * ftempHours);// Employee Fulltime present
			break;
		}
	}

	public static void main(String[] args) {
		int parttime = 1, fulltime = 2;
		// declaring constants
		empdata(parttime, fulltime);
	}
}
