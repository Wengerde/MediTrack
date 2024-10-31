import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BenutzerVerwaltung benutzerVerwaltung = new BenutzerVerwaltung(); // Objekt der neuen Klasse erstellt
        benutzerVerwaltung.benutzerAnmeldung(); // Benutzeranmeldung aufrufen

        // PatientenVerwaltung erstellen
        PatientenVerwaltung patientenVerwaltung = new PatientenVerwaltung();

        // Scanner erstellt, um Benutzereingaben zu lesen
        Scanner scanner = new Scanner(System.in);


        boolean programmlaeuft = true;

        // Hauptmenü-Schleife
        while (programmlaeuft) {
            System.out.println("\nHauptmenü:");
            System.out.println("1. Patientenübersicht anzeigen");
            System.out.println("2. Medikamentenverwaltung");
            System.out.println("3. Programm beenden");
            System.out.println("Wählen Sie eine Option: ");
            int auswahl = scanner.nextInt();

            switch (auswahl) {
                case 1:
                    PatientenVerwaltung.zeigePatientenuebersicht();
                    break;
                case 2:
                    System.out.println("Medikamentenverwaltung wird gestartet...");
                    break;
                case 3:
                    System.out.println("Programm wird beendet.");
                    programmlaeuft = false;
                    break;
                default:
                    System.out.println("Ungültige Auswahl, bitte erneut versuchen.");
            }
        }

}
}