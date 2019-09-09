package com.company;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import javax.xml.transform.sax.SAXSource;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("please enter number a , b , c ");
//        double a = scanner.nextDouble();
//        double b = scanner.nextDouble();
//        double c = scanner.nextDouble();
//        double discriminant = (b * b) - (4 * a * c);
//        double r1 = (-b + Math.pow(discriminant, 0.5)) / (2 * a);
//        double r2 =(-b - Math.pow(discriminant, 0.5)) / (2 * a);
//        if (discriminant > 0) {
//            System.out.println("Equation has two root");
//
//            System.out.println("Root of the equation: " + r1 + " and " + r2);
//        }
//        if(discriminant == 0){
//            System.out.println("Equation has only one root ");
//            System.out.println("Only root is " + r2);
//        }
//        if( discriminant < 0){
//            System.out.println("Equation has no root.");

//        int random = (int) (Math.random() * 100 % 12);
//        System.out.println(random + 1);
//        switch (random + 1) {
//            case 1:
//                System.out.println("January");
//                break;
//            case 2:
//                System.out.println("February");
//                break;
//            case 3:
//                System.out.println("March");
//                break;
//            case 4:
//                System.out.println("April");
//                break;
//            case 5:
//                System.out.println("May");
//                break;
//            case 6:
//                System.out.println("June");
//                break;
//            case 7:
//                System.out.println("July");
//                break;
//            case 8:
//                System.out.println("August");
//                break;
//            case 9:
//                System.out.println("September");
//                break;
//            case 10:
//                System.out.println("October");
//                break;
//            case 11:
//                System.out.println("November");
//                break;
//            case 12:
//                System.out.println("December");
//                break;
//
//
//        }
//        System.out.println("Please enter todays day : ");
//        int day = scanner.nextInt();
//        System.out.println("Please enter future`s day : ");
//        int futureDay = scanner.nextInt() + day ;
//        String dayName = null;
//        String futureName = null;
//
//
//            switch (day) {
//                case 1:
//                    dayName = "Monday";
//                    break;
//                case 2:
//                     dayName = "Tuesday";
//                    break;
//                case 3:
//                     dayName = "Wednesday";
//                    break;
//                case 4:
//                     dayName = "Thursday";
//                    break;
//                case 5:
//                     dayName = "Friday";
//                    break;
//                case 6:
//                     dayName ="Saturday";
//                    break;
//                case 0:
//                     dayName = "Sunday";
//                    break;
//
//            }
//
//
//        switch (futureDay%7) {
//            case 1:
//                futureName = "Monday";
//                break;
//            case 2:
//                futureName = "Tuesday";
//                break;
//            case 3:
//                futureName = "Wednesday";
//                break;
//            case 4:
//                futureName = "Thursday";
//                break;
//            case 5:
//                futureName = "Friday";
//                break;
//            case 6:
//                futureName ="Saturday";
//                break;
//            case 0:
//                futureName = "Sunday";
//                break;
//
//        }
//        System.out.println("today day is : " + dayName + " future day is  : " + futureName);

        Scanner scanner1 = new Scanner(System.in);
//        System.out.println("Please enter 3 number");
//
//        int number1 = scanner1.nextInt();
//        int number2 = scanner1.nextInt();
//        int number3 = scanner1.nextInt();
//
//        int biggest =0, middle =0 , lowest =0 ;
//
//
//        if (number1 < number2  && number1 <number3 ){
//               if (number2 < number3){
//                   biggest = number3;
//                   lowest = number1;
//                   middle = number2;
//               }else {
//                lowest = number1;
//                biggest = number2;
//                middle = number3 ;
//            }
//            }
//        if (number2 < number1  && number2 <number3 ){
//            if (number1 < number3){
//                biggest = number3;
//                lowest = number2;
//                middle = number1;
//            }else {
//                lowest = number2;
//                biggest = number1;
//                middle = number3 ;
//            }
//        }
//        if (number3 < number2  && number3 <number1 ){
//            if (number2 < number1){
//                biggest = number1;
//                lowest = number3;
//                middle = number2;
//            }else {
//                lowest = number3;
//                biggest = number2;
//                middle = number1 ;
//            }
//        }
//        System.out.println(biggest + "\n" + middle + "\n" + lowest);
//               System.out.println("Please enter 3 digit of number : ");
//        int number = scanner.nextInt();
//        int number2 = number;
//        int first , second ,third , converted = 0 ;
//        if(number < 100 || number > 999 ){
//            System.out.println("Please enter  3 digit number");
//        }else {
//            first = number % 10 ;
//            number = number - first;
//            first = first * 100 ;
//            second = number % 100 ;
//            third = number / 100 ;
//            converted = first + second + third;
//        }
//        if(number2 == converted)
//        System.out.println("Your number is polindrone " + converted + number);
//

