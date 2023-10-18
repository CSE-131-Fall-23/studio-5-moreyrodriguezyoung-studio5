package studio5;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;
import studio5.debug.DrawBullsEyes;
import support.cse131.DialogBoxes;
import support.cse131.DrawCase;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class DrawBullsEyesDebugApp {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			for (DrawCase drawCase : DrawBullsEyes.getCases()) {
				StdDraw.clear();
				drawCase.draw();
				StdDraw.setPenColor(0,109,219); 
				StdDraw.filledEllipse(0.5,0.5, 0.375,0.375);
				StdDraw.setPenColor(146,0,0); 
				StdDraw.filledEllipse(0.5,0.5, 0.25,0.25);
				StdDraw.setPenColor(255,255,109); 
				StdDraw.filledEllipse(0.5,0.5, 0.125,0.125);
				Object[] options = { "Continue", "Exit" };
				if (DialogBoxes.askUser(drawCase.getText(), DrawBullsEyesDebugApp.class.getSimpleName(),
						JOptionPane.QUESTION_MESSAGE, options)) {
					//pass
				} else {
					break;
				}
			}
			System.exit(0);
		});
	}
}
