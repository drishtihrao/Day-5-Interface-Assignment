package com.cg.basicinheritance.game;
/*
 * This class implements method defined in game interface
 * Each class implementing the Game interface overrides the method play
 * The output received depends upon the class used to call the method
 * This program exhibits an example of polymorphism
 */
public class GameDemo {
	// defining a method perform with a reference to interface Game
	public static void perform(Game game) {
		game.play();
	}

	public static void main(String args[]) {
		// creating an object of class cricket
		Game cricket = new Cricket();
		
		// the perform method should invoke the play method of respective classes
		perform(cricket);

		Game football = new Football();
		perform(football);

		Game tennis = new Tennis();
		perform(tennis);
	}
}
