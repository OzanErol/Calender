package com.company;

public class PiNumber {
    public static void main(String[] args) {
        double pi  = 0;
        for (double i = 1 ; i <= 901 ; i++){
            pi += Math.pow(-1, i +1) / (2 * i - 1);

        }
        pi *= 4 ;
        System.out.println(pi);

        double pi2 = 0;		// Set pi to 0
        for (double i = 1000; i >= 1; i --) {
            pi2 += Math.pow(-1, i +1) / (2 * i - 1);
        }
        pi2 *= 4;
        System.out.println(pi2);

    }

}

