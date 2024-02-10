package day05_practice_tasks;

public class Rectangle_UseALoops {

    public static void main(String[] args) {

        int givenNumber= 9;
        // control the row
        for (int i = 1; i < 10; i++) {

            //stars
            for (int j = 1; j <givenNumber ; j++) {


                System.out.print("\t");
                System.out.print ("*");
            }
            System.out.println( " ");



        }



    }
}
/*
1. Create a class named Rectangle. Use a loop to print the following shape on the console:

			* * * * * * * *
			* * * * * * * *
			* * * * * * * *
			* * * * * * * *
			* * * * * * * *
			* * * * * * * *
			* * * * * * * *
			* * * * * * * *
			* * * * * * * *
 */