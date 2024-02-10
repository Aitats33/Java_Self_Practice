package day04_practice_tasks;
/*
Create a class called Calculator. Given two double variables named n1 and n2 and a char
variable named mathOperator, write a program that calculates the result of n1 and n2 based on
the given math operator.

		char operator -> -, +, *, /

		When the operator is +: add n1, n2
		When the operator is -: subtract n1, n2
		When the operator is *: multiply n1, n2
		When the operator is /: divide n1, n2
		For any other operators, print "invalid operator."

            Example:
                  n1 = 10, n2 = 20, mathOperator = '+'

            Output:
                  30
 */
public class Calculator_SelfPractice10 {

    public static void main(String[] args) {


        double n1 = 100,
                n2 = 200;

        char operator = '+';

        switch (operator) {
            case '-':
                System.out.println(n1 - n2);
                break;
            case '+':
                System.out.println(n1 + n2);
                break;
            case '*':
                System.out.println(n1 * n2);
                break;
            case '/':
                System.out.println(n1 - n2);
                break;

            default:
                System.out.println("Invalid Operator");


        }
    }
}


/*
   double n1 = 10,
            n2= 20;
        char operator = '+';
        switch (operator) {
            case '+' :
                System.out.println("Addition:"+(n1+n2));

            case '-':
                System.out.println("Subtraction:"+(n1-n2));
            case '/':
                System.out.println("Division:"+(n1/n2));
            case '*':
                System.out.println("Multiplication:"+(n1*n2));
            default:
                System.out.println("invalid Operator");}
        System.out.println(operator);
    }
}
 */