//        System.out.println("Please enter your prediction : \" Tail \" or \" Head \" ");
//        String prediction = scanner.nextLine();
//        String coin = null;
//        int random = (int)(Math.random()+0.5) %10;
//        System.out.println(random);
//        if(random == 1){
//            coin = "head";
//            if(prediction.equals(coin) ){
//                System.out.println("you got it right it is head");
//            }
//        }
//        if(random == 0){
//            coin = "tail";
//            if(prediction.equals(coin)){
//                System.out.println("you got it right it is tail");
//            }
//        }
//        System.out.println("please enter lottery number");
//        int prediction = scanner.nextInt();
//        int first, second, third, firstPrediction, secondPrediction, thirdPrediction;
//        int lottery = (int) (Math.random() * 1000);
//        System.out.println(lottery);
//
//        third = lottery % 10;
//        second = (lottery % 100) / 10;
//        first = lottery / 100;
//
//        thirdPrediction = prediction % 10;
//        secondPrediction = (prediction % 100) / 10;
//        firstPrediction = prediction / 100;
//
//        if (prediction == lottery) {
//            System.out.println("You have won the big lottery $10_000");
//        } else if (((firstPrediction == first) || (firstPrediction == second) || (firstPrediction == third)) && ((secondPrediction == first) || (secondPrediction == second) || (secondPrediction == third)) && ((thirdPrediction == first) || (thirdPrediction == second) || (thirdPrediction == third))) {
//            System.out.println("You have won $3000");
//        } else if (((firstPrediction == first) || (firstPrediction == second) || (firstPrediction == third)) || ((secondPrediction == first) || (secondPrediction == second) || (secondPrediction == third)) || ((thirdPrediction == first) || (thirdPrediction == second) || (thirdPrediction == third))) {
//
//            System.out.println("You have won $1000 ");
//        } else System.out.println("You have won nothing");

//        int rndm = (int) (Math.random() * 30) / 10;
//        System.out.println(rndm);
//        System.out.println("Please enter your predict 0 : Rock  1 : Paper  2 : Scissor");
//        int playerPrediction = scanner.nextInt();
//        switch (rndm) {
//            case 0:
//                System.out.println("Computer choose Rock ");
//                break;
//            case 1:
//                System.out.println("Computer choose Paper ");
//                break;
//            case 2:
//                System.out.println("Computer choose Scissor ");
//                break;
//        }
//        switch (playerPrediction) {
//            case 0:
//                System.out.println("You choose Rock ");
//                break;
//            case 1:
//                System.out.println("You choose Paper ");
//                break;
//            case 2:
//                System.out.println("You choose Scissor ");
//                break;
//        }
//        boolean win = ((playerPrediction==0 && rndm==2) || (playerPrediction==1 && rndm==0) || (playerPrediction==2 && rndm==1) );
//        if(playerPrediction==rndm){
//            System.out.println("It is a draw");
//        }else if (win){
//            System.out.println("Congratulations you have won");
//        }else System.out.println("Unfortunately You lost");
//
//        int triangleEdge1 = scanner1.nextInt();
//        int triangleEdge2 = scanner1.nextInt();
//        int triangleEdge3 = scanner1.nextInt();
//
//        boolean valid = (((triangleEdge1 + triangleEdge2) > triangleEdge3 ) && ((triangleEdge1 + triangleEdge3) > triangleEdge2 ) && ((triangleEdge2 + triangleEdge3) > triangleEdge1 ));
//        if(valid){
//        System.out.println("Perimeter of triangle equals " + ( triangleEdge1 + triangleEdge2 + triangleEdge3));
//    }else System.out.println("It cannot be a triangle");

