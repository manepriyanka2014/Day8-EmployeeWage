package com.employeewage;

public class EmployeWageBuilder {
		public static void main(String[] args) {
			int IS_FULL_TIME = 2;
			double empCheck = Math.floor(Math.random() * 10) % 2;
			if (empCheck == IS_FULL_TIME)
				System.out.println("Employee is Present");
			else
				System.out.println("Employee is Absent");
		}
	}


