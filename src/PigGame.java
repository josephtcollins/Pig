import java.util.Scanner;


public class PigGame {
	private static Scanner scan;

	private int cap;
	int score = 0; int base = 0; int answer = -1;
	int die1; int die2;
	boolean stop = true;
	
	public PigGame() {
		cap = 50;
	}
	
	public PigGame(int cap) {
		this.cap = cap;
	}
	
	public int play() {
		scan = new Scanner (System.in);

		Dice die;
		die = new Dice();
		int count = 1;
		System.out.println("Starting a new game of pig with cap " + cap + "...");
		System.out.println("---------------------------------------------------");
		
		while (score < cap) { 
			base = score;
			stop = (!stop);
			
			while(!stop) {
				
				System.out.println("Shake* Shake* Shake*");
				try {
						Thread.sleep(1500); // a pause for the dice shaking
					}
				catch(InterruptedException ex) {
				    Thread.currentThread().interrupt();
				}
				die1 = die.roll();
				die2 = die.roll();
				System.out.println("You rolled a " + die1 + " and a " + die2);
				
				if (die1 == 1 && die2 ==1){
					
					score = 0; // reset everything
					base = 0;
					
					System.out.println("Snake eyes! Score and Checkpoint set to zero... ");
					count++; // turn counter
					
					System.out.println("Moving on to turn number " + (count));
					System.out.println("Your score is " + score);
					
				}
				else {
					if (die1 == 1 || die2 == 1){
						
						score = base; // reset to base

						System.out.println("You rolled a \"1\", Score set to last Checkpoint...");						
						count++;
						
						System.out.println("Moving on to turn number " + (count));
						System.out.println("Your score is " + score);
						
					}
					else {
						
						score = (die1 + die2 + score);
						   // normal turn
						System.out.println("Your score is " + score);
						
						if (score >= cap)
							break;
						
						System.out.println("Type \"1\" to keep going and \"0\" to Checkpoint...");
						
						answer = scan.nextInt();
						if (answer == 0){
							stop = true;
							base = score;
							count++;
							System.out.println("Moving on to turn number: " + (count));
						}
					}
				}
			}
		}
		
		System.out.println("You win! Your number of moves: " + count);
		return count;
	}

}
