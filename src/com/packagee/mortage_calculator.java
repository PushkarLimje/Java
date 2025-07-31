package com.packagee;

import java.text.NumberFormat;
import java.util.Scanner;

public class mortage_calculator {
    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);

    while(true) {
        System.out.println("enter any number to calculate mortgage (enter 0 to exit): ");
        int input = scanner.nextInt();
        if (input == 0){
            System.out.println("Exiting the program.");
            break; // Exit the loop if the input is 0
        }

        final int percent = 100; // Constant for percentage conversion
        final int monthsInYear = 12; // Constant for number of months in a year


        System.out.print("Enter the principal amount (1k to 1M): ");
        double principal = scanner.nextDouble();
        if (principal<1000 || principal>1000000) {
            System.out.println("Principal amount must be between 1,000 and 1,000,000.");
            continue; // Skip to the next iteration if the input is invalid
        }

        System.out.print("Enter the annual interest rate (in percentage): ");
        double annualInterestRate = scanner.nextDouble();
        double monthlyInterestRate = annualInterestRate / percent / monthsInYear; // Convert annual rate to monthly and percentage to decimal
        System.out.print("Enter the number of months for the loan: ");
        int months = scanner.nextInt();


        // Convert annual interest rate to monthly and percentage to decimal
        double mortage = (principal * monthlyInterestRate * (Math.pow((1 + monthlyInterestRate), months))) / (Math.pow(1 + monthlyInterestRate, months) - 1);
        System.out.println("Monthly Payment: " + NumberFormat.getCurrencyInstance().format(mortage));
        System.out.println();
    }

    }

}
