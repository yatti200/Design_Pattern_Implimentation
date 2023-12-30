package Exercice5;

public class NoeudPlus implements Noeud{
    private Noeud gauche;
    private Noeud droit;

    public NoeudPlus(Noeud gauche, Noeud droit) {
        this.gauche = gauche;
        this.droit = droit;
    }

    public Noeud getGauche() {
        return gauche;
    }

    public Noeud getDroit() {
        return droit;
    }

    @Override
    public void accept(VisiteurArbre visiteur) {
        visiteur.visiter(this);
    }
}
