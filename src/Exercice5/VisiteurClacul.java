package Exercice5;

public class VisiteurClacul implements VisiteurArbre{

    private int resultat;

    public int getResultat() {
        return resultat;
    }

    @Override
    public void visiter(NoeudPlus noeudPlus) {
        noeudPlus.getGauche().accept(this);
        noeudPlus.getDroit().accept(this);
        resultat = getResultat() + getResultat();
    }

    @Override
    public void visiter(NoeudMoins noeudMoins) {
        noeudMoins.getGauche().accept(this);
        noeudMoins.getDroit().accept(this);
        resultat = getResultat() - getResultat();
    }

    @Override
    public void visiter(NoeudValeur noeudValeur) {
        resultat = noeudValeur.getValeur();
    }
}
