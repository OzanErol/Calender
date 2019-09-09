package com.company;

public class SumSeries {
    public static void main(String[] args) {
        double result = 0 , divider = 3.0;
        for(double i = 1.0; i < 100.0 ; i +=2.0 ){
            result = i / divider ;
            divider += 2 ;
        }
        System.out.println(result);
    }
}
