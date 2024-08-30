/* Name: AICHA
 * Netid: ADOUMBI2
 * Assignment: Lab 2
 * Lab section: MW 4:50
 *
 * I did not collaborate with anyone on this assignment.
 */

import java.lang.Math;
import java.util.Scanner;
import java.util.Random;
public class catapultGame {
	
	public static int bestScore = 0;
	//int remainingShots=5;
	int score = 0;
	int rounds=1;
	catapult gameCatapult;
	
	static int userJustShot = 1, userWantsToQuit= 5;



	public static void main (String [] args) {
		catapultGame Game = new catapultGame();
		Game.run();
		
	}

	public void run() { // start the game
		int chosenCommand;// whatever command user inputs
		
		gameCatapult = new catapult(); // catapult object
		System.out.println("Welcome to Catapult Game 2020!");
		System.out.print(gameCatapult);
		Scanner input = new Scanner (System.in);
		System.out.println( "\nYou have" + " " + gameCatapult.remainingShots + " " + "shots.");
		Random ran = new Random();

		
		boolean quit = false;
		while ( !quit) {
			
				System.out.print("\nEnter command: ");

				String command = input.nextLine().toLowerCase();

				chosenCommand = runCommand(command);
				
				if (chosenCommand == userJustShot){
					gameCatapult.remainingShots--; 
					System.out.println("Number of shots left:" + gameCatapult.remainingShots); 
					
				}
				
				if (chosenCommand == userWantsToQuit) { // handle quit command
					quit = true;
					System.out.println("Good game bye!");
				break;
				
				 
				 }
		}
	}	
		
		
	private int runCommand(String command) { // sentence of commands with arrays
			int ans = 0;
			String[] commandArray = command.split(" ");
			if (commandArray[0].equals("set")) {
				if (commandArray[1].equals("velocity")) {
					int vel = Integer.parseInt(commandArray[2]);
					if(vel <0 || vel > 100) {
						System.out.println("WARNING velocity, out of range, try again!");}
					else {
						gameCatapult.setVelocity(vel);
						System.out.println("You set your velocity to: " + gameCatapult.velocity);
						}}
				if (commandArray[1].equals("angle")) {
					int ang = Integer.parseInt(commandArray[2]);
					if(ang <0 || ang > 90 ) { 
						System.out.println ("WARNING launch angle, out of range, try again!");}
					else {
						gameCatapult.setAngle(ang);
						System.out.println("You set your angle to: " + gameCatapult.launchAngle);
					}
				}
				}
			if (commandArray[0].equals("cheat")){// cheat for the game using Array/switch
				switch(commandArray.length) {
				case 1: 
					System.out.println(gameCatapult.cheatInfo());
					break;
				case 2: 
					gameCatapult.remainingShots = Integer.parseInt(commandArray[1]); // convert a string to an int.
					System.out.println(gameCatapult.cheatInfo());
					System.out.println("Remaining shots:"+ gameCatapult.remainingShots);
				
					// shots should be set to what user says
					break;
				case 3: 
					gameCatapult.remainingShots= Integer.parseInt(commandArray[1]);
					gameCatapult.setQuality(Integer.parseInt(commandArray[2]));
					System.out.println(gameCatapult.cheatInfo());
					System.out.println("You set your shots:"+ gameCatapult.remainingShots);
				//shots should be set and quality by user.
					break;
				case 4: 
					gameCatapult.remainingShots= Integer.parseInt(commandArray[1]);
					gameCatapult.setQuality(Integer.parseInt(commandArray[2]));
					gameCatapult.setTargetDistance(Double.parseDouble(commandArray[3]));
					System.out.println(gameCatapult.cheatInfo());
					System.out.println("Remaining shots:"+ gameCatapult.remainingShots);
				// shots, quality, and distance should be set by user.
					break;
				default:
				}

			}
			// rounds / reset
			if(command.equals("reset")) { // if user wants to reset, go to original catapult setup
				int rounds= 1;
				System.out.println("Game reset! new round! " + " " + rounds++ );
				
				gameCatapult.initialize();
				System.out.println("Best score:" + " " + bestScore + " " +  "Score:" + " " + gameCatapult.score);
				bestScore = Math.max(bestScore, gameCatapult.score);
				
			}

			if(command.equals("fire!")) {// user can fire
				
				if(gameCatapult.remainingShots > 1) { // theyre just playing game but they still have shots
					gameCatapult.shoot();
					ans = userJustShot;
				}
				else if (gameCatapult.remainingShots ==1) { //last shot but then its zero so round over.
					gameCatapult.shoot();
					ans = userJustShot;
					System.out.println("Round complete! enter the command 'score' to see your best and current score! Reset or cheat for more shots");
					
					bestScore = Math.max(bestScore, gameCatapult.score);
				System.out.println("Best score is :" + " " + bestScore + "Score is :" + gameCatapult.score);
				
				}
				else { 
					System.out.println("Round complete! enter the command 'score' to see your best and current score! Reset"
							+ "or cheat for more shots");
					// user shouldnt be able to fire unless they hit reset or use the cheat to add more shots
				
			}}
			
			if(command.equals("score")){ // display current and best scores overall
				
				bestScore = Math.max(bestScore, gameCatapult.score);
				System.out.println("Your score is:" + " "  +  gameCatapult.score +" " + "Your best score is:" + bestScore);
			}

				

			if(command.equals("inspect")) { // describe the catapult and target
				System.out.println(gameCatapult.inspect());
				
			}
			
			if(command.equals("quit")) { // quit the game 
				quitGame(gameCatapult);
				ans = userWantsToQuit;
				

			}

			return ans;

		}
		
	
	
	
	private static void quitGame(catapult gamecatapult) { // quit the game
			
			if( bestScore < gamecatapult.score){
				bestScore =  gamecatapult.score ;

			}


		
		
	
	
	
	
	}

	}





