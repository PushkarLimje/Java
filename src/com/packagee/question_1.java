package com.packagee;

import java.util.Scanner;

public class question_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the word");
        String a = scanner.next();
        System.out.println(isValidNo(a));
    }


    public static boolean isValidNo(String word){

        if(word.length() < 3 || word.isBlank()){
            System.out.println("letter is less than 3 or blank space");
            return  false;  
        }
        boolean hasVowel = false;
        boolean hasConsonent = false ;

        for(char c : word.toCharArray()){

            if(!Character.isLetterOrDigit(c)) {
                System.out.println("invalid letter in word other than num and alphabet");
                return false;
            };

            if (Character.isLetter(c)){
                char lowerC = Character.toLowerCase(c);
                if ("aeiou".indexOf(lowerC)>= 0 ){
                    hasVowel =true;
                }else{
                    hasConsonent = true;
                }
            }

        }
        return hasVowel && hasConsonent;
    }
}
