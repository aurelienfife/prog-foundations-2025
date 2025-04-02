package inclassexercises;

import java.util.Scanner;

public class Exercises {

	public void StrawBags() {
		// Variation on the 'Bag of grit'
		// Exercise
		double UNITPRICE = 6.0;
		double SHIPPING = 3.0;
		
		// Scanner used for the whole exercise
		Scanner sc = new Scanner(System.in);
		
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
		
		sc.close();
	}



}
