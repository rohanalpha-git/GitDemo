package Exception;

public class Mainclass3 {
public static void main(String[] args) {
	Facebook f1 =new Facebook();
	try
	{
	f1.facebookLogin("Roh", 12345);
	}
	catch(LoginAccessException e)
	{
		e.printStackTrace();
	}
}

}
