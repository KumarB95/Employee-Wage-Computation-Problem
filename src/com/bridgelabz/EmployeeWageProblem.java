package com.bridgelabz;

import java.util.Random;

public class EmployeeWageProblem {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee wage Problem");
        Random random = new Random();
        int empCheck,IS_PRESENT=1,IS_ABSENT=0,WAGE_PER_HOUR=20,FULL_DAY_HOUR=8,WagePerDay;
        empCheck=random.nextInt(2);

        if (empCheck == IS_PRESENT){
            WagePerDay=FULL_DAY_HOUR*WAGE_PER_HOUR;
            System.out.println("Employee is Present and Wages per day : "+ WagePerDay+" Rs.");}
        else{
            System.out.println("Employee is absent wage for the day is Rs. 0");}
    }
}
