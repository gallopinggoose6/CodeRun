package front.output;

import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import front.input.keypresses.KeyBindings;

// This class is activated by the Startup class
// This is the frame for the window where everything goes.
// It sets some defaults for the window here
// It has to add the JPanel class in order to know where everything goes.
// It has to add the KeyBindings class so the KeyBindings has the keyboard focus when this window is selected
public class Frame extends JFrame{

	private KeyBindings keyBindings;

	public Frame (KeyBindings keyBindingsIn){

		keyBindings = keyBindingsIn;

		DrawPanel drawPanel = new DrawPanel();
		add(drawPanel);
		drawPanel.setVisible(true);
		setLayout(new GridLayout(1,1));
		setSize(600,400);
		setResizable(true);
		setTitle("Code Runner");
		setLocationRelativeTo(null);
		//gp.add(paint);
		//this.add(keyBindings);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
