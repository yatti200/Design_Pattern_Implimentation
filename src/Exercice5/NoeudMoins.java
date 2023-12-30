package Exercice5;

public class NoeudMoins implements Noeud {
    private Noeud gauche;
    private Noeud droit;

    public NoeudMoins(Noeud gauche, Noeud droit) {
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
