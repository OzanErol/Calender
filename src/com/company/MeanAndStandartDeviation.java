package com.company;

import java.util.Scanner;

public class MeanAndStandartDeviation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in);
        System.out.println("Please enter the number");
        double number = 0 , mean = 0 , deviation = 0 , sum = 0 , kareleri = 0;
        for(int i = 0 ; i < 10 ; i++){
            number = scanner.nextDouble();
            sum +=  number ;
            kareleri = kareleri + (number * number);
        }

        mean  = sum / 10 ;
        deviation = Math.sqrt((kareleri - ((sum * sum) / 10) ) / 9) ;
        System.out.println(mean + "\t" + deviation);
    }
}
