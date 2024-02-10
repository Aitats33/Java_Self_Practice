package day07_practice_task;

import java.util.Scanner;


    public class FamilyMembers_Scanner {
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            int people = 7;
            String result;

            System.out.println(" How many people do you live?");

            if (people < 3){
                result = "Live with less than three people.";

            }else if(people >=3 && people <= 6 ){
                result = "Live with 3 - 6 people.";
            }else{
                result = "Live with more than six people.";

            }

            System.out.println(result);


        }
    }
/*5. Create a class named FamilyMembers and write a program that asks the user how many people they live with.

    If the user lives with fewer than three people, print "Live with less than three people."
    If the user lives with 3 - 6 people, print "Live with 3 - 6 people."
    If the user lives with more than six people, print "Live with more than six people."

        Example:
             How many people do you live with?
             Input: 3

        Output:
             Live with 3 - 6 people.
 */