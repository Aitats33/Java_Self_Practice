package day06_practice_tasks;

public class MathUtility {

    public static void main(String[] args) {


    int resultI = calculate(10, '+', 20);
        System.out.println(resultI);

    double resultD = calculate(2.5,'*',3.0 );
        System.out.println(resultD);

        System.out.println(square(8));

        System.out.println(square(1.5));

        System.out.println(cube(3));

        System.out.println(cube(2.5));


}

public static int calculate (int n1, char operator, int n2){
    int result;
    if (operator == '+'){
        result = n1 + n2;
    }else if (operator == '-'){
        result = n1 - n2;
    }else if (operator == '*'){
        result = n1 * n2;
    } else if (operator == '/'){
        result = n1 / n2;
    }else{
        return 0;
    }
    return result;
}
public static double calculate (double n1, char operator, double n2){
    double result;
    if (operator == '+'){
        result = n1 + n2;
    }else if (operator == '-'){
        result = n1 - n2;
    }else if (operator == '*'){
        result = n1 * n2;
    } else if (operator == '/'){
        result = n1 / n2;
    }else{
        return 0;
    }
    return result;
}
public static int square (int num){
    return num * num;
}
public static double square (double num){
    return num * num;
}
public static int cube (int num){
    return num*num*num;
}
public static double cube (double num){
    return num*num*num;
}
}




/*5. Create a class named MathUtility:

	5.1 Create a method named calculate that takes three arguments (Two integers and a char) and returns the result based on the operator.

		If the operator is +:
			The method should return the addition of the two numbers

		If the operator is -:
			The method should return the subtraction of the two numbers

		If the operator is *:
			The method should return the multiplication of the two numbers

		If the operator is /:
			The method should return the multiplication of the two numbers

	for any other operators, the method should return 0


			Example:
				int result = calculate(10, '+', 20);

			Output:
				30


	5.2 Overload the calculate method to handle double numbers.

			Example:
				double result = calculate(2.5, '*', 3.0);

			Output:
				7.5


	5.3 Create a method named square that takes an int and returns the square, hierarchically calling the
	calculate method to calculate the square.

			Example:
				int num = square(8);

			Output:
				64

	5.4 Overload the square method for double numbers.

			Example:
				double num = square(1.5);

			Output:
				2.25

	5.5 Create a method named cube that takes an int and returns the cube, hierarchically calling the
	square method to calculate the cube.

			Example:
				int num = cube(3);

			Output:
				9

	5.6 Overload the cube method for double numbers.

			Example:
				double num = cube(2.5);

			Output:
				15.625

 */
/*package day06_method_practices;

public class MathUtility {
    public static void main(String[] args) {

        double result = calculate(10, '+', 20);
        System.out.println(result);
        result = calculate(2.5, '*', 3.0);
        System.out.println(result);

        int num = square(8);
        System.out.println(num);
        double num1 = square(1.5);
        System.out.println(num1);
        int num2 = cube(3);
        System.out.println(num2);
        double num3 = cube(2.5);
        System.out.println(num3);
    }

    public static int calculate(int a, char c, int b) {
        int result;

        return result = (c == '+') ? a + b : (c == '-') ? a - b : (c == '*') ? a * b : (c == '/') ? a / b : (c == '%') ? a % b : 0;
    }

    public static double calculate(double a, char c, double b) {
        double result;
        return result = (c == '+') ? a + b : (c == '-') ? a - b : (c == '*') ? a * b : (c == '/') ? a / b : (c == '%') ? a % b : 0;
    }

    public static int square(int num) {

        return calculate(num, '*', num);

    }

    public static double square(double num) {
        return calculate(num, '*', num);

    }

    public static int cube(int num) {
        return square(num) * num;

    }

    public static double cube(double num) {
        return square(num) * num;

    }

}
 */
