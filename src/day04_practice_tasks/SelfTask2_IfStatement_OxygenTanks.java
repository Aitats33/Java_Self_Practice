package day04_practice_tasks;
/*2. Create a class named OxygenTank. You are diving in the ocean. Your oxygen tank has a certain
level (number), and you must print a message based on the level:

		Above 90 - Your tank is full
		Above 80 - Still okay
		Above 70 - Don't go too far
		Above 60 - Start to head back
		Above 50 - Be careful, you're at 50%

			Example:
				   oxygenLevel = 75;

			Output:
				  Don't go too far
 */
public class SelfTask2_IfStatement_OxygenTanks {

    public static void main(String[] args) {

        int OxygenTank = 85 ;

        if (OxygenTank >= 90){
            System.out.println("Your tank is full");
        } else if (OxygenTank >= 80) {
            System.out.println("Still okay");
        } else if (OxygenTank >= 70) {
            System.out.println("Don't go too far");
        } else if (OxygenTank >=60) {
            System.out.println("Start to head back");
        }else  {
            System.out.println("Be careful, you're at 50%");
        }


    }

}
