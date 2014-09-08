import java.util.Scanner;

	public class PigClass {
		private static Scanner scan;

		private int cap;
		int score = 0; int base = 0; int answer = -1;
		int die1; int die2;
		boolean stop = false;
		
		public PigClass() 
		{
			cap = 50;
		}
		
		public PigClass(int cap) 
		{
			this.cap = cap;
		}
		
		public void play()
		{
			scan = new Scanner (System.in);

			Dice die;
			die = new Dice();
			
			

			
		}

	}


