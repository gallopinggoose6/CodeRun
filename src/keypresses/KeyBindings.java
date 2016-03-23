package keypresses;

import javax.swing.JComponent;
import javax.swing.KeyStroke;

// This is the KeyBindings class
// It is activated by the startup class and is passed to display
// It sets up every keypress and makes the correct classes get called
public class KeyBindings extends JComponent{

	private SpacePressed spacePressed;

	public KeyBindings(){

		spacePressed = new SpacePressed();

		// When a key is pressed it looks at the input map
		// If it is there, then it will look at the other thing in the input map
		// Then it looks at the action map
		// If the action map matches the thing that was in the input map it will look at the other thing in the input map.
		// It will hopefully be a class that inpliments the right thing
		// Then it will call a specific method in that class
		getInputMap()
			.put(KeyStroke.getKeyStroke("SPACE"), "SpacePressed");
		getActionMap().put("SpacePressed", spacePressed);

	}
}
