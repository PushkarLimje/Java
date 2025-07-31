package com.packagee;

import java.util.Scanner;

public class fizzBuzz_div_3_5 {
    public static void main (String [] args){

        // fizzBuzz program in Java

        System.out.println("FizzBuzz Program in Java\n");
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Enter a number to check fizzbuzz (enter 0 to exit): ");
            int number = scanner.nextInt();


            if(number < 0) {
                System.out.println("Please enter a non-negative number.");
                continue; // Skip the rest of the loop if input is negative
            }
            if(number == 0) {
                System.out.println("Exiting the program.");
                break; // Exit the loop if the input is 0
            }
            // Check divisibility by 3 and 5
            if (number % 3 == 0 && number % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (number % 3 == 0) {
                System.out.println("Buzz");
            } else if (number % 5 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(number);
            }
            System.out.println(); // Print a new line for better readability
        }
    }
}
