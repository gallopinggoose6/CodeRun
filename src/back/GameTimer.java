package back;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;
import front.output.Frame;

public class GameTimer implements ActionListener{
	
	public static int levelDone = 10;
	public static boolean runLevel = true;
	
	public GameTimer() {
		Timer timer = new Timer(30, new ActionListener() {	 
	         public void actionPerformed(ActionEvent e) {
	        	if(runLevel){ 
	        	 	Frame.drawPanel.repaint();
	        	}
	         }
	     });
		 timer.start();
	     timer.setRepeats(true);
	}
	public void actionPerformed(ActionEvent arg0) {
		
	}

}
