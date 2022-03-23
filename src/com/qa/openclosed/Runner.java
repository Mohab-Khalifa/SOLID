package com.qa.openclosed;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shape triangle = new Triangle(2, 2);
		Shape circle = new Circle();

		System.out.println(AreaCalculator.calculateArea(circle));
		System.out.println(AreaCalculator.calculateArea(triangle));

	}

}
