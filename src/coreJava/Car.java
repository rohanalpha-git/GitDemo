package coreJava;

public class Car {
String type;
double tankCapacity;
boolean airBag;
public Car (String type, double tankCapacity, boolean airBag)
{
	this.type=type;
	this.tankCapacity=tankCapacity;
	this.airBag=airBag;
}
@Override
public String toString()
{
	return "Car [type=" + type + ", tankCapacity = " + tankCapacity + " airBag = "+ airBag +"]";
}
}
