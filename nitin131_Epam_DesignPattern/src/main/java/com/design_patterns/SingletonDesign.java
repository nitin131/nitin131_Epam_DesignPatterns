package com.design_patterns;

class SingletonPattern
{
	private static SingletonPattern instance;
	
	private SingletonPattern()
	{}
	
	public static SingletonPattern getInstance()
	{
		if(instance == null) 
		{
			instance = new SingletonPattern();
		}
		return instance;
	}
}

public class SingletonDesign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SingletonPattern instance = SingletonPattern.getInstance();
		
		System.out.println("Creational design pattern -> Singleton pattern : " + instance);

	}

}
