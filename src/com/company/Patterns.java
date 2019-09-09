package com.company;

import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rowNumber = scanner.nextInt();

        for(int currentRow = 1 ; currentRow <= rowNumber ; currentRow++){
            for(int i = 1 ; i <= currentRow ; i++){
                System.out.print(i + "  ");
            }
            System.out.println("");
        }
        System.out.println("");
        for(int currentRow = 1 ; currentRow <= rowNumber ; currentRow++){
            for (int i = currentRow ; i <= rowNumber ; i++){
                System.out.print(i + "  ");
            }
            System.out.println("");
        }

        System.out.println("");

        for(int currentRow = 1 ; currentRow <= rowNumber ; currentRow++){
            for(int y = 1 ; y <= (rowNumber - currentRow)  ; y++){
                System.out.print("  ");
            }

            for(int i = currentRow ; i >=1 ; i--){
                System.out.print(i + " ");
            }
            System.out.println("");
        }

        System.out.println("");

        for(int currentRow = 1 ; currentRow <= rowNumber ; currentRow++){
            for(int i = 1 ; i <= currentRow ; i++ ){
                System.out.print("  ");
            }
            for(int i = 1 ; i <= (rowNumber-currentRow)+1 ; i++ ){
                System.out.print(i + " ");
            }
            System.out.println("");
        }

        System.out.println("");

        for(int currentRow = 1 ; currentRow <= rowNumber ; currentRow++){
            for(int y = 1 ; y <= (rowNumber - currentRow)  ; y++){
                System.out.print("  ");
            }

            for(int i = 0 ; i <= currentRow-1 ; i++){
                System.out.print((int)(Math.pow(2,i)) + "\t");
            }
            for(int i = currentRow-2 ; i >-1 ; i--){
                System.out.print((int)(Math.pow(2,i)) + "\t");
            }
            System.out.println("");
        }

    }
}
