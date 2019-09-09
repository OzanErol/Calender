package com.company;

import java.util.Scanner;

public class Calender {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the year");
        int year = scanner.nextInt();
        System.out.println("Please enter the first day of the year :");
        int firstDay = scanner.nextInt();
        String monthName = "January";
//        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
//        }
        int daysInTheMonth = 31;
        int count = 0 ;
        for(int month = 1 ; month <= 12 ; month++ ){
            System.out.println("\t\t" + monthName + "\t" + year );
            System.out.println("--------------------------------");
            System.out.println("Sun" +  "\t" + "Mon" + "\t" +  "Tue" +  "\t" + "Wed" + "\t" +"Thu" + "\t" + "Fri" + "\t" + "Sat");
           count = firstDay;
            for(int i = 0 ; i < firstDay ; i++){
                System.out.print("\t");
            }
            switch (month){
                case 1:
                    daysInTheMonth = 31;
                    monthName = "February";
                    break;
                case 2:
                    if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                        daysInTheMonth = 29 ;
                    }else daysInTheMonth = 28 ;
                    monthName = "March";
                    break;
                case 3:
                    daysInTheMonth = 31;
                    monthName = "April";
                    break;
                case 4:
                    daysInTheMonth = 30 ;
                    monthName = "May";
                    break;
                case 5 :
                    daysInTheMonth = 31 ;
                    monthName = "June";
                    break;
                case 6:
                    daysInTheMonth = 30;
                    monthName = "July";
                    break;
                case 7:
                    daysInTheMonth = 31;
                    monthName = "August";
                    break;
                case 8:
                    daysInTheMonth = 31;
                    monthName = "September";
                    break;
                case 9:
                    daysInTheMonth = 30 ;
                    monthName = "October";
                    break;
                case 10:
                    daysInTheMonth = 31 ;
                    monthName = "November";
                    break;
                case 11:
                    daysInTheMonth = 30 ;
                    monthName = "December";
                    break;
                case 12:
                    daysInTheMonth = 31 ;
                    break;
            }

            for(int i = 1 ; i <= daysInTheMonth ; i++){
                if((i + count -1) % 7 == 6){
                    System.out.println(i + "\t" );
                }else System.out.print(i + "\t");
            }
            System.out.println("");
            firstDay = (daysInTheMonth + firstDay ) % 7 ;

        }





    }
    public static String nameOfTheDay(int n){
        switch (n){
            case 0 : return "Sunday";
            case 1 : return "Monday";
            case 2 : return "Tuesday";
            case 3 : return "Wednesday";
            case 4 : return "Thursday";
            case 5 : return "Friday";
            case 6 : return "Saturday";
        }return null;
    }

}

