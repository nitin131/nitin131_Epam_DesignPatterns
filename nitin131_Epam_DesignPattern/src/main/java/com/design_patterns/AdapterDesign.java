package com.design_patterns;

interface WebDriver
{
	public void getElement();
	public void selectElement();
}
class ChromeDriver implements WebDriver
{
	public void getElement()
	{
		System.out.println("CHROME DRIVER : GET ELEMENT");
	}
	public void selectElement()
	{
		System.out.println("CHROME DRIVER : SELECT ELEMENT");
	}
}

class IEDriver
{
	public void findElement()
	{
		System.out.println("IE DRIVER : find ELEMENT");
	}
	public void clickElement()
	{
		System.out.println("IE DRIVER : CLICK ELEMENT");
	}
}

class WebDriverAdapter implements WebDriver
{
	IEDriver ieDriver;
	
	public WebDriverAdapter(IEDriver ieDriver) {
		this.ieDriver=ieDriver;
	}
	public void getElement()
	{
		ieDriver.findElement();
	}
	public void selectElement()
	{
		ieDriver.clickElement();
	}
	
}
public class AdapterDesign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver chrome = new ChromeDriver();
		chrome.getElement();
		chrome.selectElement();
		
		IEDriver exp = new IEDriver();
		exp.findElement();
		exp.clickElement();
		
		WebDriver web = new WebDriverAdapter(exp);
		web.getElement();
		web.selectElement();
	}

}
