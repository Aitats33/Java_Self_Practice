package day11_practice_task;

public class Employee {

    private String name;
    private int age;
    private char gender;
    private String jobTitle;
    private double salary;


    public Employee(String name, int age, char gender, String jobTitle, double salary) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }


    public Employee() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void work() {
        System.out.println(jobTitle + " " + name + " is working.");
    }



    public String toString() {
        return "Employee Details:\n" +
                "Name: " + name + "\n" +
                "Age: " + age + "\n" +
                "Gender: " + gender + "\n" +
                "Job Title: " + jobTitle + "\n" +
                "Salary: $" + salary;
    }
}


/*Create a custom class named Employee with the following specifications:

	Attributes:
			name (String)
			age (int)
			gender (char)
			jobTitle (String)
			salary (double)

    Constructors:
			Add multiple constructors to set different fields of the employee object.

    Actions:
		work(): prints the job title and name of the employee concatenated with " is working."
		toString(): returns a string representation of the employee object.

	Create another class named EmployeeClients, create multiple employee objects,
	 and test each function of the employee object.


 */