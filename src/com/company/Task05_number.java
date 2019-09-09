package com.company;

import java.util.Scanner;

public class Task05_number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number : ");
        int num = scanner.nextInt();
        if (num > 0) {
            System.out.println("Positive");
        } else if (num < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
        float f = 123;
        int i = 123123;
        double d= 123;
        long l = 12312;
        d=i;

    }
}