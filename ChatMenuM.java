import java.util.Scanner;

public class ChatMenuM 
{

	Menu b = new Menu();
	
	@SuppressWarnings("resource")
	public void ModMenu() 
	{
		System.out.println(" 1. Say Something  ");
		System.out.println(" 2. Add New Player ");
		System.out.println(" 3. Add New Moderator ");
		System.out.println(" 4. Back to Main Menu ");
		System.out.println("   ");
		System.out.println(" Press number selection to continue....");
		
		Scanner scanner5 = new Scanner(System.in);
		int input = scanner5.nextInt();
		
		if(input == 1)
		{
			System.out.println("Say Something: ");
			System.out.println(" ");
			
			Scanner scanner1 = new Scanner(System.in);
			String chat1 = scanner1.next();
			
			System.out.println("   ");
			System.out.println("Chat Log:   ");
			System.out.println(chat1);
			
			b.menu();
			
		}

		if(input == 2)
		{
			System.out.println("Add New Player: ");
			System.out.println(" ");
			
			Scanner player = new Scanner(System.in);
			String chat2 = player.next();
			
			System.out.println("   ");
			System.out.println("New Player Added:   ");
			System.out.println(chat2);
			
			b.menu();
			
		}
		
		if(input == 3)
		{
			System.out.println("Add new Moderator: ");
			System.out.println(" ");
			
			Scanner scanner2 = new Scanner(System.in);
			String chat3 = scanner2.next();
			
			System.out.println("   ");
			System.out.println("Moderator Added:   ");
			System.out.println(chat3);
			
			b.menu();
			
		}
		
		if(input == 4)
		{
			b.menu();
			
		}
		
	}


	
}
