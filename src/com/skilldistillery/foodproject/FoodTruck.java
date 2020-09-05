package com.skilldistillery.foodproject;

public class FoodTruck {
	private double numericId;
	private String name;
	private String foodType;
	private double numericRating;

	public FoodTruck(double numericId, String name, String foodType, double numericRating) {
	}

	public FoodTruck(Double numericId, String name, String foodType, double numericRating) {

		this.numericId = numericId;
		this.name = name;
		this.foodType = foodType;
		this.numericRating = numericRating;
	}

	public double getNumericId() {
		return numericId;
	}

	public void setNumericId(double numericId) {
		this.numericId = numericId;
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