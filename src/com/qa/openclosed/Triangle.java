package com.qa.openclosed;

public class Triangle implements Shape {

	// Should be open for extension but closed for modifications

	// So we want to expand our functionality but we don't want to
	// directly go into our classes and have to change it every single time

	// Allows code efficiency
	// time efficiency

	float width;
	float height;

	@Override
	public float calculateArea() {
		return 0.5f * (this.width * this.height);
	}

	public Triangle(float width, float height) {
		this.height = height;
		this.width = width;
	}

}
