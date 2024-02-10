package day04_practice_tasks;

public class Grade2_SelfTask_Practice9 {
/*
Create a class called Grade2. A char variable named grade is given.
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

        char grade = 'D';

        String result;

        switch (grade) {
            case 'A':
                result = "Excellent";
                break;
            case 'B':
                result = "Great job";
                break;
            case 'C':
                result = "Good";
                break;
            case 'D':
                result = "Passed";
                break;
            case 'F':
                result = "Failed";
                break;
            default:
                result = "Invalid";
        }

        System.out.println(result);

    }

}

/* char grade = 'B';

        switch (grade) {

        case 'A' -> System.out.println("Excellent");
        case 'B' -> System.out.println("Great job");
        case 'C' -> System.out.println("Good");
        case 'D' -> System.out.println("Passed");
        case 'F' -> System.out.println("Failed");
        default -> System.out.println("Invalid Grade");
    }

    }
}

*/


