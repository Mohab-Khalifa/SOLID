package com.qa.presenation.interfaceseg;

public class Salmon implements SeaAnimal {

	String name;
	private int swimSpeed = 10;
	private int length;

	public Salmon() {

	}

	@Override
	public void swim() {
		this.setSwimSpeed(getSwimSpeed() + 10);
	}

	@Override
	public void breathUnderwater() {
		// TODO Auto-generated method stub

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
