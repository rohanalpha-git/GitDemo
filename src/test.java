import java.util.HashSet;

public class test {
public static void main(String[] args) {
	String s = "Java is a object oriented programming language";
	String[] st = s.split(" ");
	byte[] ar = s.getBytes();
	int i=0;
	for (String word:st)
	{ 
		if(i%2 == 0)
		{
	    byte[] arr = word.getBytes();
	    byte[] result = new byte[arr.length];
		for(int j=0;j<arr.length;j++)
		{
			result[i]= arr[arr.length-i-1];
		}
		System.out.println(result);
		
		}
		i++;
	}
	
}
}
