package front.output;

import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Frame extends JFrame{
	public static DrawPanel drawPanel = new DrawPanel();
	private static final long serialVersionUID = 1L;

    public Frame (){        
        add(drawPanel);
        drawPanel.setVisible(true);
        ImageIcon img = new ImageIcon("pictures/Stick Figure for coderunner.png");
        setIconImage(img.getImage());
        setLayout(new GridLayout(1,1));
        setSize(600,400);
        setResizable(true);
        setTitle("Code Run");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}