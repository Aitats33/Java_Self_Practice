package day02_practice_tasks;

public class PhoneNumber {

    public static void main(String[] args) {

        byte countryCode =1;
        short areaCode = 703;
        int localNumber = 4512625;

        System.out.println("Phone number is:" + (" + ") + countryCode + "(" + areaCode + ")-" +localNumber );

    }

}


/*
Phone number is: +1(703)-4512625
1. Create a class named PhoneNumber and declare the following variables:
		countryCode
		areaCode
		localNumber

	Use string concatenation to display the phone number.

		Example:
			countryCode = 1;
		      areaCode = 703;
		      localNumber = 4512625;

		Output:
			Phone number is: +1(703)-4512625
 */
