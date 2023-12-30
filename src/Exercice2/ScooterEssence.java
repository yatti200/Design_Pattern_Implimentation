package Exercice2;

public class ScooterEssence extends Scooter {
    private int consommationCarburant;

    public ScooterEssence(String modele, String couleur, int puissance, int consommationCarburant) {
        super(modele, couleur, puissance);
        this.consommationCarburant = consommationCarburant;
    }


    @Override
    public void afficherCaracteristiques() {
        System.out.println("Scooter à essence :");
        System.out.println("Modèle : " + getModele());
        System.out.println("Couleur : " + getCouleur());
        System.out.println("Puissance : " + getPuissance() + " chevaux");
        System.out.println("Consommation de carburant : " + consommationCarburant + " litres par 100 km");
    }
}
