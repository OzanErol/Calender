package com.company;

import java.util.Scanner;

public class CompoundValue {
    public static void main(String[] args) {
        double balance = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter deposit each month ");
        double depositEachMonth = scanner.nextDouble();
        System.out.println("Please enter annual rate of interest ");
        double monthlyInterestRate = scanner.nextDouble() / 12 ;
        System.out.println("Please enter when you want to withdrawal your money ");
        double month = scanner.nextDouble();

        for (int i = 0 ; i < month ; i ++ ) {
            balance += depositEachMonth ;
            balance =  balance * (1 + monthlyInterestRate )  ;
        }
        System.out.println(" Your total balance is : " + balance);

    }
}
