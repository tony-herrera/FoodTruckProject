package com.skilldistillery.foodproject;

import java.util.Scanner;

public class FoodTruckApp {
	public static void main(String[] args) {
		// Array Declaration
		FoodTruck[] foodTruck;
		// Array assignment & instantiation
		foodTruck = new FoodTruck[5];
		

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
			for (int i = 0; i < 5; i++) {
					
			}
			System.out.println("Please enter your choice foods: ");
			String userFood = sc.nextLine();
			System.out.println("Please enter your rating: ");
			Double userRating = sc.nextDouble();

			sc.close();
		}
	}
}
