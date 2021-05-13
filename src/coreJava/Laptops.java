package coreJava;

public class Laptops {
	int ram;
	int screenSize;
	String processorName;
	public Laptops(int ram, int screenSize, String processorName )
	{
		this.processorName=processorName;
		this.ram=ram;
		this.screenSize=screenSize;
		
	}
	@Override
	public String toString()
	{
		return "Laptop [Ram = "+ram+" Screen Size = "+screenSize+" Processor name = "+processorName+ "]";
	}

}
