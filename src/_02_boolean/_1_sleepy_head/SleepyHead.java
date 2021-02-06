package _02_boolean._1_sleepy_head;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class SleepyHead {

	public static void main(String[] args) {

		// boolean variables can only hold one of two values - true or false

		/************************  SLEEPY HEAD  **************************/
		boolean isWeekend = false;
		// Write code to ask the user what day it is.
        String str1 = JOptionPane.showInputDialog("What day is it?");
		// Set the boolean isWeekend based on the value they enter
		if(str1.equalsIgnoreCase("saturday") || str1.equalsIgnoreCase("sunday")) {
			isWeekend = true;
		}
		
		// If it is the weekend, tell the user they get to sleep in.
		if(isWeekend) {
			JOptionPane.showMessageDialog(null, "You can get to sleep in.");
		}else {
			JOptionPane.showMessageDialog(null, "get out of bed and go to school!");
		}
		// If it is not the weekend, tell them to get out of bed and go to school!
		
		
		/************************   STAR STUDENT  **************************/

		boolean passedExam = false;
		// Write code to ask the user what percentage they scored in their last exam
		String scoreString = JOptionPane.showInputDialog("What is your score on the test?");
		double score = Double.parseDouble(scoreString);
		
		// If they scored more than 70, they passed the exam.
		if(score > 70) {
		// Set the boolean passedExam based on their score.
			passedExam = true;
		}
		// If the user passed the exam, congratulate them
		if(passedExam) {
			JOptionPane.showMessageDialog(null, "Congratulations!");
		}else {
			JOptionPane.showMessageDialog(null, "Better luck next time!");
		}
		// otherwise, wish them better luck next time.
		
		
		/************************  GAME OVER  **************************/

		boolean gameIsOver = false;
		// This code will repeat until gameIsOver is changed to true
		while (!gameIsOver) {
			// Ask the user if the game is over. 
			String gameOver = JOptionPane.showInputDialog("is game over");
			// If they answer "yes", change gameIsOver to true
			if (gameOver.equalsIgnoreCase("yes"))
				gameIsOver = true;
		}
		// Tell the user "game is over"
		JOptionPane.showMessageDialog(null, "Game is over");
		
		
		
		/***********************   RED SQUARE  ********************/
		
		boolean isRed = false;
		// Ask the user what color to draw with. Based on their answer, set the isRed variable
		String userRed = JOptionPane.showInputDialog("What color to draw with");
		if(userRed.equalsIgnoreCase("red")) {
			isRed = true;
		}
		
		boolean isSquare = false;		
		// Now ask the user what shape to draw. Based on their answer, set the isSquare variable
		String userShape = JOptionPane.showInputDialog("What shape to draw");
		if(userShape.equalsIgnoreCase("square")) {
			isSquare = true;
		} 
		
		// Now you MUST use the && operator to join the booleans for this code. 
		// Ask your teacher if you are not sure how		
		
		// Use an if statement to ONLY draw a red square when it has been requested (use the method below)
		// otherwise, tell the user you don't know how to draw that shape
		if(isRed && isSquare) {
			drawRedSquare();
		}else {
			JOptionPane.showMessageDialog(null, "I don't know how to draw that shape.");
		}
		

	}

	
	static void drawRedSquare() {
		Robot rob = new Robot();
		rob.setPenColor(255, 0, 0);
		rob.setSpeed(50);
		for(int i = 0; i < 4; i++) {
			rob.penDown();
			rob.move(100);
			rob.turn(90);;
		}
	}	
}
