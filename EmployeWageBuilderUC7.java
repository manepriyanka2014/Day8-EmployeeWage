package com.employeewage;
import java.util.Random;
public class EmployeWageBuilderUC7 {
			public static int empCheck,WAGE_PER_HOUR=20,FULL_DAY_HOUR=8,PART_TIME_HOUR=4,WagePerDay,wageForMonth=0;
		    public static int hourCounter=0,dayCounter=0,DAYS_IN_MONTH=20;

		    public static void main(String[] args) {
		        System.out.println("Welcome to Employee wage Problem");
		        empWage();
		    }
		    public static void empWage(){
		        Random random = new Random();
		        while (hourCounter<101 && dayCounter<DAYS_IN_MONTH) {
		            empCheck = random.nextInt(3);
		            switch (empCheck) {
		                case 1:
		                    WagePerDay = FULL_DAY_HOUR * WAGE_PER_HOUR;
		                    hourCounter += FULL_DAY_HOUR;
		                    break;
		                case 2:
		                    WagePerDay = PART_TIME_HOUR * WAGE_PER_HOUR;
		                    hourCounter += PART_TIME_HOUR;
		                    break;
		                case 0:
		                    WagePerDay = 0;
		                    break;
		                default:
		                    throw new IllegalStateException("Unexpected value: " + empCheck);
		            }
		            wageForMonth += WagePerDay;
		            dayCounter++;
		        }
		        System.out.println("Total Employee Wage : "+wageForMonth);
		  }
}






