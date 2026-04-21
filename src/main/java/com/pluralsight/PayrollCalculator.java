package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        //Build an input system: keyboard
        Scanner keyboard = new Scanner(System.in);

      // call methods
        inputName(keyboard);

        double totalPay = getTotalPay(keyboard); //getHoursWorked + getPayRate methods called inside getTotalPay
                                                 //because they're nessecary for calculating the total pay


        //display payroll
        System.out.printf("Your total pay is $%.2f", totalPay);
    }

  //smaller methods practice
    //gather info using input system
    //get name
    public static void inputName(Scanner input){
        System.out.print("What's your name? ");
        String name = input.nextLine();
    }

    //get total hours
    public static float getHoursWorked(Scanner input){
        System.out.print("How many hours did you work? ");
        float hoursWorked = input.nextFloat();
        return hoursWorked;
    }

    //get pay rate
    public static float getPayRate(Scanner input){
        System.out.print("What's your hourly pay rate? ");
        float payRate = input.nextFloat();

        return payRate;
    }

    //calculate pay
    public static double getTotalPay(Scanner input){
        float hoursWorked = getHoursWorked(input);
        float payRate = getPayRate(input);

        //regular hours + overtime
        double regularPay = 40 * payRate;

        double overtimePay = regularPay;
        if  (hoursWorked > 40) {
            /* isolate overtime hours,
             * calculate overtime pay,
             * add overtime pay with full-time pay to get total payroll
             */
            overtimePay = ((hoursWorked - 40) * (1.5 * payRate)) + regularPay;
        }
        return overtimePay;
    }

}
