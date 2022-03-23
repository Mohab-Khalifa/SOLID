package com.qa.presenation.interfaceseg.correctV;

public class Whale implements SwimmingAnimal, BlowHoling {

	String name;
	private int swimSpeed = 10;
	private int length;

	@Override
	public void swim() {
		this.setSwimSpeed(getSwimSpeed() + 20);
	}

	@Override
	public void blowYourHole() {
		System.out.println("Nemo made it out");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSwimSpeed() {
		return swimSpeed;
	}

	public void setSwimSpeed(int swimSpeed) {
		this.swimSpeed = swimSpeed;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

}
