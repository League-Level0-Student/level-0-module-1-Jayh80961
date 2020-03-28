package _02_unbirthday;

import javax.swing.JOptionPane;

public class Unbirthday {
	public static void main(String[] args) {
		String birthday = JOptionPane.showInputDialog("When is your birthday??? Please answer in mm/dd");
		if (birthday.equals("03/07")) {
			JOptionPane.showMessageDialog(null, "Happy birthday!!!");

		} else {
			JOptionPane.showMessageDialog(null, "Very merry UNbirthday");
		}
	}
}
