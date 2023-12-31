package Exercice10;

public class ItalianPizzaFactory implements PizzaFactory{
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("Fromage")) {
            pizza = new CheesePizza();
        } else if (type.equals("FruitsDeMer")) {
            pizza = new SeafoodPizza();
        } else if (type.equals("Végétarienne")) {
            pizza = new VegetarianPizza();
        }

        return pizza;
    }
}
