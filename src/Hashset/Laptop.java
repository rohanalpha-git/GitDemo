package Hashset;

public class Laptop {
	int ram;
	int imei;
	String processorName;
	public Laptop(int ram, int imei, String processorName )
	{
		this.processorName=processorName;
		this.ram=ram;
		this.imei=imei;
		
	}
	@Override
	public String toString()
	{
		return "Laptop [Ram = "+ram+" Screen Size = "+imei+" Processor name = "+processorName+ "]";
	}
	@Override
	public int hashCode()
	{
		return imei;
	}
	@Override
	public boolean equals(Object e)
	{
		Laptop l1 = (Laptop)e;
		return this.imei==l1.imei;
		
	}
	


}
