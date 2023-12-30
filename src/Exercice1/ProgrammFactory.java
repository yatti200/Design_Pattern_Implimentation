package Exercice1;

public class ProgrammFactory {
    public static ProgrammInterface getProgramme(int programNumber){

        switch (programNumber) {
            case 1:
                System.out.println("Je suis le main1");
                return new Programm1();

            case 2:
                System.out.println("Je suis le main2");
                return new Programm2();

            case 3:
                System.out.println("Je suis le main3");
                return new Programm3();
            case 4:
                System.out.println("Je suis le main4");
                return new Programm4();

            default:
                System.out.println("Invalid program number. Please provide 1, 2, or 3.");

        }
        return null;
    }
}
