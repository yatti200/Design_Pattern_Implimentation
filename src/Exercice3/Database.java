package Exercice3;

public class Database {
    private static Database instance;
    private String record;
    private String name;

    private Database() {
        this.record = "";
        this.name = "MaBaseDeDonnees";
    }

    public static Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }

    public void editRecord(String newRecord) {
        this.record = newRecord;
    }


    public String getName() {
        return this.name;
    }


    public String getRecord() {
        return this.record;
    }

}
