import java.util.Scanner;

public class BenutzerVerwaltung {
    public void benutzerAnmeldung() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie Ihren Benutzernamen ein: ");
        String benutzername = scanner.nextLine();
        System.out.println("Willkommen bei MediTrack, " + benutzername + "!");
    }
}
