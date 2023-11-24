import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JFileChooser;


public class Main 
{

	
	public static int total_words = 0;
	
	public static void main(String[] args) 
	{
	
		read_file();
		words();

	}
	
	public static void read_file()
	{
		
		//C:\\eclipse\\Exercise_12\\src\\file.txt"
		
		JFileChooser chooser = new JFileChooser();
		
		/*Scanner in = new Scanner(System.in); //reads from keyboard
		int num = 0; //declares variable and puts zero in it
		System.out.println("Input a number:"); //prints to screen
		num = in.nextInt(); //waits for user to enter number and press enter
		System.out.println("You entered: " + num); //prints to screen the user input number
		*/
		
		File file = new File("C:\\eclipse\\Exercise_12\\src\\file.txt"); //reads file.txt
		
		try 
		{
			Scanner s = new Scanner(file);
			s.useDelimiter("[^A-Za-z]+");			
			ArrayList<String> word = new ArrayList<String>() ;
			
		for(int i = 0; i < 10; i++)
			{
				
						
			word.add(s.next());
            
            total_words++;
				
											
 			}
			
		for(int x = 0; x < 10; x++)
			{
			
			System.out.print(word.get(x) + " ");
			
			}
		
			
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		
	}
		public static void words()
		{
			
			System.out.println("Total words: " + total_words);
			
		}
		
		/*
		if(chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION)
		 
		{
			File selectedFile = chooser.getSelectedFile();
		}
		
		while(in.hasNext())
		{
			String input = in.next();
			System.out.println(input);
		}
		*/
		
	

}
