package com.companieswages;

import java.util.*;

class EmpWageBuilder {
	ArrayList<Integer> Wage = new ArrayList<Integer>();
	ArrayList<String> Wages = new ArrayList<String>();

	@Override
	public String toString() {
		return "EmpWageBuilder [Wage=" + Wage + ", Wages=" + Wages + "]";
	}
	//method to calculate employee wage
	void check() {
		
		int totalsalary = 0;
		int totalEmpHr = 0;
		int totalWorkingDays = 0;
		int empHrs = 0;
		int finalsalary = 0;

		System.out.println("enter company name ");

		Scanner sc = new Scanner(System.in);
		String Companyname = sc.nextLine();
		sc.nextLine();
		Wages.add(Companyname);

			System.out.println("Enter Rate per hour");
			int wagesperhrs = sc.nextInt();
			System.out.println("Enter Working Days");
			int workinghours = sc.nextInt();
			System.out.println("Enter Max Allowed working hours");
			int workingday = sc.nextInt();

		while (totalEmpHr <= workinghours && totalWorkingDays <= workingday) {
			totalWorkingDays++;
			double randomCheck = Math.floor(Math.random() * 10) % 3;
			int i = (int) randomCheck;
			switch (i) {
			case 2:
				// System.out.println("Employee is FullTime");
				empHrs = 8;
				break;
			case 1:
				// System.out.println("Employee is PartTime");
				empHrs = 4;
				break;
			case 0:
				// System.out.println("Employee is Absent");
				empHrs = 0;
				break;
			}

			totalEmpHr = totalEmpHr + empHrs;

		}
		//Total Salary in a month
		totalsalary = totalEmpHr * wagesperhrs;
		finalsalary += totalsalary;

		Wage.add(finalsalary);
		System.out.println(Wages);
		System.out.println(Wage);
		sc.close();
	}

}

public class CompanyEmpWage {

	public static void main(String[] args) {
		EmpWageBuilder ewb = new EmpWageBuilder();
		System.out.println("Enter no. of companies");

		Scanner no = new Scanner(System.in);
		no.toString();
		int noOfCompanys = no.nextInt();

		for (int i = 1; i <= noOfCompanys; i++) {

			ewb.check();

		}
		no.close();
	}

}
