package day04_practice_tasks;
/*
Create a class named MonthName. Given an integer variable named number representing the number
of the month, write a program that displays the month's name based on the given number.
Example 1:
				     number = 10

			Output:
				  October

			Example 2:
				     number = -20

			Output:
				  No such month
 */
public class MonthName_SelfPractice11 {

    public static void main(String[] args) {

        int number = 2;

        String month = switch (number){
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "No such a month";
        };

        System.out.println(month);

    }

}


/*
      int month = 10;
        switch (month){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("Aug");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
            default:
                System.out.println("No such month");

        }

    }
}
 */




