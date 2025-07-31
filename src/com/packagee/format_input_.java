package com.packagee;

import java.text.NumberFormat;
import java.util.Scanner;

public class format_input_ {
    public static void main(String [] args){

        // Formatting numbers and currencies in Java


        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(1234567.89);
        System.out.println("Formatted Currency: " + result );

        NumberFormat percent = NumberFormat.getPercentInstance();
        String percentResult = percent.format(0.85);
        System.out.println("percent "+percentResult);

        String ans = NumberFormat.getCompactNumberInstance().format(1026);
        System.out.println("Subscribers : "+ans);

        // using Scanner as an taking input from user


        System.out.println("Enter your name ,Age and salary: ");

        Scanner s = new Scanner(System.in);
        String Fullname = s.nextLine(); // next take word while nextLine takes whole line
        int numb =  s.nextInt();
        double salary = s.nextDouble();
        System.out.println("Name: " + Fullname + "\n" +
                "Age: " + numb + "\n" +
                "Salary: " + NumberFormat.getCurrencyInstance().format(salary));
    }
}
