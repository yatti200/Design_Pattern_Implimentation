package Exercice4;

public class Main {
    public static void main(String[] args) {
        CompteBancaire compte1 = new CompteBancaire(123, 0);
        CompteBancaire compte2 = new CompteBancaire(321, 0);

        compte1.deposerArgent(100);
        compte1.retirerArgent(80);

        compte2.deposerArgent(200);
        compte2.retirerArgent(110);

        Journalisation journal = Journalisation.getInstance();
        System.out.println("Journaux de log :\n" + journal.getLogs());
    }
}
