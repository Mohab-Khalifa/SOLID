package com.qa.liskov.exercise;

public abstract class MultiRoomedApartment extends Apartment {

	private int numberOfBedrooms;

	public int getNumberOfBedrooms() {
		return numberOfBedrooms;
	}

	public void setNumberOfBedrooms(int numberOfBedrooms) {
		this.numberOfBedrooms = numberOfBedrooms;
	}

}
