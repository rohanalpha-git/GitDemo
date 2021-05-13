package Hashset;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Hashed {
	public static void main(String[] args) {
		//HashSet hs = new HashSet();
		LinkedHashSet hs = new LinkedHashSet();
		hs.add("B");
		hs.add("B");
		hs.add("b");
		hs.add("D");
		hs.add("B");
		hs.add("S");
		hs.add("t");
		hs.add("N");
		hs.add("D");
		hs.add("A");
		
		for (Object ob: hs)
		{
			System.out.println(ob);
		}
		
		
	}

}
