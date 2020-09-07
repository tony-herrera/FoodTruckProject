package com.skilldistillery.foodproject;

import java.util.Scanner;

public class FoodTruckApp {
	public static void main(String[] args) {

		// create fields for operation

		Scanner sc = new Scanner(System.in);
		// Array Declaration
		FoodTruck[] foodTruckArray;
		FoodTruck foodTruckArrayTwo;
		FoodTruck[] trucks;

		// Array assignment & instantiation
		foodTruckArray = new FoodTruck[5];
		FoodTruckApp app = new FoodTruckApp();

//		 Declare useful variables
		boolean quit = true;

//		 check user input for exit statement
//		 if user input = exit statement, exit the loop

		for (int i = 0; i < foodTruckArray.length + 2; i++) {

			System.out.println("Please, select a food truck: ");
			String name = sc.nextLine();
			if (name.equalsIgnoreCase("quit")) {
				System.out.println("Exit.");
				break;
			}
			System.out.println("Please, select your food: ");
			String foodType = sc.nextLine();
			System.out.println("Please, enter your rating: ");
			double rating = sc.nextDouble();
			sc.nextLine();

			// this is to capture users input data
			foodTruckArrayTwo = new FoodTruck();
			foodTruckArrayTwo.getNumericId();
			foodTruckArrayTwo.getName();
			foodTruckArrayTwo.getFoodType();
			foodTruckArrayTwo.getNumericRating();
			i++;

			FoodTruck truck = new FoodTruck(Name, FoodType, NumericRating);
			trucks[trucksCounter] = truck;
			truckCounter++;

			// this is used to hold the array of trucks
//			trucks = new FoodTruck[name];

		}
		// Enter user options here for next part
		System.out.println("Enter 1 for the list of existing food trucks.");
		System.out.println("Enter 2 for average rating.");
		System.out.println("Enter 3 for highest rating.");
		System.out.println("Enter 4 to exit.");
		String userInput = sc.next();

//		 switch statement here
//		char selection = '1','2','3','4';
		boolean keepGoing = true;
		while (keepGoing) {
			switch (userInput) {
			
			case "1":
				System.out.println("Here is a list of your selected food truck:" + printTrucks(trucks));
				break;
				
			case "2":
				System.out.println("Here is the average rating: " + printAverageRating(trucks));
				break;
			case "3":
				System.out.println("Here is the highest rated food truck: " + printHighestRated(trucks));
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
	public void countTrucks(FoodTruck [] trucks) {
		for (int i = 0; i < truckCounter; i++) { 
			System.out.println(trucks[i]);
		}
		
		
		//method used for calculating the average rating
		public void averageRating (FoodTruck[] trucks) {
			double ratingTotal = 0.0; 
			double ratingAverage = 0.0;
			for (int i = 0; i < truckCounter; i++) {
				ratingTotal += trucks[i].getNumericRating();
			}

			ratingAverage = (ratingTotal / truckCounter);

			System.out.println("The average rating for all trucks entered is: ");
			System.out.printf("%.1f", ratingAverage);
		}
		
		
		//method user for determining the highest truck rating
		public void highestRatedTruck(FoodTruck[] trucks) {
			double highestRating = 0;
			FoodTruck winner = new FoodTruck();
			for (int i = 0; i < truckCounter; i++) {
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
