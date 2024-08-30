	In my game you enter classify mode or simulate by typing in "classify" or "simulate" in the command line arguments, as seen 
in my main method. While in classify mode, There is a scanner where you enter in 5 numbers or "rolls" with spaces between them, 
while also given the option to quit using the word "quit" created with a while loop.
the numbers entered are then classified using methods that I created with specific conditionals that give out a score if 
that condition is met. I use arrays to take in the numbers, and created a for loop to continuously do so. I also parse my string 
into an int. After this all occurs in my runClassify method, it is followed by  my classifyingOutcomes method with "roll" in its parameters.
This method is then followed with my runSimulate method where, you guessed it... simulation mode happens! in this mode, unlike classical mode
the user doesn’t type in numbers but there are randomly generated numbers created using random and setting a range from 1-6 for the
numbers to be generated between.This is all happening in a while loop with the variable count being less than rolls, and a for loop within that 
while loop. which is always true. I then call my classifying method because it is also being used in simulate mode. I then create a bunch of
print statements, the first two being println for the labels, and rest being printf for the frequency and  average score.did frequency through
(outcome/rolls) and multiplied by 100, and did avg score by outcomeScore/rolls. This method is then 
followed with my classifyOutcomes method which is just comprised of a bunch of if statements that compare the  methods of 
the different outcomes as greater than the variable best score. What this does is print out what outcome it is classified in 
and the users score. After all these if statements, there is another set of if statements in the same method, classifyingOutcomes, that 
checks how frequent the player receives a certain outcome. for example, if(bestType.equals("sum1's")) then increment sum1++.  
 I also increment the ___Score by bestScore in order to update the score.
 
 
 The rest of my code are just the methods for each outcome. For the 'sum of all's', I created an array and a for loop that goes through
 all the elements in the array and checks if it is the same number multiple times. There then 
 is an if statement within this loop so that if it runs into the same number, it gets incremented
 by itself. Since the sum of how many of that number is there becomes the score, I set it equal to the score.For the 'of a kinds', I use the same 
 array and go through all of the elements of the array and check if they are the same number. This is how I check if it is a ___ofAKind. If this is true,
 increment the number to itself creating the sum, which is the score.for the straights, I use the same count array, and create if statements to count 
 the numbers.My next set of if statements  create the possibilites of a small/large straight. If it is true, then the user games 40 or 30 points depending
 on if it is a small or large For full house, it is slightly different.I count through the array and created for loops with if statements to check 
 if the player meets the condition of two and three of a number. If it is true, the user gets 25 points.abstract
 
 
 I hope this is good enough I worked really hard last minute ! Especially with all of this happening it's been hard for me to get help
 but enjoy ! :)



