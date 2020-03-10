package com.design_patterns;

interface Command
{
	public void execute();
}
class Light
{
	public void on()
	{
		System.out.println("Light is ON");
	}
	public void off()
	{
		System.out.println("Light is OFF");
	}
}
class LightOnCommand implements Command
{

	Light light;
	public LightOnCommand(Light light)
	{
		this.light=light;
	}
	public void execute() {
		// TODO Auto-generated method stub
		light.on();
	}
	
}
class LightOffCommand implements Command
{

	Light light;
	public LightOffCommand(Light light)
	{
		this.light=light;
	}
	public void execute() {
		// TODO Auto-generated method stub
		light.off();
	}
	
}
class Switch
{
	Command key;
	
	public void setCommand(Command  command)
	{
		key = command;
	}
	public void action()
	{
		key.execute();
	}
}
public class CommandDesign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Switch plug = new Switch();
		
		Light light = new Light();
		
		plug.setCommand(new LightOnCommand(light));
		plug.action();
		
		plug.setCommand(new LightOffCommand(light));
		plug.action();
	}

}
