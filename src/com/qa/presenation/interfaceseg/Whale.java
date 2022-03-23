package com.qa.presenation.interfaceseg;

public class Whale implements SeaAnimal {

	String name;
	private int swimSpeed;
	private int length;

	@Override
	public void swim() {
		// TODO Auto-generated method stub

	}

	@Override
	public void breathUnderwater() {
		// TODO Auto-generated method stub

	}

	@Override
	public void blowYourHole() {
		// TODO Auto-generated method stub

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
