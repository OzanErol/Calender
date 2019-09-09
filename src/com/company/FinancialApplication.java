package com.company;

import java.util.Scanner;

public class FinancialApplication {
    public static void main(String[] args) {
        System.out.println("Please enter sale of the month ");
        Scanner scanner = new Scanner( System.in);
        double sale = 0;
        double commision = 0 ;
       while(commision < 30000) {
           sale += 1 ;
           commision = 0;
           if (sale < 5000) {
               commision = sale * 0.08;
           }
           if (sale > 5000 || sale < 10000) {
               commision = (sale - 5000) * 0.1  + 5000 * 0.08;
           }
           if (sale > 10000) {
               commision = (5000) * 0.08 + (5000) * 0.1 + (sale - 10000) * 0.12;
           }
       }
        System.out.println(sale);
    }
}
