package Exercice10;

public class RegionFactory {
    public static PizzaFactory createRegionFactory(String region) {
        if (region.equals("Italy")) {
            return new ItalianPizzaFactory();
        } else if (region.equals("Algeria")) {
            return new AlgerianPizzaFactory();
        }

        return null;
    }
}
