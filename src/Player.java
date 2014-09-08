
public class Player implements Comparable<Player>{
	
		  protected String name;
		  protected int score;    

		  public Player(String name, int score) {
		    this.name = name;
		    this.score = score;
		  }

		  public String getName() {
		    return name;
		  }
		  
		  public int getScore() {
		    return score;
		  }

		  public int compareTo(Player other) {
		    if (this.score < other.score)
		      return -1;
		    else 
		      if (this.score == other.score)
		        return 0;
		      else 
		        return +1;
		  }

		  public String toString() {
		    return (score + ": " + name);
		  }

	}
	