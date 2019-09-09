package com.company;

import java.util.Scanner;

public class AreaOfRegularPolygon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the side length: ");
        double side = scanner.nextDouble();

        System.out.println("Enter the side amount: ");
        double n = scanner.nextDouble();
        double area = ( n * side * side )  / ( 4 * Math.tan(3.1419 / n));
        System.out.println(area);
    }
}
