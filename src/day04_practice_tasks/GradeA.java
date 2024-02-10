package day04_practice_tasks;

public class GradeA {
/*Create a class called Grade. A char variable named grade is given.
   Write a program to print the following messages:

		'A': Excellent
		'B': Great job
		'C': Good
		'D': Passed
		'F': Failed
		Otherwise: Invalid Grade

			Example:
				   grade = 'B'

			Output:
				  Great job
 */

    public static void main(String[] args) {

 /*     char grade = 'A' ;

      boolean validGrade =(grade >= 'A' && grade <= 'D' ) || grade == 'F';

      String result;

      if (validGrade){
          if (grade =='A'){
              result = " Excellent ";
          } else if (grade == 'B') {
              result = " Great Job ";
          } else if (grade == 'C') {
              result = "Good" ;
          } else if (grade == 'D') {
              result = "Passed" ;
          }else {
              result ="Failed" ;
          }
      }else {
          result = "Invalid Grade";
      }
        System.out.println(grade);

        System.out.println(result);
*/

        char  grade='C';
        if (grade == 'A') {
            System.out.println("Excellent ");
        } else if (grade=='B') {
            System.out.println("Great Job");

        } else if (grade=='C') {
            System.out.println("Good");

        } else if (grade=='D') {
            System.out.println("Passed");

        } else if (grade=='F') {
            System.out.println("Failed");

        }
        System.out.println(grade);


    }
}
