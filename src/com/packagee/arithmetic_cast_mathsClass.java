package com.packagee;

public class arithmetic_cast_mathsClass {
    public static void main(String [] args){
        // implicit casting
        //byte > short > int > long > float > double
        System.out.println("Implicit and Explicit casting ");
        short b = 10;
        int s = b + 1;
        System.out.println(s);

        // explicit casting
        double d = 10.5;
        int i = (int) d  +5; // casting double to int
        System.out.println(i+ "\n");

        String x ="11.11";
        // converting String to double
        double y = Double.parseDouble(x)+ 10;
        System.out.println(y+ "\n");

        // arithmetic operations
        int a = 10;
        int c = 20;
        int sum = a + c; // addition
        int diff = c - a; // subtraction
        int product = a * c; // multiplication
        int quotient = c / a; // division
        int remainder = c % a; // modulus
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + diff);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder+ "\n");

        // using Math class

        int result = Math.round(15.9F);
        System.out.println("round off value 15.9  :-"+result );
        // use .ceil , .floor , .max(a,b) , .min(a,b) , .abs(a) , .pow(a,b) , .sqrt(a) , .random() etc.
        //random gives the values from 0 to 1 .

        int ans = (int) ((Math.random())*100);
        System.out.println("random value from 0 to 100  :-"+ans);
    }
}
