package day03_practice_tasks;

public class SelfTask4_Operators_SalaryCalculator {
/*Create a class named SalaryCalculator. Given the following variables:
				hourlyRate (double)
				weeklyHours (int)
				stateTaxRate (double)
				federalTaxRate (double)

	Use the given information above to calculate the following:
				salaryBeforeTax (Yearly salary before tax)
				stateTax (Yearly state tax)
				federalTax (Yearly federal tax)
				totalTax (yearly total tax)
				salaryAfterTax (Yearly salary after tax)

		Assume that there are 52 work weeks in a year.

	Display each of the above in the following format:

					Example:
						hourlyRate = $50
						weeklyHours = 45
						stateTaxRate = 6  (given as a percentage)
						federalTaxRate = 26 (given as a percentage)

					Output:
						Gross pay is: $117000.0
						Federal tax is: $30420.0
						State tax is: $7020.0
						Total tax is: $37440.0
						Net income is: $79560.0
 */

   /*
    public static void main(String[] args) {
        double hourlyRate = 50;
        double weeklyHours = 45;
        double stateTaxRate = 6;
        double federalTaxRate = 26;
        double salaryBeforeTax = (hourlyRate * weeklyHours) * 52;
        double stateTax = (salaryBeforeTax * 6) / 100;
        double federalTax = (salaryBeforeTax * 26) / 100;
        double totalTax = stateTax + federalTax;
        double netInCome = salaryBeforeTax - (totalTax);

        System.out.println("Gross pay is: $" + salaryBeforeTax);
        System.out.println("Federal tax is; $" + federalTax);
        System.out.println("State  tax is: $" + stateTax);
        System.out.println("Total tax is; $" + totalTax);
        System.out.println("Net income is: $" + netInCome);
    }
}*/
   public static void main(String[] args) {

        double hourlyRate = 50;
        int weeklyHours = 45;
        double stateTaxRate = 6;
        double federalTaxRate = 26;
        int workWeeks = 52;
        double GrossPay = hourlyRate * weeklyHours * workWeeks;
        double FederalTax = GrossPay / 100 * 26;
        double StateTax = GrossPay / 100 * 6 ;
        double TotalTax = StateTax + FederalTax;
       double NetIncome = GrossPay - (TotalTax);


        System.out.println (" Gross pay is " + GrossPay);
        System.out.println(" Federal tax is " + FederalTax);
        System.out.println(" State tax is " + StateTax);
        System.out.println(" Total tax is " + (FederalTax + StateTax));
        System.out.println(" Net income is " + NetIncome );


    }

}
