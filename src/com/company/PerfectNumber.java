package com.company;

public class PerfectNumber {
    public static void main(String[] args) {
        int number ;
       int divisor = 0 ;
       for(int y = 1 ; y < 10000 ; y++){
           number = y;
           divisor = 0 ;
            for(int i = number-1 ; i >= 1 ; i--){
                if(number % i == 0){
                    divisor += i ;
                }
            }
            if(y == divisor){
                System.out.println(y + "\t");
            }

        }
    }
}
