import java.util.ArrayList;

public class ChatLog 
{

	
	
	static ChatMenuM c = new ChatMenuM();
	static ChatMenuN cg = new ChatMenuN();
	
	
	public static ArrayList<String>newchat = new ArrayList<>();
	
	public static void creds()
	{
		//Populate Chat Log
		newchat.set(0, "The program is great!");
		newchat.set(1, "It crashed!");
		newchat.set(2, "It's Wonderful!");
		newchat.set(3, "It's Okay");
		newchat.set(4, "Yeah");
		newchat.set(5, "Needs Upgraded");
		newchat.set(6, "Great Times");
		newchat.set(7, "How's the weather");
		newchat.set(8, "Is it over yet?");
		newchat.set(9, "Nice times");
		
		for(int i = 0; i < newchat.size(); i++)
		{
			System.out.println(newchat.get(i));
		}
		
		
		
		
		
	}
}
