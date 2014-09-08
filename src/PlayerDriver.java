import ch06.lists.*;

public class PlayerDriver {

	public static void main(String[] args) {
		ListInterface<Player> players = new ArraySortedList<Player>();
	    Player player, player2;
	      player = new Player("Joe", 10);
	      player2 = new Player("Steve", 9);
	      players.add(player);
	      players.add(player2);

	      System.out.println(players);

	      ListInterface<Player> playerss = new ArraySortedList<Player>(30);
	      Player tom;
	      tom = new Player("", 4);
	      playerss.add(tom);
	      System.out.println(playerss);
	      
	}

}
