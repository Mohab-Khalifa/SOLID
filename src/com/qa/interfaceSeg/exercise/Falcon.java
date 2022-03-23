package com.qa.interfaceSeg.exercise;

public class Falcon implements FlyingBird, EggLayingBird {

	private String currentLocation;
	private int numberOfEggs;

	public Falcon(int initialEggCount) {
		this.setNumberOfEggs(initialEggCount);
	}

	@Override
	public void fly() {
		this.setCurrentLocation("In the Sky");
	}

	@Override
	public void layEggs() {
		this.setNumberOfEggs(getNumberOfEggs() + 1);
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
