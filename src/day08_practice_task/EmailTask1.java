package day08_practice_task;

public class EmailTask1 {

    public static void main(String[] args) {

        String email = "mike_tyson@gmail.com";


        String[] parts = email.split("_");


        if (parts.length == 2) {
            // Swap first name with last name and reconstruct the email address
            String firstName = parts[0];
            String lastName = parts[1].split("@")[0];
            String domain = parts[1].split("@")[1];
            String swappedEmail = lastName + "_" + firstName + "@" + domain;


            System.out.println("Output:");
            System.out.println(swappedEmail);
        } else {

            System.out.println("Output:");
            System.out.println(email);
        }

    }

}
/*Create a class called EmailTask1. Assume that the email address is constructed by a person's first name followed
by an underscore and last name. Write a program that can swap the first name with the last name in the email
(separated by an underscore). If the email doesn't contain an underscore, print the given input email.

        Example:
              Input:
                 mike_tyson@gmail.com

              Output:
                  tyson_mike@gmail.com
 */