package com.design_patterns;

abstract class Vehicle
{
	public abstract int getWheel();
	
	public String toString()
	{
		return "Wheels : " + this.getWheel();
	}
}

class Car extends Vehicle
{
	int wheel;
	Car(int wheel)
	{
		this.wheel=wheel;
	}
	public int getWheel()
	{
		return this.wheel;
	}
}

class Bike extends Vehicle
{
	int wheel;
	Bike(int wheel)
	{
		this.wheel=wheel;
	}
	public int getWheel()
	{
		return this.wheel;
	}
} 

class VehicleFactory
{
	public static Vehicle getInstance(String type,int wheel) {
		if(type == "car")
		{
			return new Car(wheel);
		}
		else if(type == "bike")
		{
			return new Bike(wheel);
		}
		
		return null;
	}
}
public class FactorymethodPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vehicle car = VehicleFactory.getInstance("car",4);
		System.out.println(car);
		
		Vehicle bike = VehicleFactory.getInstance("bike",2);
		System.out.println(bike);
		
		
	}

}
