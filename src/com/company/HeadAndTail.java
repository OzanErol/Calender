package com.company;

public class HeadAndTail {
    public static void main(String[] args) {
        int count = 0 ;
        int headCount = 0 , tailCount = 0;
        while ( count < 1000000){
            switch ((int)(Math.random() + 0.5)){
                case 0 : headCount++; break;
                case 1 : tailCount++; break;
            }
            count++;
        }
        System.out.println("Tails : " + tailCount + " Heads : "  + headCount);
    }
}
