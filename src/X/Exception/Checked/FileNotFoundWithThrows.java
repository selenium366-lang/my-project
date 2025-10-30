package X.Exception.Checked;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileNotFoundWithThrows {
	 public static void readFile(String filename) throws IOException {
	        BufferedReader reader = new BufferedReader(new FileReader(filename));
	        String line;
	        while ((line = reader.readLine()) != null) {
	            System.out.println(line);
	        }
	        reader.close();
	    }

	    public static void main(String[] args) {
	        try {
	            readFile("example.txt");
	        } catch (IOException e) {											//IOException = FileNotFoundException
	            System.out.println("An I/O error occurred: " + e.getMessage());
	        }
	    }

}
