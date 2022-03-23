package com.qa.liskov.exercise;

public class Penthouse extends MultiRoomedApartment {
	public Penthouse() {
		this.setNumberOfBedrooms(4);
	}

	@Override
	public void setSquareFootage(int sqft) {
		this.setSquareFootage(this.getSquareFootage());
	}
}