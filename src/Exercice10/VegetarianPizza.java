package Exercice10;

public class VegetarianPizza implements Pizza {

    @Override
    public void prepare() {
        System.out.println("Préparation de la pizza végétarienne");
    }

    @Override
    public void bake() {
        System.out.println("Cuisson de la pizza végétarienne");
    }

    @Override
    public void cut() {
        System.out.println("Découpage de la pizza végétarienne");
    }

    @Override
    public void box() {
        System.out.println("Mise en boîte de la pizza végétarienne");
    }
}
