package day07_practice_task;

import java.util.Scanner;

public class PlaceAnOrderTask10 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter product name");
        String item = input.nextLine();

        System.out.println("Enter the price");
        double price = input.nextDouble();

        System.out.println("Enter the quantity");
        int quantity = input.nextInt();

        input.nextLine();

        System.out.println("Enter their first name");
        String firtsName = input.nextLine();

        double total = quantity*price;

        input.close();

        System.out.println(firtsName + " , your order for "+ quantity + " " + item + " has been placed. Your total is " + total + ".");



    }

}
/*Create a class named PlaceAnOrder:

    Ask the user to enter the product name (multiple words).
    Ask the user to enter the price (double).
    Ask the user to enter the quantity (int).
    Ask the user to enter their first name (String, single word).

    Print in the following format:

        Example:
             Inputs: "Apples", 1.5, 5, "Luke"

        Output:
             Luke, your order for 5 Apples has been placed. Your total is 7.5.

 */