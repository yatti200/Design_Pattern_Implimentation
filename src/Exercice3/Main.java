package Exercice3;

public class Main {
    public static void main(String[] args) {

        Database database = Database.getInstance();

        database.editRecord("Nouvel enregistrement");

        System.out.println("Nom de la base de données : " + database.getName());

        System.out.println("Enregistrement actuel : " + database.getRecord());
    }

}
