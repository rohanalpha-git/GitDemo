package coreJava;

public class Mobile 
{
	String brand;
	int imei;
	double price;
	public Mobile(String brand, int imei, double price)
	{
		this.brand=brand;
		this.imei=imei;
		this.price=price;
	}
	@Override
	public String toString()
	{
		return "Mobile [brand=" + brand + ", imei = " + imei + " price = "+ price +"]";
	}
}
