import java.util.Scanner;

public class Menu 
{

	
	static LogIn i = new LogIn();
	static LogOut o = new LogOut();

	
	public void menu()
	{
		
		System.out.println("Menu:");
		System.out.println("      ");
		System.out.println(" 1. Log In  ");
		System.out.println(" 2. Log Out ");
		System.out.println(" 3. Quit ");
		System.out.println("   ");
		System.out.println(" Press number selection to continue....");
		
		
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		
		if(input == 1)
		{
			i.login();
			
		}

		if(input == 2)
		{
			o.logout();
			
		}

		if(input == 3)
		{
			System.out.println(" Let's quit!     ");
			
			System.exit(0);
			
		}
		
		scanner.close();
		

		
	}
	
	
	
	
	
}
