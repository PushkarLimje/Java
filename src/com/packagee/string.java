package com.packagee;

public class string {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1 + " " + str2 + "!";

        System.out.println(str3+"\n"); // Output: Hello World
        System.out.println(str3.endsWith("!")); // Output: true

        System.out.println("length of the string-3  :"+ str3.length());

        System.out.println(str3.indexOf("World")); // Output: 6
        System.out.println(str3.indexOf("END")); // Output: -1 (not found)

        System.out.println(str3.replace("World", "Java")); // Output: Hello Java!
//      (trim , toLowerCase, UpperCase) trim removes wide spaces

//        // String comparison
//        if (str1.equals("Hello")) {
//            System.out.println("str1 is equal to 'Hello'");
//        }

        // String length
        System.out.println("Length of str3: " + str3.length()); // Output: 11

        // Substring
        System.out.println("Substring of str3: " + str3.substring(2, 9)); // Output: Hello
        String str4 = "hello 'java'  \"wor`ld\"";
        System.out.println(str4);

        str4 = str4.replace(str4, "c:\\java\\java.txt");// output: c:\java\java.txt
        System.out.println(str4);
        str4 = str4.replace("\\", "\\\\"); // Escape backslashes

    }

}
