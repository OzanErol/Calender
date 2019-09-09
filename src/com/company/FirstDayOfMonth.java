package com.company;

import java.util.Scanner;

public class FirstDayOfMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the year");
        int year = scanner.nextInt();
        System.out.println("Please enter the first day of the year :");
        int firstDay = scanner.nextInt();
        System.out.println();
//        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
//        }
        int daysInTheMonth = 31;
        for(int month = 1 ; month <= 12 ; month++ ){
            switch (month){
                case 1:
                    daysInTheMonth = 31;
                    System.out.println("January, " + year + " first day of the month is " + nameOfTheDay(firstDay));
                    break;
                case 2:
                    if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                        daysInTheMonth = 29 ;
                    }else daysInTheMonth = 28 ;

                    System.out.println("February, " + year + " first day of the month is " + nameOfTheDay(firstDay) );
                    break;
                case 3:
                    daysInTheMonth = 31;
                    System.out.println("March, " + year + " first day of the month is " + nameOfTheDay(firstDay) );
                    break;
                case 4:
                    daysInTheMonth = 30 ;
                    System.out.println("April, " + year + " first day of the month is " + nameOfTheDay(firstDay) );
                    break;
                case 5 :
                    daysInTheMonth = 31 ;
                    System.out.println("May, " + year + " first day of the month is " + nameOfTheDay(firstDay) );
                    break;
                case 6:
                    daysInTheMonth = 30;
                    System.out.println("June, " + year + " first day of the month is " + nameOfTheDay(firstDay) );
                    break;
                case 7:
                    daysInTheMonth = 31;
                    System.out.println("July, " + year + " first day of the month is " + nameOfTheDay(firstDay) );
                    break;
                case 8:
                    daysInTheMonth = 31;
                    System.out.println("August, " + year + " first day of the month is " + nameOfTheDay(firstDay) );
                    break;
                case 9:
                    daysInTheMonth = 30 ;
                    System.out.println("September, " + year + " first day of the month is " + nameOfTheDay(firstDay) );
                    break;
                case 10:
                    daysInTheMonth = 31 ;
                    System.out.println("October, " + year + " first day of the month is " + nameOfTheDay(firstDay) );
                    break;
                case 11:
                    daysInTheMonth = 30 ;
                    System.out.println("November, " + year + " first day of the month is " + nameOfTheDay(firstDay) );
                    break;
                case 12:
                    daysInTheMonth = 31 ;
                    System.out.println("December, " + year + " first day of the month is " + nameOfTheDay(firstDay) );
                    break;
            }
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