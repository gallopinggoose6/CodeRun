package codeRun;

import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

// This is the frame for the window where everything goes.
// It sets some defaults for the window here
// It has to add the JPanel class in order to know where everything goes.
// It has to add the KeyBindings class so the KeyBindings has the keyboard focus when this window is selected
public class Frame extends JFrame{

	private JPanel gp;

	public Frame (){
		gp = (JPanel) getGlassPane();
		gp.setVisible(true);
		gp.setLayout(new GridLayout(1,1));
		this.setLayout(new GridLayout(1,1));
		//gp.add(whatever);
		//this.add(whatever);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
