package Exception;
class LoginAccessException extends Exception
{
	LoginAccessException()
	{
		System.out.println("Login access Denied");
	}	
}
public class Facebook 
{
 void facebookLogin(String username, int password) throws LoginAccessException
 {
	 if (username=="Rohan" && password == 12345 )
	 {
		 System.out.println("Access granted");
	 }
	 else 
	 {
		 throw new LoginAccessException();
	 }
 }
}
