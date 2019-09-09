package com.company;

public class SumRighttoLeft {
    public static void main(String[] args) {
       double result = 0.0 , result2=0.0;
        for(int i = 5000 ; i >=1 ; i--){
            result += 1.0 / i ;
        }
        for(int i = 1 ; i<= 5000 ; i++){
            result2 += 1.0 / i ;
        }
        System.out.println(result + "\t" + result2);
    }
}
