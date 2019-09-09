package com.company;

public class RandomCharacter {
    public static void main(String[] args) {
        int random =(int) (Math.random() * (90 - 65) + 65 );
        System.out.println(random);
        char ch = (char)random;
        System.out.println(ch);
    }
}
