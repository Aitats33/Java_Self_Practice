package day04_practice_tasks;
/*
Create a class named AgeGroups. An integer variable named age is given.
	Write a program that can determine the age group of a person. The age groups are:

		Teenager (0 ~ 20)
		Adult   (21 ~ 55)
      Senior  (55 or older)

		If the age is negative or greater than 150, print "Invalid."


			Example:
				   age = 42

			Output:
				  Young Middle-Aged Adult
 */
public class AgeGroups_SelfPractice8 {

    public static void main(String[] args) {


        int age = 75;

            boolean valid = age >= 0 && age <= 150;

            String result = "";

            if (valid) {

                if (age >= 55) {
                    result = "Senior";
                } else if (age >= 21) {
                    result = "Adult";
                } else {
                    result = "Teenager";
                }

            } else {
                result = "Invalid";
            }

            System.out.println(result);

        }
}


/*
public class AgeGroups {
    public static void main(String[] args) {
        int age = 900;
        if (age >=0 && age <= 20){
            System.out.println("Teenager");
        }
        else if (age >=21 && age <= 55) {
            System.out.println("Adult");
        }
        else if (age >=55 && age <=150) {
            System.out.println("senior");
        }
        else {
            System.out.println("Invalid");
        }

    }
}
 */

/*
 int age = 42;

        if (age >= 0 && age <= 20) {
            System.out.println("Teenager");

        } else if (age >=21 && age <= 55) {
            System.out.println("Young Middle-Aged Adult");

        } else if (age >= 55 && age <150) {
            System.out.println("Senior-Aged Adult");

        } else {
            System.out.println("Invalid");
        }
    }
}
 */