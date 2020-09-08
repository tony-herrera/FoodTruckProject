package com.skilldistillery.foodproject;

public class FoodTruck {
	private String name;
	private String foodType;
	private double numericRating;
	private static int numericId = 1;
	private int foodTruckId;


	public FoodTruck(String name, String foodType, double numericRating) {
		this.foodTruckId = FoodTruck.numericId++;
		this.name = name;
		this.foodType = foodType;
		this.numericRating = numericRating;

	}
	
	public FoodTruck() {
		
	}

	public int getNumericId() {

		return numericId;
	}

	public void setNumericId() {

		FoodTruck.numericId = FoodTruck.numericId++;
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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();

		builder.append("FoodTruck [name=").append(name).append(", foodType=").append(foodType)

				.append(", numericRating=").append(numericRating).append(", foodTruckId=").append(foodTruckId)

				.append("]");
		return builder.toString();
	}

}
