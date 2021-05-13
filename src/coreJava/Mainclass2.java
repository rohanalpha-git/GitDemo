package coreJava;

import java.util.ArrayList;

public class Mainclass2 {
	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		a1.add(new Tv("OnePlus", 32, 12000.00));
		a1.add(new Tv("Sony", 48, 50000.00));
		a1.add(new Tv("MiTv", 86, 75000.00));
		
		a1.add(new Car("Hatchback",15.50,false));
		a1.add(new Car("SUV",20.50,true));
		
		a1.add(new Shoes("Sneakers","Puma"));
		a1.add(new Shoes("Boots","Nike"));
		for(int i =0; i<a1.size();i++)
		{
			Object ob = a1.get(i);
			System.out.println(ob);
		}
		
		for (int j=0; j<a1.size();j++)
		{
			Object ob=a1.get(j);
			if (ob instanceof Car)
			{
				Car c1 = (Car)ob;
				System.out.println("Type = "+c1.type);
				System.out.println("Tank capacity = "+c1.tankCapacity);
				System.out.println("Air bags = "+c1.airBag);
				
				
			}
			
			else if(ob instanceof Tv)
			{
			Tv t1 = (Tv)ob;
			System.out.println("Brand = "+t1.brand);
			System.out.println("Sccreen size = "+t1.size);
			System.out.println("price = "+t1.price);
			}
			else
			{
			Shoes s1 = (Shoes)ob;
			System.out.println("Type of shoe = "+s1.type);
			System.out.println("Brand of shoe = "+s1.brand);
			}
		}
		}
	}

