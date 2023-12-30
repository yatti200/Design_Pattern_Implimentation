package Exercice2;

public class FabriqueVehiculeElectricite implements FabriqueVehicule {

    @Override
    public AUtomobile creerAutomobile(String modele, String couleur, int puissance, double espace) {
        return new AutomobileElectricite(modele, couleur, puissance, espace, 0);
    }

    @Override
    public Scooter creerScooter(String modele, String couleur, int puissance) {
        return new ScooterElectricite(modele, couleur, puissance, 0);
    }
}

