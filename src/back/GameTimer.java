package back;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

import front.output.DrawPanel;

public class GameTimer implements ActionListener{
	
	public GameTimer() {
		Timer timer = new Timer(30, new ActionListener() {	 
	         public void actionPerformed(ActionEvent e) {
	             if(DrawPanel.frame < DrawPanel.numFrames){
	                 DrawPanel.frame++;
	             } else {
	                 DrawPanel.frame = 0;
	             }
	             DrawPanel p = new DrawPanel();
	             p.panelRepaint();
	             }
	     	});
		 timer.start();
	     timer.setRepeats(true);
	}
	public void actionPerformed(ActionEvent arg0) {
		
	}

}
