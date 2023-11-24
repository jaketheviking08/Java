
public class Main 
{

	public static int num = 1;

	
		
	public static void main(String[] args) 
	{
		
		
		even();
		odd();

	}
	
	public static void even()
	{
		System.out.println("The even numbers: ");
	  for(int e = 100; e > num;)
	  {
		  e = e - 2;
		  
		  System.out.println(e);
		  
		 
			  
	  }
	
	}
	
	public static void odd()
	{
		System.out.println("The Even Numbers: ");
		  for(int n = 101; n > num;)
		  {
			
			  n = n - 2;			  
			  
			  System.out.println(n);			  
			
				  
		  }
		
	}

}
