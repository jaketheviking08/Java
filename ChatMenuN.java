import java.util.Scanner;

public class ChatMenuN 
{

	Menu c = new Menu();
	
	@SuppressWarnings("resource")
	public void NormMenu()
	{
		System.out.println(" 1. Say Something  ");
		System.out.println(" 2. Back to Main Menu ");
		System.out.println("   ");
		System.out.println(" Press number selection to continue....");
		
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		
		if(input == 1)
		{
			System.out.println("Say Something: ");
			System.out.println(" ");
			
			Scanner scanner1 = new Scanner(System.in);
			String chat = scanner1.next();
			
			System.out.println("   ");
			System.out.println("Chat Log:   ");
			System.out.println(chat);
			
			c.menu();
			
		}

		if(input == 2)
		{
			c.menu();
			
			
		}
	}
	
}
