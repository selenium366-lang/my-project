package X.Exception.Checked;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileNotFoundWithTryCatch {
	public static void main(String[] args) {
        try {
            FileReader file = new FileReader("example.txt");
            System.out.println("File opened successfully.");
        } catch (FileNotFoundException e) {									//IOException = FileNotFoundException
            System.out.println("File not found: " + e.getMessage());
        }
    }

}
