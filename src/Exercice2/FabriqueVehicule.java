package Exercice2;

public interface FabriqueVehicule {
    AUtomobile creerAutomobile(String modele, String couleur, int puissance, double espace);
    Scooter creerScooter(String modele, String couleur, int puissance);
}
