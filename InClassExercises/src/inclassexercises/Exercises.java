package inclassexercises;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Collections;

public class Exercises {
	
	// Scanner used by all exercises, declared at class-level
	private Scanner sc;
	
	// Constructor function initialises anything that needs to be
	// when creating object
	public Exercises() {
		sc = new Scanner(System.in);
	}

	/**
	 * Task 3 of iLearn "Java Collections"
	 * This exercises demonstrates how to create a HashMap to store k/v pairs.
	 * Additionally it covers how to transform data using different
	 * collections types when a collection is not appropriate (e.g. here we need
	 * to sort keys alphabetically, hence the creation of an "intermediate"
	 * ArrayList.
	 * 
	 * It also covers the use of System.out.printf() to display formatted strings.
	 */
	public void cafeMenu() {
		
		// Store a menu in a HashMap
		HashMap<String, Double> menu = new HashMap<String, Double>();
		
		menu.put("Coffee", 2.5);
		menu.put("Soup", 3.);
		menu.put("Sandwich", 5.0);
		menu.put("Sauce", .5);
		menu.put("Chips", 3.0);
		
		//System.out.println(menu);
		
		// Display the menu 
		// The HashMap is not sortable, neither is the keySet.
		// to display keys alphabetically we need to create an intermediate ArrayList
		// and sort it
		ArrayList<String> sortedKeys = new ArrayList<String>(menu.keySet());
		Collections.sort(sortedKeys);
		
		System.out.println("Welcome to the café!\n\n");
		
		// Now we can loop through the sorted keys
		for(String dish: sortedKeys) {
			
			// Retrieve price from HashMap
			Double price = menu.get(dish);
			//System.out.println(dish);
			
			// This is using string formatting syntax
			// See: https://www.w3schools.com/java/ref_output_printf.asp
			System.out.printf("%8s\t£%.2f%n" , dish, price);
		}
		
		
	}
	
	/**
	 * This exercise aims to consolidate general I/O, calculations and if/else.
	 */
	public void StrawBags() {
		// Variation on the 'Bag of grit'
		// Exercise
		double UNITPRICE = 6.0;
		double SHIPPING = 3.0;
				
		// Ask user for quantity and read value from kbd
		System.out.print("How many bags do you want?     ");
		int quantity = sc.nextInt();
		
		// Declare total before if/else otherwise it will not exist
		// after if/else (scope)
		double total = quantity * UNITPRICE;
		System.out.println("Total for items: " + total + " GBP");
		
		if(quantity <= 6) {
			// Add shipping cost
			total += SHIPPING;
			System.out.println("Total after shipping cost: " + total + " GBP");
		}
	}

	/**
	 * This exercise is about general use of ArrayLists.
	 * It uses indexOf() for search - more efficient than
	 * writing your own search.
	 */
	public void studentSearch() {
		
		// Create an empty list, add 10 names
		ArrayList<String> students = new ArrayList<String>();
		
		// Input 10 names
		for(int i = 0; i < 10; i++)
		{
			// Input a new name add to ArrayList
			System.out.print("Enter a name: ");
			String newName = sc.nextLine();
			// Conversion to lower case for exercise purpose
			// (case insensitive search)
			students.add(newName.toLowerCase());
		}
		
		// Ask and get a search term from user
		System.out.print("What name do you want to search? ");
		
		String searchTerm = sc.nextLine();
		// Search using indexOf
		int searchResult = students.indexOf(searchTerm.toLowerCase());
		
		if(searchResult == -1) {
			System.out.println(searchTerm + " has not been found.");
		}
		else {
			System.out.println(searchTerm + " has been found at index: " + searchResult);
		}
		
	}

}
