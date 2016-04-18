package coderun;

import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import keypresses.KeyBindings;

// This class is activated by the Startup class
// This is the frame for the window where everything goes.
// It sets some defaults for the window here
// It has to add the JPanel class in order to know where everything goes.
// It has to add the KeyBindings class so the KeyBindings has the keyboard focus when this window is selected
public class Frame extends JFrame{

	private JPanel gp;

	private KeyBindings keyBindings;

	public Frame (KeyBindings keyBindingsIn){

		keyBindings = keyBindingsIn;

		gp = (JPanel) getGlassPane();
		gp.setVisible(true);
		gp.setLayout(new GridLayout(1,1));
		this.setLayout(new GridLayout(1,1));
		setSize(400,400);
		setResizable(true);
		setTitle("Code Runner");
		setLocationRelativeTo(null);
		//gp.add(paint);
		this.add(keyBindings);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
