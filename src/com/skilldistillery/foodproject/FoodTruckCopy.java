package com.skilldistillery.foodproject;


import java.util.Scanner;

public class FoodTruckCopy {
	public static void main(String[] args) {

		double[] avg = new double[5];
		// Array Declaration
		FoodTruck[] foodTruck;
		FoodTruck[] foodTruckArray;
		// Array assignment & instantiation
		foodTruck = new FoodTruck[5];

		foodTruckArray = new FoodTruck[5];
		FoodTruck foodTruckArrayTwo;

		boolean exit = true;

//		 set boolean value, get user input
//		 check user input for exit statement
//		 if user input = exit statement, exit the loop

//			System.out.println(foodTruckArray[i].toString()); }
//
		for (int i = 0; i < foodTruckArray.length; i++) {

		boolean quit = false;
		{
			Scanner sc = new Scanner(System.in);

			FoodTruck[] myFoodTruckSelection;
			myFoodTruckSelection = new FoodTruck[5];

			// set boolean value, get user input
			// check user input for exit statement
			// if user input = exit statement, exit the loop

			System.out.println("Please enter your desired food truck: ");
			String userTruck = sc.nextLine();
			for (int j = 0; i < 5; j++) {

			System.out.println("Please, select a food truck: ");
			String name = sc.nextLine();
			if (exit == true) {
				System.out.println("Exit.");
			}
			System.out.println("Please enter your choice foods: ");
			String userFood = sc.nextLine();
			System.out.println("Please enter your rating: ");
			Double userRating = sc.nextDouble();
			System.out.println("Please, select your food: ");
			String foodType = sc.nextLine();
			System.out.println("Please, enter your rating: ");
			double rating = sc.nextDouble();
			sc.nextLine();

			sc.close();
			// this is to capture users input data
			foodTruckArrayTwo = new FoodTruck();
			foodTruckArrayTwo.getNumericId();
			foodTruckArrayTwo.getName();
			foodTruckArrayTwo.getFoodType();
			foodTruckArrayTwo.getNumericRating();
			i++;
		}
		// Enter user options here
//
//		System.out.println("Enter 1 for the menu.");
//		System.out.println("Enter 2 for average rating." );
//		System.out.println("Enter 3 for highest rating." );
//		System.out.println("Enter 4 to exit." );


		//switch statement here
		//switch (menu)
		//case 1: print user numericId, getName, foodType, numericRating
		//case 2: print get.numericRating 
		//case 3: print highest rating
		//case 4: exit
		//return;
		//default;


//		After input is complete, the user sees a menu from which they can choose to:
//
//			List all existing food trucks.
//			See the average rating of food trucks.
//			Display the highest-rated food truck.
//			Quit the program.
	}
}
	}
}