package com.qa.presenation.interfaceseg.correctV;

public class Salmon implements UnderwaterBreathingAnimal, SwimmingAnimal {

	String name;
	private int swimSpeed = 10;
	private int length;

	@Override
	public void swim() {
		this.setSwimSpeed(getSwimSpeed() + 10);
	}

	@Override
	public void breathUnderwater() {
		System.out.println("*gulps water*");

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
