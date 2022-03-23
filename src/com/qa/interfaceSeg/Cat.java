package com.qa.interfaceSeg;

public class Cat implements MeowingFeline, PredatorFeline {

	@Override
	public void pounce() {
		// TODO Auto-generated method stub

	}

	@Override
	public void meow() {
		// TODO Auto-generated method stub

	}

	// Interface Segregation states that we need to ensure that the interfaces thare
	// are
	// adopted contain methods that WILL BE USED

	// We need to avoid "God" interfaces -- Contains all possible methods

}
