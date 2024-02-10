package day07_practice_task;

public class EmployeeClients {

    public static void main(String[] args) {

        Employee employee = new Employee();

        employee.name = "Josh";
        employee.age = 28;
        employee.gender = 'M';
        employee.jobTitle = "IT";
        employee.salary = 47.575;


        System.out.println("Name: " + employee.name);
        System.out.println("Age: " + employee.age);
        System.out.println("Gender: " + employee.gender);
        System.out.println("Job Title: " + employee.jobTitle);
        System.out.println("Salary: " + employee.salary);


        employee.work();


        System.out.println(employee);

        System.out.println("-------------------------------");


        Employee employee1 = new Employee();

        employee1.name = " Frank ";
        employee1.age = 35;
        employee1.gender = 'M';
        employee.jobTitle = "HR";
        employee1.salary = 41.352;




        System.out.println("Name: " + employee1.name);
        System.out.println("Age: " + employee1.age);
        System.out.println("Gender: " + employee1.gender);
        System.out.println("Job Title: " + employee1.jobTitle);
        System.out.println("Salary: " + employee1.salary);

        employee1.work();

        System.out.println(employee1);


    }
}
