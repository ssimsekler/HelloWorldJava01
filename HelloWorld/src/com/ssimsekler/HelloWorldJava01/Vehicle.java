package com.ssimsekler.HelloWorldJava01;

public class Vehicle {

	public String name;
	public String make;
	public String model;
	public boolean steerable;
	public int gearCount;
	public int currentGear;
	public int maxSpeed;
	public int currentSpeed;

	public Vehicle(String name, String make, String model, boolean steerable, int gearCount, int maxSpeed) {
		super();
		System.out.println("Creating a vehicle instance...");
		
		this.name = name;
		this.make = make;
		this.model = model;
		this.steerable = steerable;
		this.gearCount = gearCount;
		this.maxSpeed = maxSpeed;
		this.currentGear = 0;
		this.currentSpeed = 0;

	}

	private void changeSpeed (int speedChange) {
		if (this.currentSpeed + speedChange >= this.maxSpeed) {
			System.out.println("Speed reached max!" + this.maxSpeed + " km/h");
			this.currentSpeed = this.maxSpeed;
		} else if (this.currentSpeed + speedChange <= 0) {
			System.out.println("Vehicle came to a stop!");
			this.currentSpeed = 0 ;
		} else {
			this.currentSpeed = this.currentSpeed + speedChange;
			System.out.println("Vehicle is now speeding at " + this.currentSpeed + "!");
		}
		     
	}
	
	public void accelerate(int speedChange) {
		System.out.println("Accelarating by " + Math.abs(speedChange));
		this.changeSpeed(Math.abs(speedChange));
	}

	public void decelerate(int speedChange) {
		System.out.println("Decelerating by " + Math.abs(speedChange));
		this.changeSpeed(Math.abs(speedChange) * (-1));
	}


}
