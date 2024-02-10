package day07_practice_task;

public class RectangleClients {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();

        rectangle.width = 4.17;

        rectangle.length =3.5;


        System.out.println( " The Area " + (rectangle.width) * (rectangle.length));
        System.out.println( " The Perimeter " + (rectangle.width + rectangle.length) * 2 );


        System.out.println("-----------------------------------");


        Rectangle rectangle1 = new Rectangle();

        rectangle1.width = 7.8;
        rectangle1.length = 4.1;

        System.out.println( " The Area " + (rectangle1.width) * (rectangle1.length));
        System.out.println( " The Perimeter " + (rectangle1.width + rectangle1.length) * 2 );


    }

}
