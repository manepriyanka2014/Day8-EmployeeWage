package com.employeewage;

import java.util.Random;

public class EmployeWageBuilderUC10 {

	private int numOfCompany = 0;
	private CompanyEmpWage[] companyEmpWageArray;

	public EmployeWageBuilderUC10(){
	        companyEmpWageArray=new CompanyEmpWage[5];
	    }

	private void addCompanyEmpWage(String company, int WAGE_PER_HOUR, int DAYS_IN_MONTH, int maxHourPerMonth) {
		companyEmpWageArray[numOfCompany] = new CompanyEmpWage(company, WAGE_PER_HOUR, DAYS_IN_MONTH, maxHourPerMonth);
		numOfCompany++;
	}

	private void computeEmpWage() {
		for (int i = 0; i < numOfCompany; i++) {
			companyEmpWageArray[i].setTotalEmpWage(this.computeEmpWage(companyEmpWageArray[i]));
			System.out.println(companyEmpWageArray[i]);
		}
	}

	public int computeEmpWage(CompanyEmpWage companyEmpWage) {
		Random random = new Random();
		int empHrs = 0, dayCounter = 0, totalEmpHrs = 0;
		while (empHrs <= companyEmpWage.maxHourPerMonth && dayCounter < companyEmpWage.DAYS_IN_MONTH) {
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
		return totalEmpHrs * companyEmpWage.WAGE_PER_HOUR;
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Employee wage Problem");
		EmployeWageBuilderUC10 empWageBuilder = new EmployeWageBuilderUC10();
		empWageBuilder.addCompanyEmpWage("DMart", 20, 22, 100);
		empWageBuilder.addCompanyEmpWage("Relience", 22, 24, 110);
		empWageBuilder.computeEmpWage();

	}

}
