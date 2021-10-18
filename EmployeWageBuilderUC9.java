package com.employeewage;

import java.util.Random;

public class EmployeWageBuilderUC9 {

	public static final int PART_TIME_HOUR = 2;
	public static final int FULL_DAY_HOUR = 1;

	private final String company;
	private final int WAGE_PER_HOUR;
	private final int DAYS_IN_MONTH;
	private final int maxHourPerMonth;
	private int wageForMonth;

	public static void main(String[] args) {
		System.out.println("Welcome to Employee wage Problem");
		EmployeWageBuilderUC9 DMart = new EmployeWageBuilderUC9("DMart", 20, 22, 100);
		EmployeWageBuilderUC9 Relience = new EmployeWageBuilderUC9("Relience", 22, 24, 110);
		DMart.empWage();
		System.out.println(DMart);
		Relience.empWage();
		System.out.println(Relience);

	}

	public EmployeWageBuilderUC9(String company, int WAGE_PER_HOUR, int DAYS_IN_MONTH, int maxHourPerMonth) {
		this.company = company;
		this.WAGE_PER_HOUR = WAGE_PER_HOUR;
		this.DAYS_IN_MONTH = DAYS_IN_MONTH;
		this.maxHourPerMonth = maxHourPerMonth;
	}

	public void empWage() {
		Random random = new Random();
		int empHrs = 0, dayCounter = 0, totalEmpHrs = 0;
		while (empHrs <= maxHourPerMonth && dayCounter < DAYS_IN_MONTH) {
			dayCounter++;
			int empCheck = random.nextInt(3);
			switch (empCheck) {
			case 1:
				empHrs = 8;
				break;
			case 2:
				empHrs = 4;
				break;
			default:
				empHrs = 0;
			}
			totalEmpHrs += empHrs;
		}
		wageForMonth = totalEmpHrs * WAGE_PER_HOUR;
	}

	@Override
	public String toString() {
		return "Empolyee wages for " + company + " is :" + wageForMonth;
	}
}
