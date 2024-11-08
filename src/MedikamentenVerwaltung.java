import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MedikamentenVerwaltung {

    // Neues Medikament zur Datenbank hinzufügen
    public void medikamentHinzufuegen() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bitte geben Sie den Namen des neuen Medikaments ein: ");
        String name = scanner.nextLine();
        System.out.print("Bitte geben Sie den Bestand des Medikaments ein: ");
        int bestand = scanner.nextInt();

        String sql = "INSERT INTO Medikamente (name, bestand) VALUES (?, ?)";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setString(1, name);
            preparedStatement.setInt(2, bestand);

            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Neues Medikament erfolgreich hinzugefügt: " + name + ", Bestand: " + bestand);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Medikamentenübersicht anzeigen
    public void zeigeMedikamente() {
        String sql = "SELECT * FROM Medikamente";

        try (Connection connection = DatabaseConnection.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {

            System.out.println("Medikamentenübersicht:");
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int bestand = resultSet.getInt("bestand");
                System.out.println("ID: " + id + ", Name: " + name + ", Bestand: " + bestand);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Medikament löschen
    public void medikamentLoeschen() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bitte geben Sie die ID des zu löschenden Medikaments ein: ");
        int medikamentId = scanner.nextInt();

        String sql = "DELETE FROM Medikamente WHERE id = ?";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setInt(1, medikamentId);

            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Medikament mit ID " + medikamentId + " wurde erfolgreich gelöscht.");
            } else {
                System.out.println("Kein Medikament mit dieser ID gefunden.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
