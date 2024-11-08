import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/meditrack";
    private static final String USER = "root";  // Dein MySQL-Benutzername (in der Regel 'root')
    private static final String PASSWORD = "s$@@x8&pCrTcTy5ryt5r";  // Ersetze 'deinPasswort' durch dein tatsächliches MySQL-Passwort

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Verbindung zur Datenbank fehlgeschlagen");
        }
    }
}
