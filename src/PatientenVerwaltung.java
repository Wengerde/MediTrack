import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class PatientenVerwaltung {

    // Konstruktor
    public PatientenVerwaltung() {
        ladePatientenAusDatenbank();
    }

    // Neue Patienten zur Datenbank hinzufügen
    public void patientHinzufuegen() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bitte geben Sie den Namen des neuen Patienten ein: ");
        String name = scanner.nextLine();
        System.out.print("Bitte geben Sie das Alter des neuen Patienten ein: ");
        int alter = scanner.nextInt();

        String sql = "INSERT INTO Patienten (name, `alter`) VALUES (?, ?)";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setString(1, name);
            preparedStatement.setInt(2, alter);

            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Neuer Patient erfolgreich hinzugefügt: " + name + ", Alter: " + alter);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Patientenübersicht anzeigen
    public void zeigePatientenUebersicht() {
        String sql = "SELECT * FROM Patienten";

        try (Connection connection = DatabaseConnection.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {

            System.out.println("Patientenübersicht:");
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int alter = resultSet.getInt("alter");
                System.out.println("ID: " + id + ", Name: " + name + ", Alter: " + alter);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Patienten löschen
    public void patientLoeschen() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bitte geben Sie die ID des zu löschenden Patienten ein: ");
        int patientId = scanner.nextInt();

        String sql = "DELETE FROM Patienten WHERE id = ?";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setInt(1, patientId);

            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Patient mit ID " + patientId + " wurde erfolgreich gelöscht.");
            } else {
                System.out.println("Kein Patient mit dieser ID gefunden.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Patienten aus der Datenbank laden
    public void ladePatientenAusDatenbank() {
        String sql = "SELECT * FROM Patienten";

        try (Connection connection = DatabaseConnection.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {

            System.out.println("Patienten aus der Datenbank geladen:");
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int alter = resultSet.getInt("alter");
                System.out.println("ID: " + id + ", Name: " + name + ", Alter: " + alter);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}