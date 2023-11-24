import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;




public class Game 
{

	static Menu s = new Menu();
	static String[] board;
	static String turn;
	
	  public static int p1 = 0;
	  public static int p2 = 0;
	  public static int draw = 0;
	  public static int tot = p1 + p2 + draw;
	
	public void game()
	{
		

	Scanner in = new Scanner(System.in);
    board = new String[9];
    turn = "X";
    String winner = null;

    for (int a = 0; a < 9; a++) {
        board[a] = String.valueOf(a + 1);
    }

    System.out.println("Welcome to 3x3 Tic Tac Toe.");
    printBoard();

    System.out.println(
        "X will play first. Enter a slot number to place X in:");

    while (winner == null) 
    {
        int numInput;
      
        try 
        {
            numInput = in.nextInt();
            
            if (!(numInput > 0 && numInput <= 9)) 
            {
                System.out.println("Invalid input; re-enter slot number:");
                
                continue;
            }
        }
        
        catch (InputMismatchException e) 
        {
            System.out.println("Invalid input; re-enter slot number:");
            continue;
        }
         
        if (board[numInput - 1].equals(String.valueOf(numInput))) 
        {
            board[numInput - 1] = turn;

            if (turn.equals("X")) 
            {
                turn = "O";
            }
            
            else 
            {
                turn = "X";
            }

            printBoard();
            
            winner = checkWinner();
        }
        
        else 
        {
            System.out.println("Slot already taken; re-enter slot number:");
        }
    }
   
    if (winner.equalsIgnoreCase("draw")) 
    {
        System.out.println("It's a draw! Thanks for playing.");
    }
   
    else 
    {
        System.out.println("Congratulations! " + winner + "'s have won! Thanks for playing.");
    }
	
    	in.close();
	}
	
	static String checkWinner()
    {
        for (int a = 0; a < 8; a++) 
        {
            String line = null;
 
            switch (a) 
            {
            case 0:
                line = board[0] + board[1] + board[2];
                break;
            case 1:
                line = board[3] + board[4] + board[5];
                break;
            case 2:
                line = board[6] + board[7] + board[8];
                break;
            case 3:
                line = board[0] + board[3] + board[6];
                break;
            case 4:
                line = board[1] + board[4] + board[7];
                break;
            case 5:
                line = board[2] + board[5] + board[8];
                break;
            case 6:
                line = board[0] + board[4] + board[8];
                break;
            case 7:
                line = board[2] + board[4] + board[6];
                break;
            }
            //For X winner
            if (line.equals("XXX")) 
            {
                s.menu();
            	return "X" + p1;
            }
             
            // For O winner
            else if (line.equals("OOO")) 
            {
            	s.menu();
            	return "O" + p2;
            }
        }
         
        for (int a = 0; a < 9; a++) {
            
			if (Arrays.asList(board).contains(String.valueOf(a + 1))) 
			{
                break;
            }
			
            else if (a == 8) 
            {
            	s.menu();
            	return "draw" + draw;
            }
        }
 
     
        System.out.println(turn + "'s turn; enter a slot number to place " + turn + " in:");
        return null;
    }
     
     static void printBoard()
    {
        System.out.println("|---|---|---|");
        System.out.println("| " + board[0] + " | " + board[1] + " | " + board[2] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[3] + " | " + board[4] + " | " + board[5] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[6] + " | " + board[7] + " | " + board[8] + " |");
        System.out.println("|---|---|---|");
    }
 
   public void stats()
   {

	   
	   System.out.println("Player 1 games won: " + p1);
	   System.out.println("   ");
	   System.out.println("Player 2 games won: " + p2);
	   System.out.println("    ");
	   System.out.println("Number of games ended in a draw: " + draw);
	   System.out.println("    ");
	   System.out.println("Total number of games : " + tot);
   }
   
	public void quit()
	{
		System.out.println(" Let's quit!");
		System.exit(0);
	}

}
