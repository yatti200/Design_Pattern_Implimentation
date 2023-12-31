package Exercice10;

public class Main {

    public static void main(String[] args) {
        String region = "Italy";

        // Create the region factory
        PizzaFactory pizzaFactory = RegionFactory.createRegionFactory(region);


        Pizza fromagePizza = pizzaFactory.createPizza("Fromage");
        fromagePizza.prepare();
        fromagePizza.bake();
        fromagePizza.cut();
        fromagePizza.box();


    }
}
