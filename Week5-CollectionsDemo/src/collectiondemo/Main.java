package collectiondemo;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;




public class Main {

	public static void main(String[] args) {
		
		
		// Create an array of integers
		// - type and size are fixed
		
		int numbers[];			// Create the array
		numbers = new int[5];	// Allocate the memory
		
		Scanner s = new Scanner(System.in);
		
		// The code below would fail, because the array is too short
//		for (int i=0; i<6; i++) {
//			System.out.println("Enter a number:");
//			numbers[i] = s.nextInt();
//		}
		
		
		// Create a list of famous scientist
		ArrayList<String> scienceList = new ArrayList<String>();
		
		// Populate the list with examples
		
		scienceList.add("Albert Einstein");
		scienceList.add("Marie Sklodowska Curie");
		scienceList.add("Tim Berners-Lee");
		scienceList.add("Ada Lovelace");
		
		// Add new names to the list
		String input = "";
		do
		{
			System.out.println("Enter a new name, stop to quit");
			input = s.nextLine();
			if(!input.equals("stop")) {
				scienceList.add(input);
			}
		} while(!input.equals("stop"));
		

		// List the science people
		for(int i=0; i<scienceList.size(); i++)
		{
			// In an array the syntax would be
			// array[i]
			// In Java, the .get() syntax prevails
			System.out.println(scienceList.get(i));
		}
		
		// If you want to display all the elements in a list
		// There is another syntax
		// Simplified syntax - aka. "foreach" loop
		
		System.out.println(); // Just a blank line
		
		for(String current : scienceList)
		{
			System.out.println(current);
		}
		
		
		
		// Create a HashMap
		// What is on my shelf? (books, records etc)
		
		// Equivalent of Dictionary in Python (associative array)
		
		// key: type of possession (String)
		// value: how many
		
		HashMap<String, Integer> shelf = new HashMap<String, Integer>();
		
		for(int i=0; i<3; i++)
		{
			System.out.println("Enter the type of object on your self:");
			String type = s.nextLine();
			System.out.println("Enter the quantity you own:");
			String qtyStr = s.nextLine();
			
			shelf.put(type, Integer.parseInt(qtyStr));
		}
		
		// Display all the contents of the shelf (HashMap)
		for(Entry<String, Integer> e : shelf.entrySet())
		{
			System.out.println("Type: " + e.getKey() + " Quantity: " + e.getValue());
		}
		
		
		
		
	}

}
