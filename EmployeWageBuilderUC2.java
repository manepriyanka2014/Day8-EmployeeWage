package com.employeewage;

public class EmployeWageBuilderUC2 {
		public static void main(String[] args)// Constant
		{
			int IS_FULL_TIME = 1;
			int EMP_RATE_PER_HOUR = 20;
			// Variables
			int empHrs = 0;
			int empWage = 0;
			// Computation
			double empCheck = Math.floor(Math.random() * 10) % 2;
			if (empCheck == IS_FULL_TIME)
				empHrs = 8;
			else
				empHrs = 5;
			empWage = empHrs * EMP_RATE_PER_HOUR;
			System.out.println("Emp Wage:" + empWage);
		}
}



