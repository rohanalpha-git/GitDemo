package Exception;
class LowCreditScore extends Exception
{
	LowCreditScore()
	{
	System.out.println("You cannot get credit card beacuse of low credit score");
	}
}

public class Creditcard {

	void cardIssue(int creditScore) throws LowCreditScore
	{
		if (creditScore>800)
		{
			System.out.println("Your Application is accepted");
		}
		else 
		{
			throw new LowCreditScore(); 
		}
		
	}
}
	
