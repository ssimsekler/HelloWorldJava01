package com.ssimsekler.HelloWorldJava01;

public class Car extends Vehicle {

	public Car(String name, String make, String model, int gearCount, int maxSpeed) {
		super(name, make, model, true, gearCount, maxSpeed);
		System.out.println("Creating a car instance...");
		// TODO Auto-generated constructor stub
	}

	public void steer(String direction) {
		System.out.println("Steering towards " + direction);

	}

	public int changeGear(int gearIn) {
		if (gearIn >= 0 && gearIn <= this.gearCount) {
			this.currentGear = gearIn;
			System.out.println("Changed gear to " + this.currentGear);
		} else {
			System.out.println("Cannot change gear to " + gearIn + "!!!");
		}
		return this.currentGear;
	}

	@Override
	public void decelerate(int speedChange) {
		// TODO Auto-generated method stub
		super.decelerate(speedChange);
		if (this.currentSpeed <= 0) {
			System.out.println("Gear automatically set to Neutral after coming to a stop.");
			this.currentGear = 0;
		};
	}

	
	
}
