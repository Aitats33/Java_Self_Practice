package day04_practice_tasks;

public class GradeLevel {
/* Create a class called GradeLevel. Given a number (byte) gradeLevel, determine and print which
	school type someone is in. The grade levels and types are:

		1-5: Elementary school
		6-8: Middle school
		9-12: High school
		13-16: College
		17-18: Grad School
		For any other grade level, print "Invalid grade level."

			Example:
				   gradeLevel = 8

			Output:
				  Middle school
 */
    public static void main(String[] args) {


        /*      byte number = 11;
        String gradeLevel = "";

        boolean validNumber = number >= 1 && number <= 18;

        if (validNumber) { // 1 ~ 18

            if (number >= 17) {
                gradeLevel = "Grad School";
            } else if (number >= 13) {
                gradeLevel = "College";
            } else if (number >= 9) {
                gradeLevel = "High School";
            } else if (number >= 6) {
                gradeLevel = "Middle School";
            } else if (number >= 1) {
                gradeLevel = "Elementary School";
            }

        } else {
            gradeLevel = "Invalid Grade Level";
        }


        System.out.println(gradeLevel);

*/



     /*   byte gradeLevel = 8;

        if (gradeLevel >=1 && gradeLevel <=5) {
            System.out.println("Elementary school");

        } else if (gradeLevel >=6 && gradeLevel <=8) {
            System.out.println("Middle school");

        } else if (gradeLevel >=9 && gradeLevel <=12) {
            System.out.println("High school");

        } else if (gradeLevel >=13 && gradeLevel <=16) {
            System.out.println("Collage");

        } else if (gradeLevel >= 17 && gradeLevel <= 18) {
            System.out.println("Grad school");

*/
        byte gradeLevel = 15;

        if (gradeLevel <= 5 ) {
            System.out.println("Elementary school");
        } else if (gradeLevel <= 8) {
            System.out.println("Middle school");
        } else if (gradeLevel <= 12) {
            System.out.println("High school");
        } else if (gradeLevel <=16) {
            System.out.println("College");
        } else if (gradeLevel <=18) {
            System.out.println("grad school");
        } else {
            System.out.println("Invalid grade level");
        }
    }
}




