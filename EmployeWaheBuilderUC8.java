package com.employeewage;
import java.util.Random;
public class EmployeWaheBuilderUC8 {
	    public static int empCheck,WAGE_PER_HOUR=20,FULL_DAY_HOUR=8,PART_TIME_HOUR=4,WagePerDay,wageForMonth=0;
	    public static int hourCounter=0,dayCounter=0,DAYS_IN_MONTH=20;

	    public static void main(String[] args) {
	        System.out.println("Welcome to Employee wage Problem");
	        empWage("Dmart",20,22,100);
	        empWage("Relience",22,24,110);
	    }
	    public static void empWage(String company,int WAGE_PER_HOUR,int DAYS_IN_MONTH,int maxHourPerMonth){
	        Random random = new Random();
	        while (hourCounter<(maxHourPerMonth+1) && dayCounter<DAYS_IN_MONTH) {
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
	        System.out.println("Total Employee Wage for company "+company+" is : "+wageForMonth);
	    }
}
