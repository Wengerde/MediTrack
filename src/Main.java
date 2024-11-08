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
            System.out.println("2. Neuen Patienten hinzufügen");
            System.out.println("3. Patienten löschen");
            System.out.println("4. Medikamentenübersicht anzeigen");
            System.out.println("5. Neues Medikament hinzufügen");
            System.out.println("6. Medikament löschen");
            System.out.println("7. Programm beenden");
            System.out.print("Wählen Sie eine Option: ");
            int auswahl = scanner.nextInt();

            switch (auswahl) {
                case 1:
                    patientenVerwaltung.zeigePatientenUebersicht();
                    break;
                case 2:
                    patientenVerwaltung.patientHinzufuegen();
                    break;
                case 3:
                    patientenVerwaltung.patientLoeschen();
                    break;
                case 4:
                    medikamentenVerwaltung.zeigeMedikamente();
                    break;
                case 5:
                    medikamentenVerwaltung.medikamentHinzufuegen();
                    break;
                case 6:
                    medikamentenVerwaltung.medikamentLoeschen();
                    break;
                case 7:
                    System.out.println("Programm wird beendet.");
                    programmlaeuft = false;
                    break;
                default:
                    System.out.println("Ungültige Auswahl, bitte erneut versuchen.");
            }
        }

}
}

