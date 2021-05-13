package coreJava;

import java.util.ArrayList;

public class Mainclass3 {
	public static void main(String[] args) {
		ArrayList a2 = new ArrayList();
		a2.add(new Laptops(4, 17, "Intel i11"));
		a2.add(new Laptops(12, 13, "AMD ryzen7"));
		
		a2.add(new Earphone("Apple",50000.00,true));
		a2.add(new Earphone("Beats",25000.00, false));
		
		a2.add(new Camera(108,"Cannon", 50));
		a2.add(new Camera(240,"Nikkon", 100));
		for(int i =0; i<a2.size();i++)
		{
			Object ob = a2.get(i);
			System.out.println(ob);
		}
		
		for (int j=0; j<a2.size();j++)
		{
			Object ob=a2.get(j);
			if (ob instanceof Laptops)
			{
				Laptops l1 = (Laptops)ob;
				System.out.println("ram = "+l1.ram);
				System.out.println("processor name= "+l1.processorName);
				System.out.println("Screen size = "+l1.screenSize);
				
				
			}
			
			else if(ob instanceof Earphone)
			{
				Earphone e1 = (Earphone)ob;
			System.out.println("Brand = "+e1.brand);
			System.out.println("bluetooth = "+e1.bluetooth);
			System.out.println("price = "+e1.price);
			}
			else
			{
				Camera c1 = (Camera)ob;
			System.out.println("Number of Megapixels = "+c1.megaPixels);
			System.out.println("Brand of camera = "+c1.brand);
			System.out.println("Zoom capacity = "+c1.zoom);
			}
		}
		}
	}