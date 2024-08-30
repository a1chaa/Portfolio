package projct3;

/* Name: AICHA
* Netid: ADOUMBI2
* Assignment: Lab 2
* Lab section: MW 4:50
*
* I did not collaborate with anyone on this assignment.
*/
import java.awt.Toolkit;

import java.awt.Graphics;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

import java.awt.Dimension;

public class TicTacGame extends JPanel  {



 // 1 represents x
 // 2 represents o
	
	boolean firstPlayer;
	int winner=-1;
	  
//2d rep of game
	
	int [] [] board= new int [3] [3];
	 int x;
	 int y;
	 
	 // win and draw counter
	 int oneWins=0;
	 int twoWins=0;
	 int draw;
	 
	 // create labels and button
	
	 JLabel turn= new  JLabel();
	 JButton restart = new JButton("RESTART");
	 
	
     
     
     public static void main(String[]args) {
			JFrame f = new JFrame (" TIC TAC TOE");
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			Dimension max=Toolkit.getDefaultToolkit().getScreenSize();
			f.setMaximumSize(max);
	
			f.setExtendedState(JFrame.MAXIMIZED_BOTH);
			f.getContentPane().add(new TicTacGame());
			f.pack();
			f.setVisible(true);
	}

	 
	 
	  // intitalizing values
	 public TicTacGame () { // CONSTUCTOR
		 setBackground(Color.black);
		 setPreferredSize(Toolkit.getDefaultToolkit().getScreenSize());
		 
		 oneWins=0;
		 twoWins=0;
		 draw=0;
		 firstPlayer=true;
		 
		// add label,texts and buttons to panel. Changing fonts and color.
		
		 addMouseListener(new Listener());
		add(restart);
		add(turn);
		turn.setFont(new Font("Verdana", Font.BOLD, 22));
		     
		     
		     
			
		restart.setFont(new Font("Verdana", Font.BOLD, 20));
		restart.setPreferredSize(new Dimension(130,70));
		restart.setForeground(Color.black);
		   
		     
		     
		     
		     
	  //button starts game over
		
		restart.addActionListener(new ActionListener() {
			
		public void actionPerformed(ActionEvent e) {
				
				repaint();
				reset();
		
		}
			}
		);
	 
	 }
	 
		
	 // drawings and graphics
		public void paintComponent(Graphics g) {
		// varaibles to scale and reposition game	
		int a=5;
		int b=5;
		int width=5;
		int height=300;
		int xpos=490;
		int ypos=218;
				
		super.paintComponent(g);// To update and call
			
		// if statement to change label turn 
		if(firstPlayer== true) {
				turn.setText("Player 1's turn");
				turn.setForeground(Color.red);
				turn.setBounds(400, -30,300,300);// placement and size of characters.
			
		
			}else {
				turn.setText("Player 2's turn");
				turn.setForeground(Color.blue);
				turn.setBounds(740, -30,300,300);
			}	
			
		// create game board using drawrect
			g.setColor(Color.white);
			
			//verticle lines
			g.fillRoundRect(xpos+100, 220, width,height, a, b);
			g.fillRoundRect(xpos+200, 220, width,height, a, b);
			
			// horizontal
			g.fillRoundRect(xpos, ypos+100, height,width, a, b);
			g.fillRoundRect(xpos, ypos+200, height,width, a, b);
			
			// convert data from array into actual visual game.
			 for(int i=0;i<board.length;i++){
			      for(int j=0;j<board.length;j++){
			      
			    	  if(board[i][j]==1){   // "1" represents x 
			        	g.setColor(Color.red);
			          
			     int [] m = {xpos + 20 + 100 * i,xpos + 30 + 100 * i,xpos + 50 + 100 * i,xpos + 70 + 100 * i,xpos + 80 + 100 * i,
			          xpos + 60 + 100 * i,xpos + 80 + 100 * i,xpos + 70 + 100 * i,xpos + 50 + 100 * i,xpos + 30 + 100 * i,xpos + 20 + 100 * i,
			          xpos + 40 + 100 * i,};
			     int [] n = {245 + 100 * j,245 + 100 * j,265 + 100 * j,245 + 100 * j,245 + 100 * j,
			          270 + 100 * j,295 + 100 * j,295 + 100 * j,275 + 100 * j,295 + 100 * j,295 + 100 * j,
			          270 + 100 * j};
			          g.fillPolygon(m, n, 12);
			          
			        }
			  else if(board[i][j]==2){   // "2" represents o 
			               
			          //draws O - using drawOval()
			          g.setColor(Color.blue);
			          g.fillOval(xpos + 20 + 100 * i,240 + 100 * j,60,50);
			          g.setColor(Color.black);
			          g.fillOval(xpos + 25 + 100 * i,243 + 100 * j,50,40);
			          g.setColor(Color.blue);
			          g.drawOval(xpos + 25 + 100 * i,243 + 100 * j,50,40);
			        }
		}
			}
		
			 // announce winner and draws.
			if (win()==1) {
				g.setFont(new Font("Verdana", Font.BOLD, 50));
				g.setColor(Color.red);
				g.drawString("PLAYER 1 WINS!!", 440,600);
				
				g.setColor(Color.white);
				g.drawString("GAME OVER",500,700);
				
			}
		else if(win()==2) {
			g.setFont(new Font("Verdana", Font.BOLD, 50));
			g.setColor(Color.BLUE);
			g.drawString("PLAYER 2 WINS!!", 440,600);
			
			g.setColor(Color.white);
			g.drawString("GAME OVER",500,700);
			
		}
		else if(draw()==true) {
				g.setColor(Color.magenta);
				g.setFont(new Font("Verdana", Font.BOLD, 50));
				g.drawString("DRAW!! REMATCH?", 440,600);
				
				g.setColor(Color.white);
				g.drawString("GAME OVER",500,700);
				
		}
			
			/////Display scores
			
			//firstPlayer 1 score
			g.setColor(Color.red);
			g.setFont(new Font("Verdana", Font.BOLD, 22));
			g.drawString("Player 1 ", 300,300);
			g.drawString("has " + oneWins + " win(s)", 275,400);
			
			//firstPlayer 2
			g.setColor(Color.blue);
			g.drawString("Player 2 ", 900,300);
			g.drawString("has "+ twoWins + " win(s) ", 875,400);
			
			// draws
			g.setFont(new Font("Verdana", Font.BOLD, 22));
			g.setColor(Color.magenta);
			g.drawString("Draws "+ draw, 615, 150);
			
			// O
			x=0;
			y=0;
			xpos=900;
			ypos=315;
			// draws O figure using draws Oval.
			g.setColor(Color.blue);
			g.fillOval(xpos+ 20 +100 * x,ypos-3 + 100 * y, 60, 50);
			g.setColor(Color.black);
			g.fillOval(xpos + 25 + 100 * x,ypos + 100 * y,50,40);
			g.setColor(Color.black);
			g.fillOval(xpos + 25 + 100 * x,ypos + 100 * y,50,40);
		
			//draws X figure
		     x=0;
		     y=0;
		     xpos=300;
		     ypos=320;
		     g.setColor(Color.red);
		     int [] m = {xpos + 20 + 100 * x,xpos + 30 + 100 * x,xpos + 50 + 100 * x,xpos + 70 + 100 * x,xpos + 80 + 100 * x,
		          xpos + 60 + 100 * x,xpos + 80 + 100 * x,xpos + 70 + 100 * x,xpos + 50 + 100 * x,xpos + 30 + 100 * x,xpos + 20 + 100 * x,
		          xpos + 40 + 100 * x,};
		      int [] n = {ypos + 100 * y,ypos+ 100 * y,ypos+20 + 100 * y,ypos + 100 * y,ypos + 100 * y,
		          ypos+25 + 100 * y,ypos+50 + 100 * y,ypos+50 + 100 * y,ypos+30 + 100 * y,ypos+50 + 100 * y,ypos+50 + 100 * y,
		          ypos+25 + 100 * y};
		     g.fillPolygon(m, n, 12);
			}
		
