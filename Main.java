package com.company;
import java.util.Scanner;


public class Main {

    public static double areaCalc(double roomLength, double roomWidth){

        double roomArea = 0.0;

        roomArea = roomLength * roomWidth;

        return roomArea;
    }

    public static double circumCalc(double roomLength, double roomWidth) {

        double roomCircum = 0.0;

        roomCircum = (roomLength * 2) + (roomWidth * 2);

        return roomCircum;
    }

    public static void main(String[] args) {
        char userResp=' ';
    do
        {
        System.out.println(("Welcome to Grand Circus' Room Detail Generator!"));

        Scanner scnr = new Scanner(System.in);

        System.out.println("Enter room length: ");
        double roomLength = scnr.nextDouble();

        System.out.println("Enter room width: ");
        double roomWidth = scnr.nextDouble();

        System.out.println("Area: " + areaCalc(roomLength, roomWidth));
        System.out.println("Perimeter: " + circumCalc(roomLength, roomWidth));

        System.out.println("Continue? (y/n):");
         userResp = scnr.next().charAt(0);
    }
        while (userResp != 'n') ;

        System.out.println("Bye.");
        }
    }






