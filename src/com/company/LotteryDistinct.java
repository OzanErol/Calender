package com.company;

public class LotteryDistinct {
    public static void main(String[] args) {
        int random1 = 0 , random2 = 0 , finalRandom = 0 ;
        boolean flag = true;
        while (flag){
            random1 = (int)(Math.random()*10);
            random2 = (int)(Math.random()*10);
            if(random1 != random2){
                flag = false;
                finalRandom = 10 * random1 + random2 ;
            }
        }
        System.out.println(finalRandom);
    }
}
