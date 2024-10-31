import java.util.ArrayList;
import java.util.Scanner;

public class MedikamentenVerwaltung {
    private ArrayList<Medikament> medikamentenListe;

    // Konstruktor, um die Medikamentenliste zu initialisieren
    public MedikamentenVerwaltung() {
        medikamentenListe = new ArrayList<>();
        // Beispielmedikamente hinzugefügt
        medikamentenListe.add(new Medikament("Aspirin", 20));
        medikamentenListe.add(new Medikament("Ibuprofen", 10));
    }

    public void zeigeMedikamentenUebersicht() {
        System.out.println("Medikamentenübersicht:");
        for (Medikament medikament : medikamentenListe) {
            System.out.println("Name: " + medikament.getName() + ", Bestand: " + medikament.getBestand());
        }
    }

    public void medikamentHinzufuegen() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bitte geben Sie den Namen des neuen Medikaments ein: ");
        String name = scanner.nextLine();
        System.out.print("Bitte geben Sie den Bestand des neuen Medikaments ein: ");
        int bestand = scanner.nextInt();

        Medikament neuesMedikament = new Medikament(name, bestand);
        medikamentenListe.add(neuesMedikament);

        System.out.println("Neues Medikament hinzugefügt: " + name + ", Bestand: " + bestand);
    }
}
