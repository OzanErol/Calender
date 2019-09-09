package com.company;

import java.util.Scanner;

public class CheckSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter String1 and String2 :");
        String string1 = scanner.nextLine();
        String string2 = scanner.nextLine();
        String subString = new String();
        int length1 = string1.length();
        int length2 = string2.length();
        boolean quit = true;


            for (int i = 0 ; i < length1 ; i++ ){
               if(string1.charAt(i) == string2.charAt(0)){
                for (int y = i ; y < length2 ; y++){
                   subString += string1.charAt(y) ;
                }
            }

        }
            if(subString.equals(string2)){
                System.out.println("It is a substring");
                }else System.out.println("IT is not a substring");

    }
}
