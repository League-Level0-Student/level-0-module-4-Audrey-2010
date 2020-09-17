package _01_double._1_change_calculator;

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain.
 */

public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
		String nickles=JOptionPane.showInputDialog("How many nickles do you have?");
		// Convert their answer to an int.   Hint: Integer.parseInt()  
		int nicklesint = Integer.parseInt(nickles);
		// Ask the user how many dimes they have, and convert their answer
String dimes=JOptionPane.showInputDialog("How many dimes you you have?");
int dimesint = Integer.parseInt(dimes);
		// Ask the user how many quarters they have, and convert their answer
String quarters=JOptionPane.showInputDialog("How many quarters do you have?");
int quartersint = Integer.parseInt(quarters);
		// Calculate how much money the user has.  Hint: Use a double variable 
double money=nicklesint*.05+dimesint*.10+quartersint*0.25;
		// Tell the user how much money they have in dollars and cents format (e.g. $6.75)
JOptionPane.showMessageDialog(null,"You have $"+money);
	}
}

