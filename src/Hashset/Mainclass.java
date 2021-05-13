package Hashset;

import java.util.HashSet;

public class Mainclass {
	public static void main(String[] args) {

HashSet hs = new HashSet();
Laptop l1 = new Laptop (12, 8,"AMD");
Laptop l2 = new Laptop (12, 8,"AMD");
hs.add(l1);
hs.add(l2);
System.out.println(hs.size());
for (Object ob : hs)
{
	System.out.println(ob);
	}

}
}