package Exercice6;

public class Main {
    public static void main(String[] args)
    {
        Vehicule vehicule = new Vehicule();
        vehicule.setDescription("Véhicule bon marché");
        vehicule.setPrix(5000.0);
        VueVehicule vueVehicule = new VueVehicule(vehicule);
        vueVehicule.affiche();
        vehicule.setPrix(4500.0);
        vueVehicule.affiche();
        VueVehicule vueVehicule2 = new VueVehicule(vehicule);
        vehicule.setPrix(5500.0);
        vueVehicule.affiche();
        vueVehicule2.affiche();
    }
}
