public class Medikament {
    private String name;
    private int bestand;

    // Konstruktor
    public Medikament(String name, int bestand) {
        this.name = name;
        this.bestand = bestand;
    }

    // Getter für den Namen und den Bestand
    public String getName() {
        return name;
    }

    public int getBestand() {
        return bestand;
    }


}
