import javax.swing.JOptionPane;

public class TestScores {
public static void main(String[] args) {
	String testscores=JOptionPane.showInputDialog(null,"What did you get for your test?");
	double doubletestscores = Double.parseDouble(testscores);
	 if (doubletestscores>75) {
		 JOptionPane.showMessageDialog(null,"Wow! You did a really great job. You must have studied a lot. Congrats!");
	 }
	 else if (doubletestscores>50) {
		 JOptionPane.showMessageDialog(null,"It's OK I guess, but study harder next time.");
	 }
	 else if (doubletestscores>25) {
	JOptionPane.showMessageDialog(null,"Do you know that your parents are going to see this?");
}
	 else  {
	
	JOptionPane.showMessageDialog(null, "Yikes! Um...OK...did you study...your parents are going to be very mad..at least I got 86...");
}
}
}
