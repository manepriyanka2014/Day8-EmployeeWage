package com.employeewage;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class EmployeWageBuilderUC13 implements EmpWageInterface {
	// constants
	public static final int IS_FUllTime = 1;
	public static final int IS_PARTTIME = 2;
	public static final int IS_ABSENT = 0;

	private int numOfCompany = 0;

	// Defining and initialising ArrayList
	private List<EmployeeWage> employeeWageArray;

	public EmployeWageBuilderUC13() {
		employeeWageArray = new ArrayList<EmployeeWage>();
	}

	@Override
	public void addCompanyWage(String companyName, int max_working_hrs, int days_in_month, int wage_per_hr) {
		// employeeWageArray[numOfCompany] = new EmployeeWage(companyName,
		// max_working_hrs, days_in_month, wage_per_hr);
		EmployeeWage employeeWage = new EmployeeWage(companyName, max_working_hrs, days_in_month, wage_per_hr);
		// numOfCompany++;
		employeeWageArray.add(employeeWage);

	}

	@Override
    public void computeEmpWage() {
        for (int i = 0; i < employeeWageArray.size(); i++) {
            //employeeWageArray[i].setTotalWage(this.computeEmpWage(employeeWageArray[i]));
            //System.out.println(employeeWageArray[i]);
            EmployeeWage employeeWage = employeeWageArray.get(i);
            employeeWage.setTotalWage(computeEmpWage(employeeWage));
            System.out.println(employeeWage);
        }
    }

	private int computeEmpWage(EmployeeWage employeeWage) {
        int working_hr = 0;
        int total_working_hr = 0;
        int monthly_total_wage = 0;
        int daily_wage_array[] = new int[employeeWage.days_in_month];
        int days = 0;
        while (days < employeeWage.days_in_month && total_working_hr < employeeWage.max_working_hrs) {
            int emp_check = (int) (Math.floor(Math.random() * 10)) % 3;
            switch (emp_check) {
                case IS_FUllTime -> {
                    working_hr = 8;
                }
                case IS_PARTTIME -> {
                    working_hr = 4;
                }
                case IS_ABSENT -> {
                    working_hr = 0;
                }
            }
            total_working_hr += working_hr;
            daily_wage_array[days] = working_hr * employeeWage.wage_per_hr;
            days++;
        }
        for (int j = 0; j < employeeWage.days_in_month; j++) {
            int day = j + 1;
            monthly_total_wage = monthly_total_wage + daily_wage_array[j];
        }

        return monthly_total_wage;
    }

    public static void main(String[] args) {
        // creating object
    	EmployeWageBuilderUC13 employeeWageBuilder = new EmployeWageBuilderUC13();
        // calling from main
    	EmployeWageBuilderUC13.addCompanyWage("DMart", 100, 20, 100);
    	EmployeWageBuilderUC13.addCompanyWage("Reliance", 150, 25, 110);
    	EmployeWageBuilderUC13.computeEmpWage();
    }
}
}
