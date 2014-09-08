import ch08.trees.*;
import ch06.lists.*;
import support.*;

import java.util.Scanner;

public class Pig {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner (System.in);
		
		ListInterface<String> names = new ArraySortedList<String>();
		String name = "*@(!";
		BSTInterface<Player> players = new BinarySearchTree<Player>();
		Player player;

		PigGame pig;
		int score = 0; int size = 0; int cap;
		boolean finish = false;
		
		System.out.println("Welcome to the game Pig");
		System.out.println("Enter the Pig Limit to be used for all players");
		cap = scan.nextInt();
		scan.nextLine();
		
		System.out.println("Enter your name for the scoreboard (Press enter to quit)");
		name = scan.nextLine();
		
		while (name.compareTo("") != 0) {			
			finish = false;
	    	
	    	while (!finish) {
	    		
	    		if (!names.contains(name)) { // checks for name repeat
	    			pig = new PigGame(cap); // start new pig game with same cap
	    			score = pig.play(); // plays pig and returns score
	    			
	    			names.add(name);
	    			player = new Player(name, score);
	    			players.add(player);
	    			System.out.println("Next person enter your name for the scoreboard (Press enter to quit)");
	    			name = scan.nextLine();
	    			finish = true;
	    		}
	    		
	    		else {
	    				System.out.println("That name is already taken, enter a new one.");
	    				name = scan.nextLine();
	    		}
	    	}
				
		}
		
	    System.out.println("SCOREBOARD \n---------------");
	    size = players.reset(BinarySearchTree.INORDER);
		for (int i=1; i <= size; i++) // prints the tree
		{
		      System.out.println(players.getNext(BinarySearchTree.INORDER)); 
		}	
	}
}
