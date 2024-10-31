import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BenutzerVerwaltung benutzerVerwaltung = new BenutzerVerwaltung(); // Objekt der neuen Klasse erstellt
        benutzerVerwaltung.benutzerAnmeldung(); // Benutzeranmeldung aufrufen

        // Patientenverwaltung und Medikamentenverwaltung erstellen
        PatientenVerwaltung patientenVerwaltung = new PatientenVerwaltung();
        MedikamentenVerwaltung medikamentenVerwaltung = new MedikamentenVerwaltung();

        // Scanner erstellt, um Benutzereingaben zu lesen
        Scanner scanner = new Scanner(System.in);
        boolean programmlaeuft = true;

        // Hauptmenü-Schleife
        while (programmlaeuft) {
            System.out.println("\nHauptmenü:");
            System.out.println("1. Patientenübersicht anzeigen");
            System.out.println("2. neuen Patient hinzufügen");
            System.out.println("3. Medikamentenübersicht anzeigen");
            System.out.println("4. Neues Medikament hinzufügen");
            System.out.println("5. Programm beenden");
            System.out.println("Wählen Sie eine Option: ");
            int auswahl = scanner.nextInt();

            switch (auswahl) {
                case 1:
                    PatientenVerwaltung.zeigePatientenuebersicht();
                    break;
                case 2:
                    patientenVerwaltung.patientenHinzufuegen();
                    break;
                case 3:
                    medikamentenVerwaltung.zeigeMedikamentenUebersicht();
                    break;
                case 4:
                    medikamentenVerwaltung.medikamentHinzufuegen();
                    break;
                case 5:
                    System.out.println("Programm wird beendet.");
                    programmlaeuft = false;
                    break;
                default:
                    System.out.println("Ungültige Auswahl, bitte erneut versuchen.");
            }
        }

}
}

