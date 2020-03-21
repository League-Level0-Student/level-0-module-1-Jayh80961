package _07_riddler;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0; 
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String bob = JOptionPane.showInputDialog("What is greater than God,\r\n" + 
				"more evil than the devil,\r\n" + 
				"the poor have it,\r\n" + 
				"the rich need it,\r\n" + 
				"and if you eat it, you'll die?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
		if(bob.equals("nothing")) {
			System.out.println("Your correct!");
			score = score + 1;
		}
		// 5. Otherwise, say "wrong" and tell them the answer
		else { 
			System.out.println("YOUR WRONG!!!");
		}
		// 6. Add some more riddles
		String med = JOptionPane.showInputDialog("What can travel around the world while staying in a corner?");
		
		if(med.equals("stamp")) {
			System.out.println("Your correct!");	
			score = score + 1;
		}
		else { 
			System.out.println("YOUR WRONG!!!");
		}
		
String jfe = JOptionPane.showInputDialog("There was a green house. Inside the green house there was a white house." + 
		"Inside the white house there was a red house. Inside the red house there were lots of babies. What is it?");
		
		if(jfe.equals("watermelon")) {
			System.out.println("Your correct!");	
			score = score + 1;
		}
		else { 
			System.out.println("YOUR WRONG!!!");
		}
		// 2. Make a pop up to show the score.
     	JOptionPane.showMessageDialog(null, score + " points!");
		}
	}

