package com.packagee;

import java.util.Scanner;

public class LogicalOperators_if_switch {
    public static void main(String [] ars) {



        // Logical Operators in Java

        // && -> and , || -> or ! -> not operators

        System.out.println("Logical Operators in Java");
        boolean isTrue = true;
        boolean isFalse = false;
        System.out.println("NOT Logical Operators of isTrue  :" + !isTrue);

        // if else statement in Java

        System.out.println("\nIf else statement example");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a temperature   : ");
        int temperature = scanner.nextInt();
        if (temperature > 30) {
            System.out.println("It's is to hot day");
            System.out.println("Drink plenty of water");
        } else if (temperature > 20 && temperature < 30){
            System.out.println("It's a nice day");
        }else {
            System.out.println("It's a cold day");
            System.out.println("Wear a jacket");
        }

        // switch statement in Java

        System.out.println("\nSwitch statement example");
        System.out.print("Enter the name of the day     :");
        String day = scanner.next();
        switch (day) {
            case "monday":
                System.out.println("Monday is the first day of the week");
                break;
            case "tuesday":
                System.out.println("Tuesday is lovely day");
                break;
            case "wednesday":
                System.out.println("Wednesday is the middle of the week");
                break;
            case "thursday":
                System.out.println("Thursday is almost weekend");
                break;
            case "friday":
                System.out.println("Friday is the last working day of the week");
                break;
            case "saturday":
                System.out.println("Saturday is the 1st day of the weekend");
                break;
            case "sunday":
                System.out.println("Sunday is the best weekend day and last day of the week");
                break;
            default:
                System.out.println("Invalid day! Please enter a valid day name next time .");
        }
    }
}
