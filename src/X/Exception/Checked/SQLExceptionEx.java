package X.Exception.Checked;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLExceptionEx {
	public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb"; // Make sure database and driver exist
        String user = "root";
        String password = "password";

        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("INSERT INTO non_existing_table VALUES (1, 'Test')"); // Invalid table
            System.out.println("Data inserted successfully.");
        } catch (SQLException e) {
            System.out.println("Caught SQLExceptionEx: " + e.getMessage());
        }
    }

}
