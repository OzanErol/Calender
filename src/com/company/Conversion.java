package com.company;

import java.text.DecimalFormat;

public class Conversion {
    public static void main(String[] args) {
        int mile = 1 ;
        double km ;
        System.out.println("MILES " + "\t" + "KILOMETERS");

        while (mile < 200){
            km =(mile * 1.609) ;
            System.out.println(mile + "\t" + km);
            mile++ ;

        }
    }
}

