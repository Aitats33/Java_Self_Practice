package day14.practice_task;

public class BMW extends Car{

    public BMW(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println("BMW started");

    }

    @Override
    public void drive() {
        System.out.println("BMW is driving");


    }
}



