package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        //Build an input system: keyboard
        Scanner keyboard = new Scanner(System.in);

        //gather info using input system
        System.out.println("What's your name? ");
        String name = keyboard.nextLine();

        System.out.println("How many hours did you work? ");
        float hoursWorked = keyboard.nextFloat();

        System.out.println("What's your hourly pay rate? ");
        float payRate = keyboard.nextFloat();

        //calculate pay: regular hours + overtime
        double regularPay = 40 * payRate;

        double overtimePay = regularPay;
        if  (hoursWorked > 40) {
            /* isolate overtime hours,
             * calculate overtime pay,
             * add overtime pay with full-time pay to get total payroll
             */
            overtimePay = ((hoursWorked - 40) * (1.5 * payRate)) + regularPay;
        }

        //display payroll
        System.out.println("Your total pay is $" + overtimePay);
    }
}
