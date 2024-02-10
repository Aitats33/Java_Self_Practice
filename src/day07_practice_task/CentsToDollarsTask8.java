package day07_practice_task;

import java.util.Scanner;

public class CentsToDollarsTask8 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println(" Enter the cents: ");

        double cents = input.nextDouble();

        double dolars = cents/100 + cents%100;

        input.close();

        System.out.println(cents +" cent is equal to" + dolars);




    }

}/*
Create a class named CentsToDollars and write a program that asks the user to enter the number of cents and
convert the given cents to dollars. Include any remainder in the result.

        Example:
             Enter the cents:
             Input: 225

        Output:
             225 cents is equal to 2 dollars and 25 cents
             */
