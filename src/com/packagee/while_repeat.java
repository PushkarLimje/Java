package com.packagee;

import java.util.Scanner;

public class while_repeat {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        String input = "";
//        while (!input.equals("exit")) {
//            System.out.print("Enter a command (type 'exit' to quit): ");
//            input = scanner.nextLine();
//            if (!input.equals("exit")) {
//                System.out.println("You entered: " + input.toLowerCase());
//            }

        while (true) {
            System.out.print("Enter a command (type 'exit' to quit): ");
            input = scanner.nextLine().toLowerCase();
            if (input.equals("pass"))
                continue; // Skip the rest of the loop if input is "pass"

            if (input.equals("exit")) {
                System.out.println("Exiting the program.");
                break;
            }
            System.out.println("You entered: " + input.toLowerCase());
        }
    }
}
