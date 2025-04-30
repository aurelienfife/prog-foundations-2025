package module6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
//import java.util.Map.Entry;
import java.util.Scanner;

public class Module6Tasks {
	File theFile;
	ArrayList<String> fileContents;
	Scanner keyScan;

	// constructor
	public Module6Tasks() {
		theFile = new File("customers.csv");
		fileContents = new ArrayList<String>();
		// Scanner for general use
		keyScan = new Scanner(System.in);

		// Loading contents of file as per method shown in class
		try {
			// Scanner specific to the attached file
			Scanner s = new Scanner(theFile);

			while (s.hasNextLine()) {
				fileContents.add(s.nextLine());
			}

			s.close();
		} catch (FileNotFoundException e) {
			System.out.println(e.toString());
		}
	}

	// menu method - gets a choice from the user
	private int menu() {
		Integer result = 0;

		// Minimal message
		System.out.println("1 - Task 2\n2 - Task 3\n3 - Task 4");

		String input = keyScan.nextLine();
		result = Integer.valueOf(input);

		return result;
	}

	// method to run the exercises
	public void runExercises() {

		Integer choice = menu();
		switch (choice.intValue()) {
		case 1: {
			task2();
			break;
		}
		case 2: {
			task3();
			break;
		}
//		case 3: {
//			
//		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + choice);
		}

	}

	private void task2() {

		// This ideally should break down the string into
		// but keeping it simple
		System.out.println("Enter a customer number:");

		// Able to access content of array as it is global (at class level)
		String customerNo = keyScan.nextLine();

		int count = 0;
		// For loop - every instance
		for (String line : fileContents) {
			if (line.contains(customerNo)) {
				count++;
			}
		}

		// Display appropriately
		if (count > 0) {
			System.out.println("Customer ordered " + count + " time(s).");
		} else {
			System.out.println("No info found");
		}
	}

	
	private void task3() {

		// Creating the hashmap key: customer name, value: array of transaction dates
		HashMap<String, ArrayList<String>> orderReport = new HashMap<String, ArrayList<String>>();

		
		for (String line : fileContents) {
			// Lines will split as follows:
			// 0: Customer name, 1: customer number, 2: transaction date
			String[] components = line.split(",");
		
			// If current customer name exists as a key
			// add the transaction date to the array
			if (orderReport.containsKey(components[0])) {
				orderReport.get(components[0]).add(components[2]);
			} else {
				// Else, create the array, then add the transaction date
				orderReport.put(components[0], new ArrayList<String>());
				orderReport.get(components[0]).add(components[2]);
			}
		}

		// Outer loop: all the customer names (keys)
		for (String customerName : orderReport.keySet()) {
			System.out.println(customerName);
			// Inner loop: all the transaction dates for that specific customer
			for (String orderDate : orderReport.get(customerName)) {
				System.out.println("    " + orderDate);
			}
		}
	}
}
