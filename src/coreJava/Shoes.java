package coreJava;

public class Shoes {
String type;
String brand;
public Shoes(String type, String brand)
{
	this.type=type;
	this.brand=brand;
	}
@Override
public String toString()
{
	return "Shoes [type = "+type + ","+" brand = "+brand + "]";
	}
}
