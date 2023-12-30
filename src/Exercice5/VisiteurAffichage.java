package Exercice5;

public class VisiteurAffichage implements VisiteurArbre{
    @Override
    public void visiter(NoeudPlus noeudPlus) {
        System.out.print("+ ");
        noeudPlus.accept(this);
    }

    @Override
    public void visiter(NoeudMoins noeudMoins) {
        System.out.print("- ");
        noeudMoins.accept(this);
    }

    @Override
    public void visiter(NoeudValeur noeudValeur) {
        System.out.print(noeudValeur.getValeur() + " ");
    }
}
