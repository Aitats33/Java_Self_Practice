package day07_practice_task;

import java.util.Scanner;

public class GradeReportTask7 {

    public static void main(String[] args) {



                Scanner input = new Scanner(System.in);

                System.out.println("Enter your score");
                int score = input.nextInt();

                String result = "Invalid Score";

                if (score >= 0 && score <= 100) {

                    if (score >= 90) {
                        result = "A";
                    } else if (score >= 80) {
                        result = "B";
                    } else if (score >= 70) {
                        result = "C";
                    } else if (score >= 60) {
                        result = "D";
                    } else {
                        result = "F";
                    }

                }

                System.out.println(result);

                input.close();

            }

        }



   /*
        Scanner input = new Scanner(System.in);


        System.out.println(" Enter you score");

        int score = input.nextInt();


        if (score > 0 && score < 100) {
            if (score > 90 && score <= 100) {
                System.out.println("Your grade is A");
            }
        } else if (score > 80 && score <= 90) {
            System.out.println("Your grade is B");
        } else if (score > 70 && score <= 80) {
            System.out.println("Your grade is C");
        } else {
            System.out.println("Invalid Score");
        }




        System.out.println(score);
        input.close();
    }
}

    */
/*7)Create a class named GradeReport and write a program asking the user to enter their score and print the student's grade.

  If the user enters an invalid score (negative or more than 100), print "Invalid Score."

        Example:
             Enter your score:
             Input: 85

        Output:
             Your grade is B
 */