package day05_practice_tasks;

public class Triangle {

    public static void main(String[] args) {

        int rows = 11;

        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j < i; j++) {

                System.out.print("*");
            }
            System.out.println();

        }
    }
    }

/*Create a class named Triangle and use a nested loop to display the following shape on the console:
 *
 * *
 * * *
 * * * *
 * * * * *
 * * * * * *
 * * * * * * *
 * * * * * * * *
 * * * * * * * * *
 * * * * * * * * * *
 * for (int j = 1; j < i; j++) {
 */