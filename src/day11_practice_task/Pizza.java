package day11_practice_task;

public class Pizza {

public String size;
public int numberOfCheeseTopping;
public int numberOfPepperoniTopping;


public Pizza(String size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
    this.size = size;
    this.numberOfCheeseTopping = numberOfCheeseTopping;
    this.numberOfPepperoniTopping = numberOfPepperoniTopping;
}


public double calcCost() {
    double baseCost;

    switch (size.toLowerCase()) {
        case "small":
            baseCost = 10;
            break;
        case "medium":
            baseCost = 12;
            break;
        case "large":
            baseCost = 14;
            break;
        default:
            baseCost = 0;
            break;
    }


    return baseCost + (2 * (numberOfCheeseTopping + numberOfPepperoniTopping));
}

public String toString() {
    return "Pizza size: " + size + ", Cheese toppings: " + numberOfCheeseTopping +
            ", Pepperoni toppings: " + numberOfPepperoniTopping +
            ", Total cost: $" + calcCost();
}
}
/*Create a custom class named Pizza with the following specifications:

    Attributes:
		   size
		   numberOfCheeseTopping
		   numberOfPepperoniTopping

	Actions:
		calcCost(): returns the totalCost of the pizza
		toString(): returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()

   Pizza cost is determined by:
   		Small: $10 + $2 per topping
   		Medium: $12 + $2 per topping
   		Large: $14 + $2 per topping

    Create another class named PizzaClients, create multiple pizza objects, and test each function of the pizza object.


 */