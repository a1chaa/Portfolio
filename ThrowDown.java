package project2;

/* Name: AICHA
 * Netid: ADOUMBI2
 * Assignment: Lab 2
 * Lab section: MW 4:50
 *
 * I did not collaborate with anyone on this assignment.
 */
 
import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class ThrowDown {
	double sum1Score=0;
	double sum2Score=0;
	double sum3Score=0;
	double sum4Score=0;
	double sum5Score=0;
	double sum6Score=0;
	double threeofKindScore=0;
	double fourofKindScore=0;
	double fiveofKindScore=0;
	double smallStraightScore=0;
	double fullHouseScore=0;
	double largeStraightScore=0;
	double sum1=0;
	double sum2=0;
	double sum3=0;
	double sum4=0;
	double sum5=0;
	double sum6=0;
	double threeofKind=0;
	double fourofKind=0;
	double fiveofKind=0;
	double smallStraight=0;
	double fullHouse=0;
	double largeStraight=0;
	String bestType;
	int bestScore=0;
	int score=0;
	String classify;
	Scanner userPlay;
	static int rolls;
	
	
	//* classify the roll according to the outcome with the highest score. In each case, the user has typed a
	//line consisting of five integers (a roll), but only the program’s output is displayed. Note
	//that the output should include the roll, the outcome label (using the table given in the
	//previous section), and the score. You must adhere to these exact formatting details in
	//order to receive full credit. The individual tokens are separated by a single space.//*
	
	
	
	// you are only asked to
	//identify outcomes and run a simulation. You are not asked to implement a playable game.
	
	
	public static void main (String args[]) {
		//throw-down object
		ThrowDown Game = new ThrowDown();
	
		
		if ( args [0].equals("classify")){
			Game.runClassify();
		}
		else if (args [0].equals("simulate")) {
			rolls = Integer.parseInt(args[1]);// user types how many rolls and rolls is a string so we changed it to an int.
			Game.runSimulate();
			
			
		}
		}		
	
	
	
	/*
	 classical mode: The user enters this mode by running the program with a single command-line argument:
“classify”. In classification mode, your program should simply read lines of input from the
user (via a Scanner and System.in and then classify the roll according to the outcome
with the highest score. Examples are provided below. In each case, the user has typed a
line consisting of five integers (a roll), but only the program’s output is displayed. Note
that the output should include the roll, the outcome label (using the table given in the
previous section), and the score. You must adhere to these exact formatting details in
order to receive full credit. The individual tokens are separated by a single space.
3 1 2 5 3 best is sum3’s with score 6
3 4 6 6 4 best is sum6’s with score 12
3 4 6 5 2 best is largeStraight with score 40
6 1 1 5 5 best is sum5’s with score 10
3 2 2 3 3 best is fullHouse with score 25
5 4 1 2 5 best is sum5’s with score 10
1 1 4 3 2 best is smallStraight with score 30
2 1 5 5 5 best is 3ofKind with score 18
1 1 1 1 5 best is 4ofKind with score 19
5 4 3 1 2 best is largeStraight with score 40
*/
	//  classify method
	
	private void runClassify() {
	System.out.println("Type in five numbers with spaces ! Type 'quit' to quit!");
	String numbers;
	Scanner userNumber = new Scanner(System.in);
	numbers=userNumber.nextLine();
	
	while (!numbers.equals("quit")) {
	int[] roll = new int[5];
	String[] rollStr = numbers.split(" ");
	
	for (int i = 0; i < rollStr.length; i++) {// i is how many times we run the loop
		String num = rollStr[i]; // temporary variable
		roll[i] = Integer.parseInt(rollStr[i]);
	}
	
	classifyingOutcomes(roll);// 
	bestScore = 0;
	System.out.println("Type in five numbers with spaces ! Type 'quit' to quit!");
	numbers=userNumber.nextLine();
	}	
	System.out.println("thanks for playing!");
	}

		 /*simulate mode : generates a number of rolls, classifies them, and calculates the frequency and average
score of each possible outcome.
Your program will enter this mode when its first command-line argument is “simulate”
followed by an integer specifying the number of times to run.
The output of your program in this mode should be a table of outcomes, frequencies, and
average scores.
	  */
	//  simulate method
	//create an array and store five random numbers
	private void runSimulate() {			
		System.out.println("Welcome to Throw Down game simulate mode!");
		
		int count=0;
		
		Random ran = new Random();
		
		while(count<rolls) {
		int[] arr = new int [5];
		for (int i=0; i<5; i++) {
		arr[i]=ran.nextInt(6)+1;// generates random number from 1-5
		}
		classifyingOutcomes(arr);
		bestScore = 0;
		count++;
		}
		// did frequency through (outcome/rolls) and multiplied by 100, and did avg score by outcomeScore/rolls.
		System.out.println("  Outcome"+ "    Frequency" + "    Avg Score" );
		System.out.println("-----------"+ " " + "------------"+" " + "------------" );
		System.out.printf("sum1's %13.2f%%" + "%13.2f%n",(sum1/rolls)*100,sum1Score/rolls);
		System.out.printf("sum2's %13.2f%%" + "%13.2f%n", (sum2/rolls)*100,sum2Score/rolls);
		System.out.printf("sum3's %13.2f%%" + "%13.2f%n", (sum3/rolls)*100, sum3Score/rolls );
		System.out.printf("sum4's %13.2f%%" + "%13.2f%n", (sum4/rolls)*100, sum4Score/rolls );
		System.out.printf("sum5's %13.2f%%" + "%13.2f%n" , (sum5/rolls)*100, sum5Score/rolls );
		System.out.printf("sum6's %13.2f%%" + "%13.2f%n" , (sum6/rolls)*100 , sum6Score/rolls );
		System.out.printf("3ofKind %12.2f%%" + "%13.2f%n" ,(threeofKind/rolls)*100, threeofKind/rolls );
		System.out.printf("4ofKind %12.2f%%" + "%13.2f%n", (fourofKind/rolls)*100, fourofKind/rolls );
		System.out.printf("5ofKind %12.2f%%" + "%13.2f%n" ,(fiveofKind/rolls)*100, fiveofKindScore/rolls );
		System.out.printf("smallStraight %6.2f%%" + "%13.2f%n" , (smallStraight/rolls)*100,smallStraightScore/rolls );
		System.out.printf("largeStraight %6.2f%%" + "%13.2f%n" ,(largeStraight/rolls)*100, largeStraightScore/rolls );
		System.out.printf("fullHouse %10.2f%%" + "%13.2f%n" , (fullHouse/rolls)*100,fullHouseScore/rolls ); 
		}
	
	private void classifyingOutcomes(int [] roll) {  // User types in a number and we get it back as a string.
		// holding best score and name of what we got best score w/.
		if(sumOfAllOnes(roll)>bestScore) {
			bestScore=sumOfAllOnes(roll);
			bestType="sum1's";
		
		}
		
		if(sumOfAllTwo(roll)>bestScore) {
			bestScore=sumOfAllTwo(roll);
			bestType="sum2's";
			
		 }
		
		if (sumOfAllThrees(roll)>bestScore) {
			bestScore=sumOfAllThrees(roll);
			bestType="sum3's";
		}
		 if (sumOfAllFours(roll)>bestScore) {
			 bestScore=sumOfAllFours(roll);
			bestType="sum4's";
		 
		 }
		 if  (sumOfAllFives(roll)>bestScore) {
				
			
			bestScore=sumOfAllFives(roll);
			bestType=  "sum5's";
			}
			
			
		 if (sumOfAllSixes(roll)>bestScore){
			bestScore=sumOfAllSixes(roll);
			bestType="sum6's";
		 }
		 if (threeOfAKind(roll)>bestScore) {
			bestScore=threeOfAKind(roll);
			bestType="3ofKind";
		 }
		 if (fourOfAKind(roll)>bestScore) {
			bestScore=fourOfAKind(roll);
			bestType="4ofKind";
		 }
		 if (fiveOfAKind(roll)>bestScore) {
			bestScore=fiveOfAKind(roll);
			bestType="5ofKind";
		 }
		 if (largeStraight(roll)>bestScore) {
			bestScore=largeStraight(roll);
			bestType="large straight";
		     
		 }
		 if (smallStraight(roll)>bestScore) {
			bestScore=smallStraight(roll);
			bestType="small straight";
		 }
		
		
		 if (fullHouse(roll)>bestScore) {
			bestScore=fullHouse(roll);
			bestType="full House";
		 }
		 // checking frequency by incrementing how many times the user gets an outcome. 
		 
		if(bestType.equals("small straight")) { 
		 smallStraight++;
		 smallStraightScore += bestScore;
		}
		if(bestType.equals("large straight")) {
			largeStraight++;
		largeStraightScore+= bestScore;
		}
		if(bestType.equals("5ofKind")) {
			fiveofKind++;
		fiveofKindScore+= bestScore;
		}
		if(bestType.equals("full house")) {
			fullHouse++;
		fullHouseScore+= bestScore;
		}
		if(bestType.equals("4ofKind")) {
			fourofKind++;
			fourofKindScore+= bestScore;
		}
		if(bestType.equals("3ofKind")) {
			threeofKind++;
			threeofKindScore+= bestScore;
		}
		if(bestType.equals("sum6's")) {
			sum6++;
		sum6Score+= bestScore;
		}
		if(bestType.equals("sum5's")) {
			sum5++;	
			sum5Score+= bestScore;
		}
		if(bestType.equals("sum4's")) {
			sum4++;
			sum4Score+= bestScore;
		}
		if(bestType.equals("sum3's")) {
			sum3++;
			sum3Score+= bestScore;
		}
		
		if(bestType.equals("sum2's")) {
			sum2++;
			sum6Score+= bestScore;
		}
		if(bestType.equals("sum1's")) {
			sum1++;
			sum1Score+= bestScore;
		}
		System.out.println((Arrays.toString(roll)) + " best is "+ bestType  + " with best score " + bestScore );// to print out rolls and best with score.
		
		

		
		}
	
	                                                         //   0  1   2  3 
				// sum of all...                                     x  x  x  x
			
	public int sumOfAllOnes(int[] arr){ // arr is the whole { 1, 2, 3, 4} list and x is the element in the arr.
				int sumOfAllOnes = 0;
				
				for(int x : arr) { // For every integer in arr, test if its a 1, increment it one at a time.
					if(x == 1) {
						sumOfAllOnes += 1;
						score= sumOfAllOnes;
						
					}
					
				}
				
				return score;
			}


			public int sumOfAllTwo(int[] arr){ 
				int sumOfAllTwos = 0;
				for(int x : arr ) { 
					if(x == 2) {
						sumOfAllTwos += 2;
						score=sumOfAllTwos;
						
					}
				}
				
				return score;
			}

			
			public int sumOfAllThrees(int[] arr){ 
				int sumOfAllThrees = 0;
				for(int x : arr ) { 
					if(x == 3) {
						sumOfAllThrees += 3;
						score=sumOfAllThrees;
					
					}
				}

				return score;
				
			}


			public int sumOfAllFours(int[] arr){ 
				int sumOfAllFours = 0;
				for(int x : arr ) { 
					if(x == 4) {
						sumOfAllFours += 4;
						score=sumOfAllFours;
						
					}
				}
				return score;		
			}


			public int sumOfAllFives(int[] arr){ // score is based sum of  fives
				int sumOfAllFives = 0;
				for(int x : arr ) { 
					if(x == 5) {
						sumOfAllFives += 5;
						score=sumOfAllFives;
						
					}
				}
				return score;
			}


			public int sumOfAllSixes(int[] arr){ 
				int sumOfAllSixes = 0;
				for(int x : arr ) { 
					if(x == 6) {
						sumOfAllSixes += 6;
						score=sumOfAllSixes;
						
					}
				}
				return score;
					
					
					}


			// ...of a kind	
			
			
			public int threeOfAKind (int [] arr) { // the sum of all dice
				int [] count = new int [6];
				for (int z : arr) {
				
				count[z-1]++;
				}
				
				for(int z : count){
					
					if(z==3) {
						int sum=0;
						for(int x : arr ) { 
							
							
						sum = sum + x ;
							score= sum;
					}
					}
				
			}
				return score;
			}


			
			
			public int fourOfAKind (int [] arr) { // sum of all dice + 10
				int [] count = new int [6];
				for (int z : arr) {
				
				count[z-1]++;
				}
				
				for(int z : count){
					
					if(z==4) {
						int sum=0;
						for(int x : arr ) { 
							
							sum = sum + x ;
							}
							score= sum + 10;	
					}
					
						
					}
				
					
					
					return score;
}	
			
				
	
			
					
					
			public int fiveOfAKind (int [] arr) {// sum of all dice + 50
				int [] count = new int [6];
				for (int z : arr) {
				
				count[z-1]++;
				}
				
				for(int z : count){ 
					
					if(z==5) {
						int sum=0;
						for(int x : arr ) { 
							sum +=x;
							sum = sum + x ;
							
							}
							
							score= sum + 50;
					}
					
						}
				
					
					
					return score;
					
			}

			
			
			//a small straight is 4 consecutive faces, and a large straight is 5 consecutive faces. 
			public int largeStraight(int [] arr) { // calculate the scores in the straight's and returns the score.
				int [] count = new int [6];// count array
				
				for (int z : arr) { // use count to identify if its small or large straight
					
					if (z==1) {
				count[z-1]++;
				
				}
					else if (z==2) {
						count[z-1]++;
				
				
				}
					else if (z==3) {
						count[z-1]++;
					
				
				}
					else if (z==4) {
						count[z-1]++;
				
				
				}
					else if (z==5) {
						count[z-1]++;
				
					}
					else if (z==6) {
						count[z-1]++;
				
					}
				}
			
				if (count[0] == 1 && count[1] == 1 && count[2] == 1 && count[3] == 1 && count[4] == 1) { // if array contains 1,2,3,4,5 or 2,3,4,5,6
					score=40;
				}
				else if (count[1]==1 && count[2]==1 && count[3]==1 && count[4]==1 && count [5]==1 ) {// large straight
					score= 40;
				}
			return score;
			}
			
			
			public int smallStraight (int [] arr) {
			int [] count = new int [6];// count array
			
			for (int z : arr) { // use count to identify if its small or large straight
				
				if (z==1) {
			count[z-1]++;
			
			}
				else if (z==2) {
					count[z-1]++;
			
			
			}
				else if (z==3) {
					count[z-1]++;
				
			
			}
				else if (z==4) {
					count[z-1]++;
			
			
			}
				else if (z==5) {
					count[z-1]++;
			
				}
				else if (z==6) {
					count[z-1]++;
			
				}
			}
				 if (count[0] >= 1 && count[1] >= 1 && count[2] >= 1 && count[3] >= 1 ) { // small straight.1,2,3,4 or  or 2,3,4,5 or  3,4,5,6 checking if multiple's of numbers
					score= 30; 
				}
				
				else if (count[1] >= 1 && count[2] >= 1 && count[3] >= 1 && count[4] >= 1 ) {
					score= 30;
				}
				else if (count[2] >= 1 && count[3] >= 1 && count[4] >= 1 && count[5] >= 1) {
				score=30;
			}
				return score;
			}	

				
				
			
// means 3 numbers are the same and the other two remaining numbers are the same. ex. sorted, 3,3,3,2,2,4,4,4,1,1,5,5,5,3,3. if any number has 3 or two occurances.
			public int fullHouse (int [] arr) {
				//use count array to keep track of how many times number occurs
				int [] count = new int [6];
				for (int z : arr) { // use count to identify if its small or large straight
						if (z==1) {
					count[z-1]++;
					
					}
						else if (z==2) {
							count[z-1]++;
					
					
					}
						else if (z==3) {
							count[z-1]++;
						
					
					}
						else if (z==4) {
							count[z-1]++;
					
					
					}
						else if (z==5) {
							count[z-1]++;
					
						}
						else if (z==6) {
							count[z-1]++;
					
						}
						 
				}
				for(int z : count) {// bc we are iterating the numbers in the count array.
				if(z==2) {
			 
				for(int x : count) {
				if(x==3){
					score=25;
				}
				
				
				
				}	
				
			
			}
		}
				return score;
	}
			
}


		
	

		


			 


