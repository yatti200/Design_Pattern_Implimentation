package Exercice2;

public abstract class AUtomobile {
    private String modele;
    private String couleur;
    private int puissance;
    private double espace;


    public AUtomobile(String modele, String couleur, int puissance, double espace) {
        this.modele = modele;
        this.couleur = couleur;
        this.puissance = puissance;
        this.espace = espace;
    }

    public abstract void afficherCaracteristiques();

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public int getPuissance() {
        return puissance;
    }

    public void setPuissance(int puissance) {
        this.puissance = puissance;
    }

    public double getEspace() {
        return espace;
    }

    public void setEspace(double espace) {
        this.espace = espace;
    }
}
