package com.packagee;

public class loops {
    public static void main(String[] args) {

        // Loops in Java

        // for loop


        System.out.println("For Loop Example");
        for (int i = 1; i <= 5; i++) {
//            System.out.println("For Iteration: " + i);
        }

        // while loop

        System.out.println("\nWhile Loop Example");
        int j = 5;
        while (j > 0) {
//            System.out.println("While Iteration: " + j);
            j--;
        }

        // do-while loop
        System.out.println("\nDo-While Loop Example");
        int k = 6;
        do {
//            System.out.println("Do_While Iteration: " + k);
            k++;
        } while (k <= 10);

        // for-each loop
        System.out.println("\nFor-Each Loop Example");
        String[] names = {"Alice", "pushkar", "Charlie","alexandera"};
        for (String name : names) {
            System.out.println("Name of person : " + name);
        }
        // for-each loop has no index, it iterates through each element in the array or collection.
        //it cannot use in reverse order or skip elements.
        // for loop has index while for-each doesn't .
    }
}
