import java.util.*;

public class Kevinsdicegame1 {

	public static int Game () {

		return ((int)(Math.random () * 6 + 1));

	}

	public static void main (String [] args) {

		Scanner keyboard = new Scanner(System.in) ;		

		Random rnd = new Random ();

		// DECLARING VARIABLES 

		String shooter1;

		String shooter2;

		String Name;

		int dice1; 

		int dice2;

		dice1 = 0;
		dice2 = 0;

		// CREATING SEEDS 

		long seed1  = 5;

		Random r = new Random (seed1);

		long seed2  = 4;

		Random p = new Random (seed1);

		long seed3  = 16532;

		Random o = new Random (seed1);

		long seed4  = 1;

		Random m = new Random (seed1);

		// GETTING USERNAMES

		System.out.print ("Insert your name Player 1:   ");
		shooter1 = keyboard.next();


		System.out.print ("Insert your name Player 2:  ");
		shooter2 = keyboard.next();

		// FOR USERNAME EQUALS KEVIN 

		if ((shooter1.equals ("kevin") || shooter1.equals ("Kevin") )) {

			System.out.println ( "Kevin, please press R to roll a dice:    ");

			keyboard.next();
			dice1 = (r.nextInt (6) + (1)); 

			System.out.println ("Kevin's dice: " + dice1 );
		}


		else if  ((( shooter2.equals ("kevin") || shooter2.equals ("Kevin")) )) {

			System.out.print ( "Kevin, please press R to roll a dice:   ");

			keyboard.next();
			dice2 = (r.nextInt (6) + (1)); 
			System.out.println ("Kevin's dice: " + dice2 );



		}

		// IN CASE SHOOTER 1 IS NOT  KEVIN
		while (dice1 == 0 ) { 

			System.out.println ( shooter1 + " please press R to roll a dice:   ");
			keyboard.next();

			dice1 = (r.nextInt (1) + (1)); 

			System.out.println (shooter1 + " dice: " + dice1 );

			break;

		}

		// IN CASE SHOOTER 2 IS NOT  KEVIN

		while (dice2 == 0 ) { 

			System.out.println ( shooter2 + " please press R to roll a dice:   ");
			keyboard.next();

			dice2 = (r.nextInt (1) + (1)); 

			System.out.println (shooter2 + "'s dice: " + dice2 );

			break;}

		// DECIDING WHO THROWS THE DICE FIRST AND STARTING THE GAME

		while (dice1 > dice2) {


			System.out.println ( shooter1 + " starts shooting! Press R:   ");
			keyboard.next();
			int sDice1 = r.nextInt (6) + (1);
			int sDice2 = r.nextInt (6) + (1);
			System.out.print (shooter1 + " first dice:  " +  (sDice1+ " - " +  sDice2 ));

			dice1 = sDice1; 	
			dice2 = sDice2;
			break;	}

		while (dice2 > dice1) {

			System.out.println ( shooter2 + " starts shooting!  ");
			int sDice1 = o.nextInt (6) + (1);
			int sDice2 = p.nextInt (6) + (1);

			System.out.print (shooter2 + " First dice:  " +  (sDice1+ " - " +  sDice2 ));
			dice1 = sDice1; 	
			dice2 = sDice2;
			break;	}


		while ((dice1 == 3 && dice2 == 3) || (dice1 == 5 && dice2 == 5) || (dice1 == 6 && dice2 == 6) || (dice1 == 6 && dice2 == 5)) { 					

			System.out.println (" You win! ");

			System.exit(0);

			break;}

		// NO "KEVIN" USERNAME  

		// DECIDING WHO THROWS FIRST 

		while ( dice1 == dice2 && (!((shooter1.equals ("kevin") || shooter2.equals ("Kevin") ||  ( shooter2.equals ("kevin") || shooter1.equals ("Kevin")))))) { 

			System.out.println ("First player, please press R to roll a dice:   ");
			keyboard.next();
			dice1 = Game(); 	
			System.out.println (shooter1 + " this is your dice value: \n  " + dice1 + " " );



			System.out.println ("Second player, please press R to roll a dice:  ");
			keyboard.next();
			dice2 = Game(); 
			System.out.println (shooter2 + " this is your dice value: \n " + dice2 + " ");

		}

		if (dice1 > dice2) {
			System.out.println ( shooter1 + " starts shooting! \n  ");

			System.out.println ("First player, please press R continue: \n  ");

			keyboard.next();

			dice1 = Game(); 	
			dice2 = Game(); 

			System.out.println ( shooter1 + " this is your first dice value:  " + dice1 + " - " + dice2);
		}


		else if (dice2 > dice1) {

			System.out.println( shooter2 + " starts shooting!  ");
			System.out.println ("Second player, please press R continue:   ");

			keyboard.next();

			dice1 = Game(); 	
			dice2 = Game(); 	 
			System.out.println ( shooter2 + " this is your first dice value:  " + dice1 + " - " + dice2);
		}


		// CHECKING GAME RULES / CONDITIONS


		while ((dice1 == 1 && dice2 == 1) || (dice1 == 2 && dice2 == 2) || (dice1 == 4 && dice2 == 4) || (dice1 == 1 && dice2 == 2 )) {


			System.out.println (" YOU LOSE! \n");

			break;}


		while ((dice1 == 3 && dice2 == 3) || (dice1 == 5 && dice2 == 5) || (dice1 == 6 && dice2 == 6) || (dice1 == 6 && dice2 == 5)) { 					

			System.out.println (" You win! \n");
			break;}


		while (!((dice1 == 1 && dice2 == 1) || (dice1 == 2 && dice2 == 2) || (dice1 == 4 && dice2 == 4)
				|| (dice1 == 1 && dice2 == 2 ) || (dice1 == 3 && dice2 == 3) || (dice1 == 5 && dice2 == 5) || (dice1 == 6 && dice2 == 6) || (dice1 == 6 && dice2 == 5)))
		{

			dice1 = Game(); 	
			dice2 = Game(); 	 

			System.out.println ("Oponent player, please press R to roll a dice:  ");
			keyboard.next();
			System.out.println ("Your dice value is: \n" + dice1 + " - " + dice2);

			// IN CASE OF LOSING

			if ((dice1 == 1 && dice2 == 1) || (dice1 == 2 && dice2 == 2) || (dice1 == 4 && dice2 == 4) || (dice1 == 1 && dice2 == 2 )){

				System.out.println ("You lose :( \n");
			}
			// IN CASE OF WINNING
			else if ((dice1 == 3 && dice2 == 3) || (dice1 == 5 && dice2 == 5) || (dice1 == 6 && dice2 == 6) || (dice1 == 6 && dice2 == 5)) {
				System.out.println ("You win \n");

			}
			// IN CASE OF TIE BETWEEN PLAYERS
			if (!((dice1 == 1 && dice2 == 1) || (dice1 == 2 && dice2 == 2) || (dice1 == 4 && dice2 == 4)
					|| (dice1 == 1 && dice2 == 2 ) || (dice1 == 3 && dice2 == 3) || (dice1 == 5 && dice2 == 5) || (dice1 == 6 && dice2 == 6) || (dice1 == 6 && dice2 == 5))) {

				System.out.println ("It's a tie! \n");
			}


			break;
		}

	}

}























