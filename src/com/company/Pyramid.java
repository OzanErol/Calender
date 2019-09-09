package com.company;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number that you want to create pyramid : ");
        int pyramidLayer = scanner.nextInt();
        for (int i = 0 ; i <= pyramidLayer ; i++){
            for (int z = 0 ; z <= 3*(pyramidLayer-i) ; z++ ){
                System.out.print(" ");
            }
            for(int x= i ; x > 1 ; x--){
                System.out.print(x + "  ");
            }

            for(int y = 1 ; y <= i ; y++){

                System.out.print(y  + "  ");
                }
            System.out.println("");
        }

    }
}
