package com.shikhu.abstractionexample;

public class Car extends PersonalVehicle{

	int fuelCapacity = 30;
	int numberOfWheels = 4;
	
	@Override
	public void start() {
		
		System.out.println(numberOfWheels +" "+numberOfSeats +" "+fuelCapacity+" "+speed);
	
		System.out.println("I am self start");
	
	}

}
