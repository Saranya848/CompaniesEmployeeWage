package com.companieswages;

import java.util.*;

public class EmpWages {
	final int wagesperhrs, workinghours, workingday;

	public EmpWages(int wagesperhrs, int workinghours, int workingday) {
		this.wagesperhrs = wagesperhrs;
		this.workinghours = workinghours;
		this.workingday = workingday;
	}

	public void empdata() {
		int empHours = 0, dailywages = 0, monthlyWage = 0;

		// looping for n working days
		int totalempHrs = 0, totalWage = 0;
		int totalworkingdays = 0;
		int workinghours = 100;

		while (totalempHrs <= workinghours && totalworkingdays <= workingday) {
			totalworkingdays++;
			// number for 0 for absent 1 for present
			int empCheck = (int) Math.floor(Math.random() * 10) % 2;
			// Switch to check employee is working full time, part time or absent
			switch (empCheck) {
			case 0:
				empHours = 0;// Employee absent
				break;
			case 1:
				empHours = 4;// Employee Parttime present
				break;
			default:
				empHours = 8;// Employee Fulltime present
				break;
			}
			// Calculating Daily Wages, Monthly Wages of employee

			dailywages = wagesperhrs * empHours;
			monthlyWage = monthlyWage + dailywages;
			// Total Hour calculation
			totalempHrs = totalempHrs + empHours;
		}
		System.out.println("Employee dailywages is " + dailywages + ", Monthly wages is " + monthlyWage);
		System.out.println("Employee total Salary" + totalWage + " and total Hours is " + totalempHrs);
	}

	public static void main(String[] args) {

		// declaring constants
		Scanner sc = new Scanner(System.in);
			System.out.println("Enter Rate per hour value:");
			int wagesperhrs = sc.nextInt();
			System.out.println("Enter Working Days value:");
			int workinghours = sc.nextInt();
			System.out.println("Enter Max Allowed working hours value:");
			int workingday = sc.nextInt();
			sc.close();
			EmpWages company = new EmpWages(wagesperhrs, workinghours, workingday); // Object
			company.empdata();
	}
}