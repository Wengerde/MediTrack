import java.util.ArrayList;

public class PatientenVerwaltung {
    private static ArrayList<Patient> patientenListe;

    // Konstruktor, um die Patientenliste zu initialisieren
    public PatientenVerwaltung() {
        patientenListe = new ArrayList<>();
        // Beispielpatienten hinzugefügt
        patientenListe.add(new Patient("Max Mustermann", 45));
        patientenListe.add(new Patient("Anna Müller", 30));
    }

// Methode zur Anzeige der Patientenübersicht
public static void zeigePatientenuebersicht() {
    System.out.println("Patientenübersicht:");
    for (Patient patient : patientenListe) {
        System.out.println("Name: " + patient.getName() + ", Alter: " + patient.getAlter());
    }
}

public class Patient {
    private String name;
    private int alter;

    // Konstruktor
    public Patient(String name, int alter) {
        this.name = name;
        this.alter = alter;
    }

    // Getter für den Namen und das Alter
    public String getName() {
        return name;
    }

    public int getAlter(){
        return alter;
    }
}
}

