import java.sql.Connection;

public class TestDatabaseConnection {
    public static void main(String[] args) {
        try {
            Connection connection = DatabaseConnection.getConnection();
            if (connection != null) {
                System.out.println("Verbindung zur Datenbank erfolgreich hergestellt!");
            }
        } catch (Exception e) {
            System.out.println("Verbindung fehlgeschlagen.");
            e.printStackTrace();
        }
    }
}
