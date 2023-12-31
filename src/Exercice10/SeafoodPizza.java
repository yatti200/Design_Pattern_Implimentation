package Exercice10;

public class SeafoodPizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Préparation de la pizza aux fruits de mer");
    }

    @Override
    public void bake() {
        System.out.println("Cuisson de la pizza aux fruits de mer");
    }

    @Override
    public void cut() {
        System.out.println("Découpage de la pizza aux fruits de mer");
    }

    @Override
    public void box() {
        System.out.println("Mise en boîte de la pizza aux fruits de mer");
    }
}
