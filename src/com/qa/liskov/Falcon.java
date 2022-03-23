package com.qa.liskov;

public class Falcon implements FlyingBird, PredatorBird {

	// You can only extend one class at a time - so this means that we could only
	// extend one abstract class there
	// Interface you can implement many

	@Override
	public void fly() {
		// TODO Auto-generated method stub

	}

	@Override
	public void hunt() {
		// TODO Auto-generated method stub

	}

	// An interface is very similar to an abstract class
	// No logic is set within the Interface --

	// Reduces human error -- We know we have to add this

}
