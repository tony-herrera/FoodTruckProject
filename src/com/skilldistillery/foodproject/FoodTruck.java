package com.skilldistillery.foodproject;

public class FoodTruck {
	private String name;
	private String foodType;
	private double numericRating;
	private static int numericId = 0;
	private int foodTruckId;

	public FoodTruck(double numericId, String name, String foodType, double numericRating) {
	}

	public FoodTruck(Double numericId, String name, String foodType, double numericRating) {
		this.foodTruckId = FoodTruck.numericId++;
		this.name = name;
		this.foodType = foodType;
		this.numericRating = numericRating;
	}

	public double getNumericId() {
		return numericId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public double getNumericRating() {
		return numericRating;
	}

	public void setNumericRating(double numericRating) {
		this.numericRating = numericRating;
	}

}
