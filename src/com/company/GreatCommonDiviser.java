package com.company;

import java.util.Scanner;

public class GreatCommonDiviser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first number : ");
        int number1 = scanner.nextInt();
        System.out.println("PLease enter the second number : ");
        int number2 = scanner.nextInt();

        int d = number1 < number2 ? number1 : number2 ;

        boolean flag = true;
        while (flag){
            if(number1 % d == 0 && number2 % d == 0){
                System.out.println(d);
                flag = false ;
            }d--;
        }

    }
}
