package com.company;

import java.util.Scanner;

public class StatusCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the Code you want to learn : ");
        int statusCode = scanner.nextInt();
        if (statusCode == 200) {
            System.out.println("OK");
        }
        if (statusCode == 201) {
            System.out.println("Created");
        }
        if (statusCode == 202) {
            System.out.println("Accepted");
        }
        if (statusCode == 301) {
            System.out.println("Moved Permanently");
        }
        if (statusCode == 303) {
            System.out.println("See Other");
        }
        if (statusCode == 304) {
            System.out.println("Not Modified");
        }
        if (statusCode == 307) {
            System.out.println("Temporary Redirect");
        }
        if (statusCode == 400) {
            System.out.println("Bad Request ");
        }
        if (statusCode == 401) {
            System.out.println("Unauthorized");
        }
        if (statusCode == 403) {
            System.out.println("Forbidden");
        }
        if (statusCode == 404) {
            System.out.println("Not Found");
        }
        if (statusCode == 410) {
            System.out.println("Gone");
        }
        if (statusCode == 500) {
            System.out.println("Internal Server Error");
        }
        if (statusCode == 503) {
            System.out.println("Service Unavailable");
        }


    }
}