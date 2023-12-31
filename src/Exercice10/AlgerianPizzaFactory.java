package Exercice10;

public class AlgerianPizzaFactory implements PizzaFactory{
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("Fromage")) {

        } else if (type.equals("FruitsDeMer")) {

        } else if (type.equals("Végétarienne")) {

        }

        return pizza;
    }

}
