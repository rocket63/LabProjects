package com.company;
import java.util.Scanner;

public class Main {

    public static char letterGrade(int numGrade) {

        char gradeLet = ' ';

        if (numGrade >= 88) {
            gradeLet = 'A';
        }
        else if (numGrade >= 80) {
            gradeLet = 'B';
        }
        else if (numGrade >= 67) {
            gradeLet = 'C';
        }
        else if (numGrade >= 60) {
            gradeLet = 'D';
        }
        else {
            gradeLet = 'F';
        }
        return gradeLet;
    }

    public static void main(String[] args) {
        char caseCor = ' ';
        char userResp = ' ';
        do {

            Scanner scnr = new Scanner(System.in);
            int numGrade = 0;

            System.out.println("Welcome to the Letter Grade Converter!");

            System.out.println("Enter a numerical grade: ");
            numGrade = scnr.nextInt();

            System.out.println("Letter Grade: " + letterGrade(numGrade));

            System.out.println("Continue? (y/n):");
            userResp = scnr.next().charAt(0);
            caseCor = Character.toLowerCase(userResp);

        }
        while (caseCor != 'n');

        System.out.println("Bye!");


        }










    }

