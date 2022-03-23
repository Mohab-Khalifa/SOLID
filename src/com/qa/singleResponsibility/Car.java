package com.qa.singleResponsibility;

public class Car {

	// Good design -- Programmers needed a convention
	// Within OOP the general paradigm is SOLID

	// Single Responsibility - a class should only have one reason to change
	// Open-Closed - Open for extension, closed for modification
	// Liskov Substitution - the child should be perfectly substitutable from the
	// parent
	// Interface Segregation - keep interfaces small so you don't have to implement
	// methods you don't want
	// Dependency Inversion - dpend on abstractions, not concretions

	// This Cars sole responsibility is to be a Car and therefore if it doesn't have
	// factors within it that make it a car

	// Instance variables

	int id;
	String model;
	String brand;
	int noOfSeats;
	float totalMiles;

	// Methods

	public void calculateMilage() {
		System.out.println("Calculate Milage");
	}

	public float getTotalMiles() {
		return totalMiles;
	}

	public Car() {

	}

	// Id should be set by the Mechanic
	// Model -- Manufacturer
	// Brand -- Manufacturer
	// noOf... -- Manufacturer

	// 80% of our code isn't making new code -- We need to ensure that we maintain
	// our current code

	public Car(int id, String model, String brand, int noOfSeats, float totalMiles) {

	}

	// SPLIT THE FUNCTIONALITY INTO TWO CLASSES

	public static void engineStart() {
		System.out.println("vroom vroom");
	}

	// not only should class have a single responsibility - the method should as
	// well
	// as soon as the method is doing more than one thing, we break
	// KISS -- Keep It Simple Stupid
	// DRY -- Don't Repeat Yourself

}
