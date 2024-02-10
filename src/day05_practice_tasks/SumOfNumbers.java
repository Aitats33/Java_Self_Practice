package day05_practice_tasks;

public class SumOfNumbers {

    public static void main(String[] args) {


        int num1 = 100;
        int sum= 0;

        for (int i = 1; i <= num1; i++ ) {
            sum += i;
        }
        System.out.println(sum);
    }
}


/*
4. Create a class named SumOfNumbers and write a program to calculate the sum of all numbers between 1 and any given number.

				Example 1:
					   number = 100

				Output:
					  5050


				Example 2:
					    number = 50

				Output:
					  1275

 */