//        System.out.println("Please enter a year ");
//        int year = scanner.nextInt() ;
//
//        System.out.println("please enter month ");
//        int month= scanner.nextInt();
//
//        System.out.println("Please enter day of month ");
//        int dayOfMonth = scanner.nextInt();
//
//        int dayOfWeek;
//
//
//        if (month == 1){
//            month = 13;
//            year = year - 1 ;
//        }
//        if (month == 2){
//            month = 14;
//            year = year - 1 ;
//        }
//        int k = year % 100 ;
//        int j = year / 100 ;
//
//        dayOfWeek = ((dayOfMonth) + (26 * (month + 1) / 10) + k + (k / 4) + (j / 4) + (5 * j)) % 7 ;
//        switch (dayOfWeek) {
//            case 0:
//                System.out.println("Day of week is Saturday");;
//                break;
//            case 1:
//                System.out.println("Day of week is Sunday");;
//                break;
//            case 2:
//                System.out.println("Day of week is Monday");;
//                break;
//            case 3:
//                System.out.println("Day of week is Tuesday");;
//                break;
//            case 4:
//                System.out.println("Day of week is Wednesday");;
//                break;
//            case 5:
//                System.out.println("Day of week is Thursday");;
//                break;
//            case 6:
//                System.out.println("Day of week is Friday");;
//                break;
//
//        }

////
//        int rank = (int) (Math.random()*1000 % 13);
//        int suit = (int) (Math.random()*1000 % 4);
//
//        switch (rank){
//            case 0 :
//                System.out.print("You have pick Ace");
//                break;
//            case 1 :
//                System.out.print("You have pick 2");
//                break;
//            case 2 :
//                System.out.print("You have pick 3");
//                break;
//            case 3 :
//                System.out.print("You have pick 4");
//                break;
//            case 4 :
//                System.out.print("You have pick 5");
//            case 5 :
//                System.out.print("You have pick 6");
//                break;
//            case 6 :
//                System.out.print("You have pick 7");
//                break;
//            case 7 :
//                System.out.print("You have pick 8");
//                break;
//            case 8 :
//                System.out.print("You have pick 9");
//                break;
//            case 9 :
//                System.out.print("You have pick 10");
//                break;
//            case 10 :
//                System.out.print("You have pick Jack");
//                break;
//            case 11 :
//                System.out.print("You have pick Queen");
//                break;
//            case 12 :
//                System.out.print("You have pick King");
//                break;
//
//        }
//        switch (suit) {
//            case 0:
//                System.out.println(" of  Clubs");
//                break;
//            case 1:
//                System.out.println(" of Diamonds");
//                break;
//            case 2:
//                System.out.println(" of Hearts");
//                break;
//            case 3:
//                System.out.println(" of Spades");
//                break;
//
//        }
//        System.out.println((int)(10/3.0));


//        System.out.println("Enter r1's center x-, y-coordinates, width, and height");
//    double  x1 = scanner1.nextDouble();
//    double y1 = scanner1.nextDouble();
//    double width1 =  scanner1.nextDouble();
//    double height1 =  scanner1.nextDouble();
//
//        System.out.println("Enter r2's center x-, y-coordinates, width, and height");
//        double  x2 = scanner1.nextDouble();
//        double y2 = scanner1.nextDouble();
//        double width2 =  scanner1.nextDouble();
//        double height2 =  scanner1.nextDouble();
//        double twoPoint = distanceBetweenTwoPoint(x1,y1,x2,y2);
//
//        boolean horizontalInside = (twoPoint + (width2 / 2)) <= (width1 / 2) ;
//        boolean verticalInside = (twoPoint + (height2 / 2)) <= (height1 / 2) ;
//        boolean horizontalOutside = twoPoint >= ((width2 / 2) + (width1 / 2));
//        boolean verticalOutside = twoPoint >= ((height2 / 2) + (height1 / 2));
//
//        if(horizontalInside || verticalInside){
//            System.out.println("R2 is inside of R1 ");
//        }else if (horizontalOutside || verticalOutside){
//            System.out.println("R2 is not in R1 ");
//        }else System.out.println("R2 overlaps R1");


