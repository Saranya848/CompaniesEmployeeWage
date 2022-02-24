package com.companieswages;

public class EmpWages {
	private void empprn() {
		// number for 0 for absent 1 for present
		int empCheck = (int) Math.floor(Math.random() * 10) % 3;
		// System.out.println(empCheck);

		// if condition to check employee is absent for 0
		if (empCheck == 0) {
			System.out.println("Employee is Absent");
		}

		// else condition to check employee is present for 1
		else
			System.out.println("Employee is Present");
	}

	public static void main(String[] args) {
		EmpWages ew = new EmpWages();
		// declaring constants
		ew.empprn();
	}

}
