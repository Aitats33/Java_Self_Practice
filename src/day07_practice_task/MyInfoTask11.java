package day07_practice_task;

import java.util.Scanner;

public class MyInfoTask11 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("  Full name ");
        String fullName = input.nextLine();
        System.out.println("  Age ");
        int age = input.nextInt();
        System.out.println(" Gender");
        String gender = input.next();
        System.out.println(" Phone number ");
        long phoneNumber = input.nextLong();
        System.out.println("Enter your zip code ");
        int zipcode = input.nextInt();
        System.out.println(" Enter your School name ");
        String schoolName = input.next();
        System.out.println(" Enter your city name ");
        String cityName = input.next();
        System.out.println(" Enter your state name ");
        String stateName = input.next();
        System.out.println(" Enter your building number ");
        int buildingNumber = input.nextInt();
        System.out.println("Enter your Street name ");
        String streetName = input.toString();

        input.close();


        System.out.println(fullName);

        System.out.println(age);
        System.out.println(gender);

        System.out.println(phoneNumber);
        System.out.println(schoolName);
        System.out.println("Address: + \n\t" + " " + buildingNumber + " " + stateName + "\n\t" + cityName + ", " + stateName + " " + zipcode);


    }

}
/*Create a class called MyInfo and ask the user to:

      Enter your age (int)
      Enter your gender (String - One word ONLY)
      Enter your full name (String - Multiple words)
      Enter your phone number (long)
      Enter your zip code (int)
      Enter your School name (String - Can be Multiple words)
      Enter your city name (String - Can be Multiple words)
      Enter your state name (String - One word ONLY)
      Enter your building number (int)
      Enter your Street name

    Display all the inputs that the user entered in the following order in separate lines:

        Full name
        Age
        Gender
        Phone number
        Address:
             buildingNumber Street
             City, state zipCode
 */