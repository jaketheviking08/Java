import java.util.Scanner;

public class Menu 
{

	static Game start = new Game();
	
	public void menu()
	{
		System.out.println("Tic Tac Toe Menu:");
		System.out.println("      ");
		System.out.println(" 1. Play the game. ");
		System.out.println(" 2. Statistics. ");
		System.out.println(" 3. Quit ");
		System.out.println(" Press number selection to continue....");
		
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		
		if(input == 1)
		{
			start.game();			
		}
		
		if(input == 2)
		{
			start.stats();
			
			
		}
		
		if(input == 3)
		{
			start.quit();
			
			
		}
		
		
		scanner.close();
	}
	
}
