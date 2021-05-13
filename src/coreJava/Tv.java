package coreJava;

public class Tv 
{
	String brand;
	int size;
	double price;
	public Tv(String brand, int size, double price)
	{
		this.brand=brand;
		this.size=size;
		this.price=price;
	}
	@Override
	public String toString()
	{
		return "TV [brand=" + brand + ", size = " + size + " price = "+ price +"]";
	}
}

