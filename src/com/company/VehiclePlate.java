package com.company;

public class VehiclePlate {
    public static void main(String[] args) {
       int random=1;
       String temp;
       String plate = null;

        for(int i = 0 ;  i<3 ; i++){
             random  = (int)(Math.random()*25 +65);
             char ch = (char)random;
             plate = plate + String.valueOf(ch) ;

            System.out.print(ch);
        }

            random  = (int)(Math.random()*9000 + 1000);
            System.out.print(random);
        for (int i = 0; i < 10000; i++) {
            for (int j = 0; j < 10000; j++){
                for (int k = 0; k < 10000; k++) {
                    System.out.println(random++);
                }
            }
        }


    }
}
