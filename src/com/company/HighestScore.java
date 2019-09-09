package com.company;

import java.util.Scanner;

public class HighestScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please how many student to be entered :");
        int currentScore = 0, winner = 0, previousSore=0, seccondWinner = 0;
        String secondWinnerName = null, name, winnerName = null;
        int studentAmount = scanner.nextInt();
        for (int i = 1; i <= studentAmount; i++) {
            System.out.println("Please enter " + i + ". students name  ");
            name = scanner.nextLine();
            scanner.next();
            System.out.println("Please enter " + i + ". students Score ");
            currentScore = scanner.nextInt();
            if (currentScore > winner) {
                winnerName = name;
                winner = currentScore;
            } else if (currentScore > seccondWinner) {
                seccondWinner = currentScore;
                secondWinnerName  = name ;
            }




        }
        System.out.println("highest currentScore belongs to " + winnerName + " Score is " + winner);
        System.out.println("Second highest score belongs to " + secondWinnerName + " score " + seccondWinner);
    }
}