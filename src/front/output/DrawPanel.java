package front.output;

import java.awt.*;
import javax.swing.JPanel;

public class DrawPanel extends JPanel {		
    /**
     * 
     */
    private static final long serialVersionUID = -7776152874154687369L;

    public DrawPanel(){
        setBackground(Color.white);      
    }
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        character c = new character();
        character.Draw(g);
        
        Spike s = new Spike(260, 60);
        s.Draw(g);
        Spike s2 = new Spike(1050, 90);
        s2.Draw(g);
        
        Block b = new Block(50, character.ReturnBY(), 100, 20);
        b.Draw(g);
        Block b1 = new Block(300, 100, 100, 100);
        b1.Draw(g);
        Block b2 = new Block(1000, character.ReturnBY(), 500, 20);
        b2.Draw(g);
    }
    public void panelRepaint(){
    	Frame.drawPanel.repaint();
    }
}