package com.employeewage;
import java.util.Random;
public class EmployeWageBuilderUC5 {
	
		    public static void main(String[] args) {
	        System.out.println("Welcome to Employee wage Problem");
	        Random random = new Random();
	        int empCheck,IS_PRESENT=1,IS_ABSENT=0,IS_PART_TIME=2,WAGE_PER_HOUR=20,FULL_DAY_HOUR=8,PART_TIME_HOUR=4,WagePerDay,wageForMonth=0;


	        /*    if (empCheck == IS_PRESENT){
	                WagePerDay=FULL_DAY_HOUR*WAGE_PER_HOUR;
	                System.out.println("Employee is Present and Wages per day : "+ WagePerDay+" Rs.");}
	            else if (empCheck == 2){WagePerDay=PART_TIME_HOUR*WAGE_PER_HOUR;
	                System.out.println("Employee is Present for Half day and Wages per day : "+ WagePerDay+" Rs.");}
	            else{
	                System.out.println("Employee is absent wage for the day is Rs. 0");}
	       */
	        for (int i=1; i<=20;i++){
	            empCheck=random.nextInt(3);
	            switch (empCheck) {
	                case 1:
	                    WagePerDay = FULL_DAY_HOUR * WAGE_PER_HOUR;
	                   // System.out.println("Employee is Present and Wages per day : " + WagePerDay + " Rs.");
	                    break;
	                case 2:
	                    WagePerDay = PART_TIME_HOUR * WAGE_PER_HOUR;
	                   // System.out.println("Employee is Present for Half day and Wages per day : " + WagePerDay + " Rs.");
	                    break;
	                case 0:
	                    WagePerDay=0;
	                   // System.out.println("Employee is absent wage for the day is Rs. 0");
	                    break;
	                default:
	                    throw new IllegalStateException("Unexpected value: " + empCheck);
	            }
	            //System.out.println("Day : "+i+" ; Wage of the day : "+WagePerDay+" ; Wage till now : "+(wageForMonth+=WagePerDay));
	            wageForMonth+=WagePerDay;
	        }
	        System.out.println("Wage for Month (20 days) : "+wageForMonth);
	    }
}