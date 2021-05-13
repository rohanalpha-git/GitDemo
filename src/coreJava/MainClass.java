package coreJava;

import java.util.ArrayList;

public class MainClass {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(new Mobile("nokia", 89969, 4223.00));
		al.add(new Mobile("Samsung", 82469, 49999.00));
		al.add(new Mobile("apple", 8243259, 2222222.00));
		al.add(new Bike(220,23412.00,43414.00));
		al.add(new Bike(180,1222222.00,2222222.00));
		al.add(new Marker("Black",25.00));
		al.add(new Marker("Blue",30.00));
		for(int i =0; i<al.size();i++)
		{
			Object ob = al.get(i);//return type of get method is automatically up casted hence it must be stored in object class variable.
			System.out.println(ob);
		}
		
		for (int j=0; j<al.size();j++)
		{
			Object ob=al.get(j);
			if (ob instanceof Mobile)
			{
				Mobile M1 = (Mobile)ob;
				System.out.println(M1.brand+", "+M1.imei+", "+M1.price);
			}
			
			else if(ob instanceof Bike)
			{
			Bike B1 = (Bike)ob;
			System.out.println(B1.cc+", "+B1.milage+", "+B1.price);
			}
			else
			{
			Marker Ma1 = (Marker)ob;
			System.out.println(Ma1.color+", "+Ma1.price);
			}
		}
		}
	}

