package day03_practice_tasks;

public class SelfTask1_Operators_Rectangle {
/*
Write a program that calculate the area and perimeter of the given rectangle=diktortgen
Example:
length = 4.5
width = 2

output:
The area of the rectangle is 9.0
The perimeter of the rectangle is 13.0

Hint =ipucu

Area of rectangle :
area = length * width

Perimeter of rectangle :
perimeter = 2* (length + width)
 */
    public static void main(String[] args) {


        double length = 4.5;
        double width = 2;

        double area = length * width;
        double perimeter = 2 *(length * width);

        System.out.println( " The area of the rectangle is " + area);
        System.out.println(" The perimeter of the rectangle is " + perimeter );

    }
}
