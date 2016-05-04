package front.input.keypresses;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

// This class is activated by the KeyBindings class
// This class has a method that should get called when you hit the space bar
public class SpacePressed extends AbstractAction{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SpacePressed(){

    }

    public void actionPerformed(ActionEvent e){
	
        //This is what hopefully get trigered when the space bar is pressed
        System.out.println("Space Pressed");
    }
}
