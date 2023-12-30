package Exercice5;

public class NoeudValeur implements Noeud{
    private int valeur;

    public NoeudValeur(int valeur) {
        this.valeur = valeur;
    }

    public int getValeur() {
        return valeur;
    }


    public void accept(VisiteurArbre visiteur) {
        visiteur.visiter(this);
    }
}
