package com.qa.openclosed;

public class Circle implements Shape {

	// Any instance variables within a class should be
	// private to fit which OOP pillar? Encapsulation

	public float radius = 10;

	@Override
	public float calculateArea() {
		return (float) (Math.pow(this.radius, 2) * Math.PI);
	}

	public Circle() {

	}

	public Circle(float radius) {
		this.radius = radius;
	}

	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}

	public static void main(String[] args) {

		// Dependency inversion
		Shape circle = new Circle(3);

		System.out.println(circle.calculateArea());

	}

}
