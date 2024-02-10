package day11_practice_task;

public class EmployeeClients {

    public static void main(String[] args) {

          Employee employee1 = new Employee("James", 30, 'M', "IT", 100000);
          Employee employee2 = new Employee("Jimmy Smith", 25, 'M', "Driver", 55000);
          Employee employee3 = new Employee();


          employee3.setName("Susana");
          employee3.setAge(27);
          employee3.setGender('F');
          employee3.setJobTitle("Project Manager");
          employee3.setSalary(90000);


          employee1.work();
          employee2.work();
          employee3.work();


          System.out.println("\nEmployee 1 Details:");
          System.out.println(employee1.toString());

          System.out.println("\nEmployee 2 Details:");
          System.out.println(employee2.toString());

          System.out.println("\nEmployee 3 Details:");
          System.out.println(employee3.toString());
    }
}