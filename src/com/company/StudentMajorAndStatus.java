package com.company;

import java.util.Scanner;

public class StudentMajorAndStatus {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Enter two characters :");
        String word = scanner.nextLine();
        char ch = Character.toUpperCase(word.charAt(0));
        char year = Character.toUpperCase(word.charAt(1));

        int number ;
        switch (ch){
            case 'M': System.out.print("Mathematics ");  break;
            case 'C': System.out.print(" Computer Science  "); break;
            case 'I': System.out.print("Information Technology ");break;
            default: System.out.println("Invalid input"); break;
        }

        switch (year){
            case '1': System.out.print("Freshman");  break;
            case '2': System.out.print(" Sophomore"); break;
            case '3': System.out.print("Junior");break;
            case '4': System.out.print("Senior ");break;

        }


    }
}
