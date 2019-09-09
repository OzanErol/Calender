package com.company;

import java.util.Scanner;

public class CheckSSN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a SSN :");
        String SSN = scanner.nextLine();
        char ch1 = SSN.charAt(3);
        char ch2 = SSN.charAt(6);
        if(ch1 == '-' && ch2 == '-'){
            System.out.println("It is a valid SSN");
        }else System.out.println("It is not a valid SSN");
    }
}
