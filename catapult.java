

/* Name: AICHA
 * Netid: ADOUMBI2
 * Assignment: Lab 2
 * Lab section: MW 4:50
 *
 * I did not collaborate with anyone on this assignment.
 */



import java.lang.Math;
import java.util.Random;

	public class catapult {
	
	public double velocity;
	int quality;
	public int score = 0;
	public double launchAngle;
	double targetDistance;
	double difference = Double.MAX_VALUE;
	public int remainingShots=5;
	String targetString;
	String qualityString;
	String warningString;
	Random ran = new Random();
	

	public double randomInRange(int min, int max) { // creating the range
		double range = ran.nextDouble() * (max - min) + min;
		return range;
	}

	public catapult() { //catapult constructor

	
		launchAngle = 45;

		quality = 1+ran.nextInt(10);

		targetDistance =  randomInRange(50, 1000);

		velocity = 50;
		
	}
	
	
	public void initialize() {//initialize catapult values
		
		remainingShots= 5;
		System.out.println("Welcome to Catapult Game 2020!");
		
		launchAngle = 45;
		System.out.println("Your launch angle is: " + launchAngle);
		
		quality = 1+ran.nextInt(10);
		System.out.println(qualityString);
		
		targetDistance =  randomInRange(50, 1000);

		velocity = 50;
		System.out.println("Your velocity is: " + velocity);
		
		score = 0;
		System.out.println("");
		
		
		System.out.println("Number of shots "+ remainingShots);
		
	
	}

	public String qualityString() { // this makes the quality print out its  string  of how good of a quality it is.
		if (quality <= 2) {
			qualityString = "Your quality is very bad";
		}
		else if (quality <= 4) {
			qualityString = "The quality of your catapult is below average";
		}
		else if (quality == 5) {
			qualityString = "The quality of your catapult is average";
		}
		else if (quality <= 8){
			qualityString = "The quality of your catapult is above average";
		}
		else if (quality <= 10){
			qualityString = "The quality of your catapult is very gooood!";	
		}
		return qualityString;
	}

	public String targetString() { // target string
		if(targetDistance <= 300) {
			targetString = "Your target is at a close range";
		}
		else if(targetDistance <= 500) {
			targetString = "Your target is midrange";

		}
		else if (targetDistance >= 700) {
			targetString =  "Your target is at a far range";
		}
		else if (targetDistance <= 1000 ) {
			targetString = "Your target is at the furthest range";

		}
		return targetString;
	}
	// PRINT WARNING IF ITS OUT OF RANGE
			public String warningString () { // should display warning if user input is out of range
			
				if(this.launchAngle<0 || this.launchAngle>90 ) { 
				warningString= "WARNING launch angle, out of range, try again!";
			}
			else if (this.targetDistance < 50 || this.targetDistance > 1000 ) {
				warningString = "WARNING target Distance, out of range, try again!";
			}
			else if (this.quality < 1 || this.quality > 10) {
				warningString = "WARNING quality, out of range, try again!";
			}
			else if (this.velocity < 0 || this.velocity > 100){
				warningString = "WARNING velocity, out of range, try again!";
				
			}
			return warningString;
			}

	public void setTargetDistance (double targetDistance ) {
		this.targetDistance= targetDistance;
	}

	public void setQuality (int quality) {
		this.quality = quality;
	}
	public void setAngle (double launchAngle) {
		this.launchAngle = launchAngle; // this.launchAngle means whatever user inputs equals the variable launch angle.
	}

	public void setVelocity (double velocity) {
		this.velocity = velocity;
	}
	// this method  shows the difference btwn where the catapult lands and where the actual target is when catapult shoots.
	public void shoot() {
		double realVelocity = velocity + (10-quality)* ran.nextGaussian();
		double realAngle = launchAngle + (10-quality)* ran.nextGaussian();
		double x = realVelocity*realVelocity*Math.sin(2*realAngle)/9.8;
		difference = targetDistance - x;
		if (difference <= 2 ) {
			String msg = "Perfect hit!";
			score = score+10;
			System.out.println(msg);
		} else if ( difference  < 5) {
			String msg = "Good hit";
			System.out.println(msg);
			score= score+7;
		} else if (difference < 10) {
			String msg = " Hit!";
			score=score+3;
			System.out.println(msg);
		}
		else {
			if (difference <= 200) {
				String msg="you missed-- you're a bit far";
				System.out.println(msg);
			}
			else if (difference <=400) {
				String msg=" you missed-- your're really far";
				System.out.println(msg);

			}
			else if( difference <= 600) {
				String msg = "You missed-- you're really really far";
				System.out.println(msg);

			}
			else if(difference <=800) {
				String msg = "You missed -- you're really really really far";
				System.out.println(msg);

			}
			else if (difference <= 999) {
				String msg = "You missed -- you're really really really really far";
				System.out.println(msg);

			}
			else if (difference >= 1000) {
				String msg = "You missed -- you're beyond your target";
				System.out.println(msg);
			}
		}




	}
	
	public String inspect () {// inspect method
		return ("Inspect: \n"+ qualityString + "\n"+ targetString + "\n" + "Your angle is: " +launchAngle+" velocity is: "+ velocity);	
		


		
		
		
	}
		
		
		// Cheat method for info from the cheat
	public String cheatInfo() {
		return " Your quality: " +quality+ "\nYour target Distance: "+targetDistance;
		
	}

	public String toString() { // Description of catapult quality , distance, launch angle and velocity

		String ans = "";


		ans = "Velocity: " + velocity;
		ans = ans + "\n";
		ans = ans +  "Launch Angle: " + launchAngle;
		ans = ans + "\n";
		ans = ans +"Quality: " + this.qualityString();
		ans = ans + "\n";
		ans = ans +  "Distance: " + this.targetString();
		
		return ans;

	}
}
