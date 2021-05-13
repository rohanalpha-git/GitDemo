package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Mainclass {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(new Laptop(2,2,"amd"));
		al.add(new Laptop(4,28,"intel"));
		al.add("java");
		/*Iterator ref = al.iterator();
		while (ref.hasNext())
		{
			Object ob = ref.next();
			System.out.println(ob);
		}
		ListIterator ref2 = al.listIterator();
		while(ref2.hasNext())
		{
			Object ob = ref2.next();
			System.out.println(ob);
		}
		while (ref2.hasPrevious())
		{
			Object ob = ref2.previous();
			System.out.println(ob);
		}*/
		for (Object ob : al)
		{
			System.out.println(ob);
		}
		
		
	}

}
