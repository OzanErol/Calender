package com.company;

import java.util.Scanner;

public class CountPositive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int negativeCount =  0;
        int positiveCount = 0 ;
        int sum = 0;
        int number;
        double average;
        do{
            System.out.println("Please enter a number :");
             number  = scanner.nextInt();
            if(positiveCount == 0 && negativeCount == 0 && number == 0 && sum == 0){
                System.out.println("No numbers are entered except 0");
            }
            if(number < 0){
                negativeCount++;
            }else if(number > 0){
                positiveCount++;
            }
            sum += number ;
            average = sum / (positiveCount + negativeCount);

        } while (number != 0);
        System.out.println("The number of positives is " + positiveCount);
        System.out.println("The number of negative is " + negativeCount);
        System.out.println("The total is :" + sum);
        System.out.println(" The average is " + average);
    }
}