//        System.out.println("Enter circle1's center x-, y-coordinates, and radius: " );
//        double x1 =  scanner1.nextDouble();
//        double y1 =  scanner1.nextDouble();
//        double radius1 =  scanner1.nextDouble();
//
//        System.out.println("Enter circle2's center x-, y-coordinates, and radius: " );
//        double x2 =  scanner1.nextDouble();
//        double y2 =  scanner1.nextDouble();
//        double radius2 =  scanner1.nextDouble();
//        double distance = distanceBetweenTwoPoint(x1,y1,x2,y2);
//
//        if(distance >= (radius1 + radius2)){
//            System.out.println("Circles are separated");
//        }else if (distance < Math.abs(radius2 - radius1)){
//            System.out.println("Circles are inside of each other");
//        }else System.out.println("Circle 1 overlaps Circle2");

//        System.out.println("Enter the exchange rate from dollars to RMB: ");
//        double currency = scanner.nextDouble();
//        System.out.println("Enter 0 to convert dollars to RMB and 1 vice versa: ");
//        int convert = scanner.nextInt();
//        switch (convert){
//            case 0 : System.out.println("Enter the dollar amount:");
//                double amount = scanner.nextDouble();
//                double newAmount = amount * currency ;
//                System.out.println(amount + " dollar equals to " + newAmount + " RMB ");
//                break;
//            case 1 :
//                System.out.println("Enter the RMB amount:");
//                 amount = scanner.nextDouble();
//                 newAmount = amount / currency ;
//                System.out.println(amount + " RMB equals to " + newAmount + " Dollar ");
//                break;
//
//        }

//
//        System.out.println("Enter three points for p0, p1, and p2");
//        double x0 = scanner.nextDouble();
//        double y0 = scanner.nextDouble();
//        double x1 = scanner.nextDouble();
//        double y1 = scanner.nextDouble();
//        double x2 = scanner.nextDouble();
//        double y2 = scanner.nextDouble();
//
//        if(((x1 - x0) * (y2 - y0) - (x2 - x0) - (y1 - y0)) > 0){
//            System.out.println("p2 is on the left side");
//        }else if(((x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0)) == 0){
//            System.out.println("p2 is on the same line");
//        }else System.out.println("p2 is on the right side");
//
//        System.out.println( "Enter weight and price for package 1: ");
//        double weight1 =  scanner1.nextDouble();
//        double price1 =  scanner1.nextDouble();
//
//        System.out.println( "Enter weight and price for package 2: ");
//        double weight2 =  scanner1.nextDouble();
//        double price2 =  scanner1.nextDouble();
//
//        if((price2 / weight2) < (price1 / weight1)) {
//            System.out.println("Package 2 has better price");
//        }else if((price2 / weight2) == (price1 / weight1)) {
//            System.out.println("Packages  has same price");
//        }else System.out.println("Pacakage 1 has better price");

        System.out.println(" Enter the length from the center to a vertex : ");
        double r = scanner.nextDouble();
        double side = 2 * r * Math.sin(3.14 / 5) ;
        double area = 5 * side * side / 4 / Math.tan(3.14 / 5) ;
        System.out.println("The area of the pentagon is  " + area);





    }


    public static double distanceBetweenTwoPoint(double x1 , double y1 , double x2 , double y2){
        double distance =Math.pow((((x1 - x2) * (x1 - x2))  + ((y1 - y2) *  (y1 - y2))) , 0.5);
        return distance;
    }
}
