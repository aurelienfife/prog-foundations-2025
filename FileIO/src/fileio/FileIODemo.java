package fileio;

// Libraries needed
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class FileIODemo {

	// Code for demo goes here
	public void run() {
		
		// Open the CSV file and create a file stream
		File f = new File("temps.csv");
		// Create the array before try { } otherwise it will not persist
		ArrayList<String> fileLines = new ArrayList<String>();
		
		try {
			// Create the scanner here - can potentially crash
			Scanner s = new Scanner(f);
			// All the code needing the scanner goes inside the try
			// You can iterate the scanner - nextLine() returns the next text line
			// and moves forward into the file
			while(s.hasNextLine()) {
				fileLines.add(s.nextLine());
			}
			s.close();
		}
		catch (FileNotFoundException e) {
			// If the file doesn't exist, handle it and stop program
			System.out.println("Error: file not found - " + e.getMessage());
			System.exit(1);
		}
		
		
		// Rest of the program goes there
		System.out.println(fileLines);
	}
	
}
