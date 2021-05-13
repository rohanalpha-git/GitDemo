package Exception;
import Exception.LowCreditScore;

public class MainClass2 {
	public static void main(String[] args) 
	{
		Creditcard c1 = new Creditcard();
		try 
		{
			c1.cardIssue(89);
		} 
		catch (LowCreditScore e) 
		{
			e.printStackTrace();
		}
	}

}
