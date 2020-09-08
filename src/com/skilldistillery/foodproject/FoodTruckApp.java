package com.skilldistillery.foodproject;

import java.util.Scanner;   

public class FoodTruckApp {

	public static void main(String[] args) {
		FoodTruck[] foodTruckArray = new FoodTruck[5];

		FoodTruckApp app = new FoodTruckApp();
		Scanner sc = new Scanner(System.in);

		foodTruckArray = app.UserInput(sc, foodTruckArray);

		app.UserMenu(sc, foodTruckArray);

	}

	// method used to create for loop
	public FoodTruck[] UserInput(Scanner sc, FoodTruck[] inputArray) {
		FoodTruck[] copyInputArray = new FoodTruck[5];
//		copyInputArray = inputArray;
		// create fields for operation

//	 check user input for exit statement
//	 if user input = exit statement, exit the loop
		double rating;
		String foodType;
		String name;
		for (int i = 0; i < copyInputArray.length; i++) {

			System.out.println("Please, select a food truck: ");
			name = sc.nextLine();
			if (name.equalsIgnoreCase("quit")) {
				System.out.println("Exit.");
				break;
			}
			System.out.println("Please, select your food: ");
			foodType = sc.nextLine();
			System.out.println("Please, enter your rating: ");
			rating = sc.nextDouble();
			sc.nextLine();

			FoodTruck truck = new FoodTruck(name, foodType, rating);
			copyInputArray[i] = truck;

		}
		return copyInputArray;
	}

	// method used for creating menu
	public void UserMenu(Scanner sc, FoodTruck[] inputArray) {

//		 switch statement here
		boolean keepGoing = true;
		while (keepGoing) {
			// Enter user options here for next part
			System.out.println("Enter 1 for the list of existing food trucks.");
			System.out.println("Enter 2 for average rating.");
			System.out.println("Enter 3 for highest rating.");
			System.out.println("Enter 4 to exit.");
			String userInput = sc.next();
			switch (userInput) {

			case "1":
				countTrucks(inputArray);

				System.out.println("Would you like to make another selection?");
				break;

			case "2":
				averageRating(inputArray);
				break;
			case "3":
				highestRatedTruck(inputArray);
				break;
			case "4":
				System.out.println("Good-Bye!");
				keepGoing = false;
				break;
			default:
				System.out.println("That's not an option!");
				break;
			}
		}

	}

	private int truckCounter;
	FoodTruck[] trucks;

	// method used to print out trucks
	public void countTrucks(FoodTruck[] trucks) {
		for (int i = 0; i < trucks.length; i++) {
			if (trucks[i] == null) {
				continue;

			}
			System.out.println(trucks[i]);
		}
	}

	// method used for calculating the average rating
	public double averageRating(FoodTruck[] trucks) {
		double ratingTotal = 0.0;
		double ratingAverage = 0.0;
		for (int i = 0; i < trucks.length; i++) {
			if (trucks[i] != null) {
			truckCounter++;	
			ratingTotal += trucks[i].getNumericRating();
			}
		}
		
		ratingAverage = (ratingTotal / truckCounter);

		System.out.println("The average rating for all trucks entered is: ");
		System.out.printf("%.1f\n", ratingAverage);

		return ratingAverage;
	}

	// method user for determining the highest truck rating
	public void highestRatedTruck(FoodTruck[] trucks) {
		double highestRating = 0;
//		double winner= 0;
		FoodTruck winner = new FoodTruck();
		
		for (int i = 0; i < trucks.length; i++) {
			if (trucks[i] != null) {
			if (trucks[i].getNumericRating() > highestRating) {
				highestRating = trucks[i].getNumericRating();
				winner = trucks[i];
			} else {
				continue;
			}
		}
			System.out.println("The truck with the highest rating " + "is: \n" + winner);
		}
	}

}
