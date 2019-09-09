package com.company;

import java.util.Scanner;

public class RepeatAdditions {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        Scanner scanner = new Scanner(System.in);
        int random ;
        int random1 ;
        int result;
        int answer;
        for (int i = 0; i < 5; i++) {
            random = (int) (Math.random() * 15);
            random1 = (int) (Math.random() * 15);
            if (random >= random1) {
                System.out.println("What is the subtraction of " + random + " - " + random1);
                result = random - random1;
                answer = scanner.nextInt();
                if (result == answer) {
                    System.out.println("Your result is correct .");
                } else System.out.println("Your result is false");
            }

        if (random1 > random) {
            System.out.println("What is the subtraction of " + random1 + " - " + random);
            result = random1 - random;
            answer = scanner.nextInt();
            if (result == answer) {
                System.out.println("Your result is correct .");
            } else System.out.println("Your result is false");
        }
    }
        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println("your total time is " + totalTime/1000000000 + " sec");
    }
    }