package com.qa.interfaceSeg.exercise;

public class Dodo implements ExtinctBird, EggLayingBird {

	private String currentLocation;
	private int numberOfEggs;

	public Dodo(int initialEggCount) {
		this.setNumberOfEggs(initialEggCount);
	}

	@Override
	public void layEggs() {
		this.setNumberOfEggs(getNumberOfEggs() + 1);
	}

	@Override
	public void goExtinct() {
		this.setCurrentLocation("In a Museum");

	}

	public String getCurrentLocation() {
		return currentLocation;
	}

	public void setCurrentLocation(String currentLocation) {
		this.currentLocation = currentLocation;
	}

	public int getNumberOfEggs() {
		return numberOfEggs;
	}

	public void setNumberOfEggs(int numberOfEggs) {
		this.numberOfEggs = numberOfEggs;
	}

}
