package day11_practice_task;

public class PizzaClients {

    public static void main(String[] args) {

        Pizza pizza1 = new Pizza("small", 1, 2);
        Pizza pizza2 = new Pizza("medium", 2, 1);
        Pizza pizza3 = new Pizza("large", 3, 3);


        System.out.println("Pizza 1 details:");
        System.out.println(pizza1.toString());
        System.out.println();

        System.out.println("Pizza 2 details:");
        System.out.println(pizza2.toString());
        System.out.println();

        System.out.println("Pizza 3 details:");
        System.out.println(pizza3.toString());

    }

}
