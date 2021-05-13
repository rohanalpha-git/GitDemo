package coreJava;

public class Earphone {
	String brand;
	double price;
	boolean bluetooth;
	public Earphone(String brand, double price, boolean bluetooth)
	{
		this.bluetooth=bluetooth;
		this.brand=brand;
		this.price=price;
		
	}
	@Override
	public String toString()
	{
		return "Earphone [brand = "+brand+" price = "+price+" bluetooth = "+bluetooth+ "]"; 
	}

}
