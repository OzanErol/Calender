package com.company;

import java.util.Scanner;

public class GradeToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a letter grade: ");
        String grade =  scanner.nextLine();
        grade = grade.toUpperCase();
        switch (grade){
            case "A": case "B" :  case "C":
                System.out.println("2");
                break;
            case "D": case "E" :  case "F":
                System.out.println("3");
                break;
            case "G": case "H" :  case "I":
                System.out.println("4");
                break;
            case "K": case "L" :  case "J":
                System.out.println("5");
                break;
            case "M": case "N" :  case "O":
                System.out.println("6");
                break;
            case "P": case "Q" :  case "R": case "S" :
                System.out.println("7");
                break;
            case "T": case "U" :  case "V":
                System.out.println("8");
                break;
            case "W": case "X" :  case "Y": case "Z" :
                System.out.println("9");
                break;
        }
    }
}
