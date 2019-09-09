package com.company;

import java.util.Scanner;

public class SmallestFactor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number : ");
        int factorNumber = scanner.nextInt();
        int factor = 2  ;
        while ( factor <= factorNumber ){
            if (factorNumber % factor == 0){
                System.out.print(factor + "\t");
                factorNumber /= factor;
            }else factor++;
        }

    }
}
