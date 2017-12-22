
package com.ssimsekler.HelloWorldJava01;

public class HelloWorld {

	public static void main(String[] args) {

		Vehicle veh = new Vehicle("", "", "", true, 2, 100);
		veh.make = "";
		
		SportsCar myPorsche = new SportsCar("My Porsche", "Porsche", "911", 6, 300);
		
		myPorsche.changeGear(1);
		myPorsche.accelerate(10);
		myPorsche.changeGear(2);
		myPorsche.accelerate(10);
		myPorsche.changeGear(3);
		myPorsche.accelerate(20);
		myPorsche.changeGear(4);
		myPorsche.accelerate(10);
		myPorsche.changeGear(5);
		myPorsche.accelerate(10);
		myPorsche.changeGear(6);
		myPorsche.accelerate(10);
		myPorsche.accelerate(10);
		myPorsche.accelerate(30);
		myPorsche.accelerate(50);
		myPorsche.accelerate(50);
		myPorsche.accelerate(100);
		
		myPorsche.decelerate(200);
		myPorsche.decelerate(50);
		myPorsche.changeGear(5);
		myPorsche.decelerate(10);
		myPorsche.changeGear(4);
		myPorsche.decelerate(10);
		myPorsche.changeGear(3);
		myPorsche.decelerate(10);
		myPorsche.changeGear(2);
		myPorsche.decelerate(10);
		myPorsche.changeGear(1);
		myPorsche.decelerate(10);
	}

}
