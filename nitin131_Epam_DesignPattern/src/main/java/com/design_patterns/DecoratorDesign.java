package com.design_patterns;

interface Dress
{
	public void assemble();
}

class BasicDress implements Dress
{
	public void assemble()
	{
		System.out.println("Basic Dress Feature");
	}
}

class DressDecorator implements Dress
{
	protected Dress dress;
	public DressDecorator(Dress dress)
	{
		this.dress=dress;
	}
	public void assemble()
	{
		this.dress.assemble();
	}
}
class SportsWear extends DressDecorator
{
	public SportsWear(Dress dress) {
		super(dress);
		// TODO Auto-generated constructor stub
	}
	public void assemble()
	{
		super.assemble();
		System.out.println("\tSports Dress Feature");
	}
}

class PartyWear extends DressDecorator
{
	public PartyWear(Dress dress) {
		super(dress);
		// TODO Auto-generated constructor stub
	}
	public void assemble()
	{
		super.assemble();
		System.out.println("\tParty wear Dress Feature");
	}
}
class CasualWear extends DressDecorator
{
	public CasualWear(Dress dress) {
		super(dress);
		// TODO Auto-generated constructor stub
	}
	public void assemble()
	{
		super.assemble();
		System.out.println("\tCasual Dress Feature");
	}
}


public class DecoratorDesign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dress sportswear = new SportsWear(new BasicDress());
		sportswear.assemble();
		System.out.println();
		
		Dress partywear = new PartyWear(new BasicDress());
		partywear.assemble();
		System.out.println();
		
		Dress casualwear = new CasualWear(new BasicDress());
		casualwear.assemble();
		System.out.println();
	}

}
