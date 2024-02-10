package day04_practice_tasks;
/*Create a class called CrewAndPassenger. Given the total number of people on the ship,
	determine how many should be crew members and how many can be passengers.

		Total: 50 ====> 20 crew, 30 passengers
		Total: 75 ====> 25 crew, 50 passengers
		Total: 100 ====> 30 crew, 70 passengers
		Any other number of people on the ship is not valid.
		Print how many of each type there should be.

			Example:
				   number = 75

			Output:
				  25 crew, 50 passengers
*/
public class CrewAndPassenger_SelfPractice7 {

    public static void main(String[] args) {

        int totalOnTrip = 75;

        if (totalOnTrip == 50) {
            System.out.println("20 crew, 30 passengers");
        } else if (totalOnTrip == 75) {
            System.out.println("25 crew, 50 passengers");
        } else if (totalOnTrip == 100) {
            System.out.println("30 crew, 70 passengers");
        } else {
            System.out.println("Invalid");


        }

    }
}


/*
int number = 75;
        String result = "";

        boolean validNumber = number == 50 || number == 75 || number == 100;

        if (validNumber) { // number: 50, 75, 100

            if (number == 50) {
                result = "20 crew, 30 passengers";
            } else if (number == 75) {
                result = "25 crew, 50 passengers";
            } else {
                result = "30 crew, 70 passengers";
            }

        } else {
            result = "Invalid Number";
        }


        System.out.println(result);
    }

}
 */