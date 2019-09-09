package com.company;

import java.util.Scanner;

public class ReverseString{
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in);
        System.out.println("Please enter a string that you want to reverse : ");
        String word = scanner.nextLine();
        int length = word.length();
        String reverseWord = "";
        for(int i = length -1 ; i >= 0 ; i--){
        reverseWord += word.charAt(i) ;

        }
        System.out.println(reverseWord);
    }
}
