package com.company;


import java.util.Scanner;

public class JavaExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a city :");
        String city1 = scanner.nextLine();

        System.out.println("Please enter a city :");
        String city2 = scanner.nextLine();

        System.out.println("Please enter a city :");
        String city3 = scanner.nextLine();

        String first , second , third ;
        if(city1.compareTo(city2) < 0 && city1.compareTo(city3) < 0){
            first = city1;
            if(city2.compareTo(city3) < 0){
                second = city2;
                third = city3;
            }else{
                second = city3;
                third= city2;
            }
            System.out.println(first + " " + second + " " + third);
        }
        if(city2.compareTo(city1) < 0 && city2.compareTo(city3) < 0){
            first = city2;
            if(city1.compareTo(city3) < 0){
                second = city1;
                third = city3;
            }else{
                second = city3 ;
                third = city1;
            }
            System.out.println(first + " " + second + " " + third);
        }
        if(city3.compareTo(city2) < 0 && city3.compareTo(city1) < 0){
            first = city3;
            if(city2.compareTo(city1) < 0){
                second = city2;
                third = city1;
            }else{
                second = city1;
                third = city2;
            }
            System.out.println(first + " " + second + " " + third);
        }
    }
}
