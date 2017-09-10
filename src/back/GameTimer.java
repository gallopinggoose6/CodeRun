package back;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import front.output.Frame;
import front.output.character;

public class GameTimer implements ActionListener{
	public static int levelDone = 0;
	public GameTimer() {
		Timer timer = new Timer(30, new ActionListener() {	 
	         public void actionPerformed(ActionEvent e) {
	        	 levelDone += 7;
	             Frame.drawPanel.repaint();
	             }
	     	});
		 timer.start();
	     timer.setRepeats(true);
	}
	public void actionPerformed(ActionEvent arg0) {
		
	}
	public static void reset() {
		character.y = character.startery;
		levelDone = 0;
		character.drawing = true;
		character.kill = 0;
	}
}