		public void reset () {
		for(int i=0; i<board.length; i++) {
			for(int j=0;j<board.length;j++) {
		board [i][j]=0;
		}
			}
		 winner=-1;
		firstPlayer=true;
		
		}
			
	// checking to see if draws by going through board array and seeing if it is completed.
  public boolean draw() {
	  	
	  boolean completed=true;
		for(int i=0; i<board.length;i++) {
			for(int j=0; j<board.length;j++) {
			if(board [i] [j]==0) {// checks for empty spaces, if theres none , then another player can play.
			completed= false;
			
		}
			}
		}
		if (completed== false) {
			
		}
		else if(completed==true) {// its a draw
			
		}
		return completed;
		}	
		
  	//check for wins
  
  public int win(){
	  	
	
	  
	  
	 
	  
		     
	  /*
	  for(int i=0;i<board.length;i++){
	    for(int j=0;j<board.length;j++){
	    	
	    	if(board[i][j]==1) {
	    int a = board[i][j];
	    int b = board[i][j];
	    int c = board[i][j];
	      if((a == b) && (b == c)){
	    	  winner = a;
	     
	    	  System.out.println("!!!i= " +i + " j= " + j);
		        System.out.println("!!!a= " +a +  " b= " + c+  " c= " + c);
	      }
	    	}
	      
	   else if(board[i][j]==2) {
	   int  a = board[i][j];
	   int  b = board[i][j];
	   int 	c = board[i][j];
	      
	      if((a == b) && (b == c)){
	    	  winner = a;
	     
	        System.out.println("i= " +i + " j= " + j);
	        System.out.println("a= " +a + "  b=  " + b+ " c= " + c);
	      }
	    }
	  	
	    }
	  }
	   */ 
	   
	  
	  
	// if a b & c = 1 then x is winner .if  =2 then o is winner.
	  	
		
		 // If a==b && b==c then thats how we know it is three in a row.
		 
	  int winner =-1;
	   
	  
	  for(int j=0;j<board.length;j++){
	      int a = board[j][0];
	      int b = board[j][1];
	      int c = board[j][2];
	      if((a == b) && (b == c)){
	        winner = a;
	      // System.out.println("j" +j);
	      }
	    }
	 
	    //check hotizontal
	    for(int i=0;i<board.length;i++){
	      int a = board[0][i];
	      int b = board[1][i];
	      int c = board[2][i];
	      if((a == b) && (b == c)){
	        winner = a;
	      //  System.out.println("i" +i);
	      }
	    }
	  
	  
		  //check \ diagonal
	     int  a = board[0][0];
	     int  b = board[1][1];
	     int  c = board[2][2];
	      if((a == b) && (b == c)){
	       winner = a;
	     
	      }
	      
	       
	      
	      
	      
	      //check / diagonal
	       a = board[0][2];
	       b = board[1][1];
	       c = board[2][0];
	       if((a == b) && (b == c)){
	       winner = a;  
			}
			
	    //   if (winner==1 || winner==2) {
	    	//   repaint();
	    	   
	      // }
	       return winner;
			
  			}
 
