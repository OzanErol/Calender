package com.company;

import java.util.Scanner;

public class AreaOfHexagon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the side: ");
        double side = scanner.nextDouble();
        double area = ( 6 * side * side )  / ( 4 * Math.tan(3.15 / 6));
        System.out.println(area);
    }
}
