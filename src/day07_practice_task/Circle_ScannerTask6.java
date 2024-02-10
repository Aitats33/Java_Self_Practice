package day07_practice_task;

import java.util.Scanner;

public class Circle_ScannerTask6 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println( " Enter the radius of the Circle ");

double radius = scanner.nextDouble();
double MathPi= 3.14;

scanner.close();

        System.out.println(" The area of the Circle is " + radius * MathPi);
        System.out.println( " The perimeter of the Circle is " + radius * 2 * MathPi);

    }
}
/*6.Create a class named Circle and write a program that asks the user
to enter the radius of the Circle and calculate
the area and perimeter of the Circle.

        Example:
             Enter the radius:
             Input: 5

        Output:
             The area of the Circle is 78.5
             The perimeter of the Circle is 31.4

 */