package day07_practice_task;

public class ItemClients {

    public static void main(String[] args) {

Item item = new Item();

item.Name = "Car";
item.unitPrice = 40000;
item.quantity = 20;
item.calCost = item.unitPrice * item.quantity;

        System.out.println(" The item name is :" + item.Name);
        System.out.println("The unit price is :" + item.unitPrice);

        item.calCost();
        System.out.println(item);


    }


}
