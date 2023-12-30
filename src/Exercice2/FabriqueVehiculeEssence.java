package Exercice2;

public class FabriqueVehiculeEssence implements FabriqueVehicule{
    @Override
    public AUtomobile creerAutomobile(String modele, String couleur, int puissance, double espace) {
        return new AutomobileEssence(modele, couleur, puissance, espace, 0);
    }

    @Override
    public Scooter creerScooter(String modele, String couleur, int puissance) {
        return new ScooterEssence(modele, couleur, puissance, 0);
    }
}
