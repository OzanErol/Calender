package com.company;

import java.util.Scanner;

public class ASCIICode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an ASCII code: ");
        int ascii = scanner.nextInt();
        char c = (char) ascii;
        System.out.println(c);

        System.out.println("Enter a character : ");
        String word = scanner.nextLine();
//        char ch = character.charAt(0);
        System.out.println(word);
    }
}
