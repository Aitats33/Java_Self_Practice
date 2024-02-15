package day14.practice_task;

public class Toyota extends Car{

    public Toyota(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println("Toyota started");

    }

    @Override
    public void drive() {
        System.out.println("Toyota is driving");


    }
}
