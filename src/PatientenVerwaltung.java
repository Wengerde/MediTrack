import java.util.ArrayList;
import java.util.Scanner;

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

public void patientenHinzufuegen() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Bitte geben Sie den Namen des neuen Patienten ein: ");
    String name = scanner.nextLine();
    System.out.println("Bitte geben Sie das Alter des neuen Patienten ein: ");
    int alter = scanner.nextInt();

    // Neuen Patienten zur Liste hinzufügen
    Patient neuerPatient = new Patient(name, alter);
    patientenListe.add(neuerPatient);

    System.out.println("Neuer Patient hinzugefügt: " + name + ", Alter: " + alter);
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

