import java.util.Scanner;

public class LogIn 
{

	ChatMenuM z = new ChatMenuM();
	ChatMenuN n = new ChatMenuN();
	
	public void login()
	{
		
		System.out.println("Please enter your Useranme and Password: ");
		System.out.println(" ");
		System.out.println("Username: ");
		
		Scanner un = new Scanner(System.in);
		String user = un.next();
		
		if (user.equals("jake"))
		{
			System.out.println("Password: ");
			
			Scanner pass = new Scanner(System.in);
			String password = pass.next();
			
			if(password.equals("Welcome123"))
			{
				System.out.println("Logged in! ");
				pass.close();
				z.ModMenu();
			}
			else
			{
				System.out.println("Wrong Username or Password! ");
				login();
			}
		}
			
			if (user.equals("user"))
			{
				System.out.println("Password: ");
				
				Scanner pass2 = new Scanner(System.in);
				String password2 = pass2.next();
				
				if(password2.equals("1234"))
				{
					System.out.println("Logged in! ");
					n.NormMenu();
				}
				else
				{
					System.out.println("Wrong Username or Password! ");
					login();
				}
		}
		un.close();
	
		
		
	}
	
	
	
}
