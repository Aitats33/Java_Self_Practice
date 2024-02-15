package day14.practice_task;

public class CarClient {

    public static void main(String[] args) {

        Toyota toyota = new Toyota("Toyota", "Yaris", 2024, 17.500, "Red");
        Honda honda = new Honda("Honda", "Civic", 2024, 28.000, "Black");
        BMW bmw = new BMW("BMW", "mi", 2024, 60000.0, "Blue");
        Audi audi = new Audi("Audi", "Q7", 2024, 57.500, "White");
        Mercedes mercedes = new Mercedes("Mercedes","SLQ", 2015, 42.000, "White");
        Tesla tesla = new Tesla("Tesla", "S", 2024, 100000.0, "Red");
        Nio nio = new Nio("Nio", "ES8", 2021, 25000.0, "Green");
        CydeoCar cydeoCar = new CydeoCar("Cydeo", "Cydeo", 2024, 22.352, "Yellow");

        carFunctions(toyota);
        carFunctions(honda);
        carFunctions(bmw);
        carFunctions(audi);
        carFunctions(mercedes);
        carFunctions(tesla);
        carFunctions(nio);
        carFunctions(cydeoCar);

    }
    public static void carFunctions(Car car) {
        System.out.println("Testing " + car.getMake() + " " + car.getModel() + ":");
        car.start();
        car.drive();
        car.stop();
        if (car instanceof AutoPark) {
            ((AutoPark) car).autoPark();
        }
        if (car instanceof AutoPilot) {
            ((AutoPilot) car).selfDrive();
        }
        if (car instanceof Flyable) {
            ((Flyable) car).fly();
        }
        System.out.println();
    }
}




