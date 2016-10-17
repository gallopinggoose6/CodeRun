package front.output;

import java.awt.GridLayout;
import javax.swing.JFrame;

public class Frame extends JFrame{
	public static DrawPanel drawPanel = new DrawPanel();
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

    public Frame (){        
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
