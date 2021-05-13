package Exception;
class UnderAgeException extends Exception
{
	public UnderAgeException()
	{
		System.out.println("You are not of drinking Age");
	}
}

public class LiquorShop {
	public void purchase(int age) throws UnderAgeException
	{
		if (age>21)
		{
			System.out.println("Allowed to make a purchase");
		}
		else 
			{
			throw new UnderAgeException();
			}
		}
	}

