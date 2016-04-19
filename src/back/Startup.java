package back;

import front.input.keypresses.KeyBindings;
import front.output.Frame;
// This class is activated by the launchgame class
// This class starts up everything.
// It initializes most of the classes.
// It runs other code too. All code here will never be run again.
// Most classes will be initialized in here and just given to other classes through their constructors.
// Please do not name an object by the first letter of the class name. 
// You can use the full class name for the name of the object.
public class Startup{
	
	Frame frame;
	KeyBindings keyBindings;

	public Startup(){

		keyBindings = new KeyBindings();
		frame = new Frame(keyBindings);
	}
}
