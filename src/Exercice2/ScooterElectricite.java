package Exercice2;

public class ScooterElectricite extends Scooter {
    private int autonomieBatterie;


    public ScooterElectricite(String modele, String couleur, int puissance, int autonomieBatterie) {
        super(modele, couleur, puissance);
        this.autonomieBatterie = autonomieBatterie;
    }


    @Override
    public void afficherCaracteristiques() {
        System.out.println("Scooter électrique :");
        System.out.println("Modèle : " + getModele());
        System.out.println("Couleur : " + getCouleur());
        System.out.println("Puissance : " + getPuissance() + " chevaux");
        System.out.println("Autonomie de la batterie : " + autonomieBatterie + " kilomètres");
    }
}
