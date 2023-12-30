package Exercice1;

public class Client {
    public static void main(String[] args) {
        int programNumber = 4;

        ProgrammeInterface program = ProgrammeFactory.getProgramme(programNumber);

        program.go();
    }
}
