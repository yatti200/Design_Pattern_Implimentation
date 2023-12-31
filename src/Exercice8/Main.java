package Exercice8;

public class Main {
    public static void main(String[] args)
    {
        VueCatalogue vueCatalogue1 = new VueCatalogue(new
                DessinTroisVehiculeLigne());
        vueCatalogue1.dessine();
        VueCatalogue vueCatalogue2 = new VueCatalogue(new
                DessinUnVehiculeLigne());
        vueCatalogue2.dessine();
    }
}
