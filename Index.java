import java.sql.*;

public class Index {
    public static void main(String[] args) {
        // Database connection details
        String url = "jdbc:postgresql://localhost:5433/mydb"; // Default port is 5432
        String user = "postgres"; // Default PostgreSQL username
        String password = "123456789"; // Your actual PostgreSQL password
          
        Connection conn = null;

        try {
            // Load PostgreSQL JDBC Driver
            Class.forName("org.postgresql.Driver");

            // Establish connection
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the database successfully!");

        } catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver not found! Make sure the JAR file is in the classpath.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Database connection failed! Check credentials and database settings.");
            e.printStackTrace();
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                    System.out.println("Connection closed.");
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}

// 
// git branch -M main
// 
