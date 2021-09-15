package com.bridgelabz;

import java.util.Random;

public class EmployeeWageProblem {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee wage Problem");
        Random random = new Random();
        int empCheck,IS_PRESENT=1,IS_ABSENT=0;
        empCheck=random.nextInt(2);

        if (empCheck == IS_PRESENT)
            System.out.println("Employee is Present");
        else
            System.out.println("Employee is absent");
    }
}
