package coreJava;

public class Marker {
String color;
double price;
public Marker(String color,double price)
{
	this.color=color;
	this.price=price;
	}
@Override
public String toString()
{
	return "Marker [ color = "+color + ","+" Price = "+price + "]";
	}
}
