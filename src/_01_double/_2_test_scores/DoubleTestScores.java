package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class DoubleTestScores {

	public static void main(String[] args) {
		String scoreString = JOptionPane.showInputDialog("What is your score on the test?");
		double score = Double.parseDouble(scoreString);
		if(score > 90) {
			JOptionPane.showMessageDialog(null, "Wow! You must have studied really hard for that test!");
		}else if(score > 80) {
			JOptionPane.showMessageDialog(null, "You did great!");
		}else if(score > 60) {
			JOptionPane.showMessageDialog(null, "You could of done better.");
		}else {
			JOptionPane.showMessageDialog(null, "What a shame. :(");
		}
		
	}

}
