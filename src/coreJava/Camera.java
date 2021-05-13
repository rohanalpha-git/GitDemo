package coreJava;

public class Camera {
int megaPixels;
String brand;
int zoom;
public Camera(int megaPixels, String brand, int zoom)
{
	this.brand=brand;
	this.megaPixels=megaPixels;
	this.zoom=zoom;
}
public String toString()
{
	return "Camera [megaPixels = "+megaPixels+" brand = "+brand+" zoom = "+zoom+ "]";
	}
}

