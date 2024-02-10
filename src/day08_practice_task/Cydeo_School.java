package day08_practice_task;

public class Cydeo_School {

    public static void main(String[] args) {


        String firstName = "cyDEo";
        String lastName = "SCHOOL";

        // Format the full name
        String formattedFirstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();
        String formattedLastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase();
        String fullName = formattedFirstName + " " + formattedLastName;

        // Print the full name
        System.out.println("Full name:");
        System.out.println(fullName);


    }

}
/*
Write a program that asks the user to enter first and last names and then prints the full name in regular format
(first character in uppercase).

        Example:
              Input:
                  firstName = "cyDEo";
                  lastName = "SCHOOL";

              Output:
                   Cydeo School
 */