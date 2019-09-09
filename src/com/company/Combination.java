package com.company;

public class Combination {
    public static void main(String[] args) {
        int number = 1 , count = 0;
        while(number < 8){
            for(int i = number ; i <= 7 ; i++){
                if (i != number){
                    System.out.println(number + "\t" + i);
                    count++;
                }
            }
            number ++;
        } System.out.println(count);
    }
}
