package com.employeewage;
public class EmployeeWage {
	
	    //variables
	    public String companyName;
	    public int max_working_hrs;
	    public int days_in_month;
	    public int wage_per_hr;
	    public int totalWage;

	    public EmployeeWage(String companyName, int max_working_hrs, int days_in_month, int wage_per_hr) {
	        // Assigning/setting parameters to varaible
	        this.companyName = companyName;
	        this.max_working_hrs = max_working_hrs;
	        this.days_in_month = days_in_month;
	        this.wage_per_hr = wage_per_hr;
	        totalWage = 0;
	    }

	    public void setTotalWage(int totalWage) {
	        this.totalWage = totalWage;
	    }

	    @Override
	    public String toString() {
	        return "Monthly wage for " + companyName + " is " + totalWage;
	    }
	}
