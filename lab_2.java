package lab2;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

public class lab_2 
{

	
	public static double random1 = 0;
	public static double gamesplayed = 0;
	public static double right = 0;
	public static double correct = 0;
	public static int input = 0;
	public static double avg = right/gamesplayed;
	

	
	
	
	public static void main(String[] args) 
	{
		
		menu(input);
		
	}
	
	public static  int menu(int input)
	{
		System.out.println("Guess the Days Menu:");
		System.out.println("      ");
		System.out.println(" 1. Play ");
		System.out.println(" 2. Statistics ");
		System.out.println(" 3. Quit");
		System.out.println("      ");
		System.out.println(" Press number selection to continue....");
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		input = scanner.nextInt();
		
		if(input == 1)
		{
			play();
			
		}

		if(input == 2)
		{
			stats(right,gamesplayed);
			
		}
		
		if(input == 3)
		{
			quit();
			
		}
		return input;
		
		
	}
	
	//Selection 1
		public static double play()
		{
			
			gamesplayed += 1;
			
			 // define the range
	        int max = 100;
	        int min = 1;
	        int range = max - min + 1;
	 
	        // generate random numbers within 1 to 100
	        for (int i = 0; i < 1; i++) 
	        {
	           
	        	
	       random1 = (int)(Math.random() * range) + min;
	        	
	        }
	          
	        System.out.println("Random Day: " + random1);
	        System.out.println(" ");
	        System.out.println("Enter the number of days between today and the Random Day: ");
	        
	        correct = random1 - getDate();
	        
	        @SuppressWarnings("resource")
			Scanner input = new Scanner(System.in);	
	        int x = input.nextInt();
	        
	        if(x == correct)
	        {
	        	System.out.println("Correct!!! The Correct answer is: " + correct);
	        	
	        	right =+ 1;
	        	
	        	System.out.println(right);
	        	System.out.println(" ");
	        	
	        	System.out.println("Guess the Days Menu:");
				System.out.println("      ");
				System.out.println(" 1. Play ");
				System.out.println(" 2. Statistics ");
				System.out.println(" 3. Quit");
				System.out.println("      ");
				System.out.println(" Press number selection to continue....");
				
				@SuppressWarnings("resource")
				Scanner scanner = new Scanner(System.in);
				int input2 = scanner.nextInt();
				
				if(input2 == 1)
				{
					play();
					
				}

				if(input2 == 2)
				{
					stats(right,gamesplayed);
					
				}
				
				if(input2 == 3)
				{
					quit();
					
				}
	        	return right + gamesplayed;
	        }
	        
	        else
	        {
	        	
	        	System.out.println("Wrong!!! The Correct answer is: " + correct);
	        	
	        	System.out.println("Guess the Days Menu:");
				System.out.println("      ");
				System.out.println(" 1. Play ");
				System.out.println(" 2. Statistics ");
				System.out.println(" 3. Quit");
				System.out.println("      ");
				System.out.println(" Press number selection to continue....");
				
				@SuppressWarnings("resource")
				Scanner scanner = new Scanner(System.in);
				int input3 = scanner.nextInt();
				
				if(input3 == 1)
				{
					play();
					
				}

				if(input3 == 2)
				{
					stats(right,gamesplayed);
					
				}
				
				if(input3 == 3)
				{
					quit();
					
				}
	        	return gamesplayed;
	        }

		}
		
		//Selection 2
		public static double stats(double right, double gamesplayed)
		{
			double avg = 0.0;
			avg = right/gamesplayed;
			
			
			System.out.println("Stats are in! ");
			
			System.out.println("Games Played: " + gamesplayed);
			
			System.out.println("Average Guesses: " + avg);
			System.out.println(" ");
			System.out.println(" ");
			System.out.println(" ");
			
			System.out.println("Guess the Days Menu:");
			System.out.println("      ");
			System.out.println(" 1. Play ");
			System.out.println(" 2. Statistics ");
			System.out.println(" 3. Quit");
			System.out.println("      ");
			System.out.println(" Press number selection to continue....");
			
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
			int input = scanner.nextInt();
			
			if(input == 1)
			{
				play();
				
			}

			if(input == 2)
			{
				stats(right,gamesplayed);
				
			}
			
			if(input == 3)
			{
				quit();
				
			}
			return avg;
			
			
		}

		//Selection 3
		public static void quit()
		{
			
			System.out.println(" Let's quit!     ");
			
			System.exit(0);
			
		}
		
		//Get Date
		public static int getDate()
		{
			
			Calendar now = Calendar.getInstance();
			
			int day = now.get(Calendar.DAY_OF_MONTH);
			
			return day;
			
			
			
		}
		
		public static void statsTest(double right, double gamesplayed)
		{
			
			
			List<Object> list = statValue();
			
			System.out.println(list);
			
			
				

		}
		
		public static List<Object> statValue()
		{
			double r = right;
			double g = gamesplayed;
			double a = avg;
			return Arrays.asList(r,g,a);
		}

}
