package com.skilldistillery.foodproject;

import java.util.Scanner;

public class FoodTruckApp {
	private FoodTruck[] FoodTrucks;
	private int numOfFoodTrucks = 5;

{
		Scanner sc = new Scanner(System.in);

		FoodTruck[] myFoodTruckSelection;
		myFoodTruckSelection = new FoodTruck[5];

		System.out.println("Please enter your desired foodtruck: ");
		String userTruck = sc.nextLine();
		
		
		System.out.println("Please enter your choice foods: ");
		String userFood = sc.nextLine();
		
		System.out.println("Please enter your rating: ");
		Double userRating = sc.nextDouble();

	
		sc.close();
	}
}
