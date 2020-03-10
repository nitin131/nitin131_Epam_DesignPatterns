package com.design_patterns;

import java.util.*;
interface Subject 
{
	void register(Observer obj);
	void unregister(Observer obj);
	void notifyObserver();
}

class DeliveryData implements Subject
{

	private List<Observer> observers;
	private String location;
	public DeliveryData()
	{
		this.observers=new ArrayList<Observer>();
	}
	public void register(Observer obj) {
		// TODO Auto-generated method stub
		observers.add(obj);
	}

	public void unregister(Observer obj) {
		// TODO Auto-generated method stub
		observers.remove(obj);
	}

	public void notifyObserver() {
		// TODO Auto-generated method stub
		for(Observer obj : observers)
		{
			obj.update(this.location);
		}
	}
	public void locationChanged()
	{
		this.getLocation();
		notifyObserver();
		System.out.println("Locaion : " + location);
	}
	public String getLocation()
	{
		return "India";
	}
	
}
interface Observer
{
	public void update(String location);
}
class Seller implements Observer
{
	private String location;

	public void update(String location) {
		// TODO Auto-generated method stub
		this.location = location;
	}
	public void showLocation()
	{
		System.out.println("Locaion : " + location);
	}
	
}
public class ObserverDesign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DeliveryData data = new DeliveryData();
		
		Observer obj = new Seller();
		
		data.register(obj);
		data.locationChanged();

	}

}
