package X.Exception.Checked;

public class ClassNotFoundEx {
	public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Trying to load JDBC driver class
            System.out.println("Driver class found.");
        } catch (ClassNotFoundException e) {
            System.out.println("Caught ClassNotFoundException: " + e.getMessage());
        }
    }

}
