package com.company;

public class CharTable {
    public static void main(String[] args) {
        int count = 0 ;
        char ch   ;
        for(int i = 0 ; i < 127 ; i++){
            ch = (char)i ;
            if(count %  10 == 0){
                System.out.println(ch);
            }else  System.out.print(ch + " \t");
            count++;
        }

    }
}