		private class Listener implements MouseListener{
				// mouse events
		@Override
		public void mouseClicked(MouseEvent e) {
			win();
			if (win()>0) { //since winner is -1 then there is no winner
				
			}
		else{
	        
	        //get x and y mouse positon
	        int a = e.getX();
	        int b = e.getY();
	        
	        
	      // get user to click within the board
	        if((a<500) || (b<200)){   //out of bounds
	          repaint();
	        }else if((a>780) || (b>510)){ //out of bounds
	          repaint();
	        }else{if(a>500 && a<580){
	          x=0;
	        }else if(a>600 && a<680){
	          x=1;
	        }else if(a>700 && a<780){
	          x=2;
	        }
	        if(b>225 && b<310){
	          y=0;
	        }else if(b>325 && b<410){
	          y=1;
	        }else if(b>425 && b<510){
	          y=2;
	        }
	        if(board[x][y]== 1 || board[x][y]==2){  //space filled - must play somewhere else
	              repaint();
		        }else{
	            if(firstPlayer == true){ //x turn - draw an X
	              board[x][y]= 1;
	            }else if(firstPlayer == false){ //o turn - draw an O
	              board[x][y]=2;
	            }
	          }
	          
	        
	        }   
	        // increment wins/draws 
		
			if(win()==1) {
				
				
				oneWins++;
				
			}
			else if (win()==2) {
				
				
				twoWins++;
				
			}
			else if(draw()==true) {
				
				
				draw++;
				
			}
			//switch who's turn it is
	          if(firstPlayer == true){ 
	            
	            firstPlayer=!firstPlayer;
	          }else{
	            
	            firstPlayer=!firstPlayer;
	          }
	        //update the game
	        repaint();
	        
	      }
	    } 
	  

				@Override
				public void mousePressed(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void mouseReleased(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void mouseEntered(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void mouseExited(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
		}		
		
				
}
		

		

		
		
		
		

		

	 
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
