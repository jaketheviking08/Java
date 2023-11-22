import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileIO {

	public static void main(String[] args) 
	{
		read_file();
		write_file();

	}
	
	public static void read_file()
	{
		//"C:\\eclipse\\Exercise_11\\src\\file.txt"
		
		try 
		{
			BufferedReader reader = new BufferedReader(new FileReader("C:\\eclipse\\Exercise_11\\src\\file.txt"));
			
			String line;
			
			while((line = reader.readLine()) != null)
			{
			System.out.println(line);
			}
			reader.close();
		} 
		
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//reader.();
		
		//reader.close();
		
	}
	
	public static void write_file()
	{
		String fn = "Jake";
		String ln = "The Viking";
		String t = "IT Supervisor";
		double s = 145000.00;
		
		
		try 
		{
			BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\eclipse\\Exercise_11\\src\\output.txt"));
			
			writer.write("Writing to file...");
			writer.write("\n");
			writer.write("\nName: " + fn + " " + ln);
			writer.write("\n");
			writer.write("\nTitle: " + t);
			writer.write("\n");
			writer.write("\nSalary: $" + s);
			
			writer.close();
		} 
		
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
