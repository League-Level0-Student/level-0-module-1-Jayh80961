package _03_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class Remarkable {
	public static void main(String[] args) {

		// 1. Save something remarkable about each person in a variable.
	
		// 2. Ask the user to enter a name. Store their answer in a variable.
		String answer = JOptionPane.showInputDialog("Type out a name between Bob, Jeff, Boberyjefferson, or Bob the builder");
		// 3. In a pop-up, tell the user what is remarkable about that person. 
		if (answer.equals("Bob")) { 
			JOptionPane.showMessageDialog(null, "Bob is very smart");
		}
		else if (answer.equals("Jeff")) { 
			JOptionPane.showMessageDialog(null, "Jeff is very very tall");
		}
		else if (answer.equals("Boberyjefferson")) { 
			JOptionPane.showMessageDialog(null, "Boberyjefferson is very short");
		}
		else if (answer.equals("Bob the builder")) { 
			JOptionPane.showMessageDialog(null, "Bob the builder is very big");
		
		}
		else {
			JOptionPane.showMessageDialog(null, "You typed the name wrong");
		}
	}
}