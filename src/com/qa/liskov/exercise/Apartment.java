package com.qa.liskov.exercise;

public abstract class Apartment {
	private int squareFootage;

	public abstract void setSquareFootage(int sqft);

	public int getSquareFootage() {
		return squareFootage;
	}

}
