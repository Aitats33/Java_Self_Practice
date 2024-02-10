package day05_practice_tasks;

public class FactorialNumber_returnTheFactorial_number_of_any_given_number {

    public static void main(String[] args) {


        int num=10;

        for (int i = 1; i <5; i++) {

            num*=i;
        }
        System.out.println(num);
    }
}

/*
5. Create a class named FactorialNumber. Write a program that can return the factorial number of any given number.

				Example:
					  num = 5

				Output:
					  120

			(because: 5! = 5 * 4 * 3 * 2* 1 = 120 )
 */
/*
int num = 5;
        int multiple = 1 ;
        for (int i = 1; i <= num; i++) {
            multiple *=i;
        }
        System.out.println(multiple);
 */