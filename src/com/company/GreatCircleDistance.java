package com.company;

import java.util.Scanner;

public class GreatCircleDistance {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Please Enter point 1 (latitude and longitude) in degrees:  ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        System.out.println("Enter point 2 (latitude and longitude) in degrees: ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        //edit

        x1 = Math.toRadians(x1);
        y1 = Math.toRadians(y1);
        x2 = Math.toRadians(x2);
        y2 = Math.toRadians(y2);
        double radious = 6371;
        double d = (  radious * Math.acos( Math.sin(x1)  * Math.sin(x2)  +   Math.cos(x1)   *   Math.cos(x2)   * Math.cos(y1 - y2)     ) );
        System.out.println(d);

    }
}
