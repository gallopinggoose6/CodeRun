package front.output;

import java.awt.*;
import javax.swing.JPanel;

public class DrawPanel extends JPanel {		
    /**
     * 
     */
    private static final long serialVersionUID = -7776152874154687369L;
    static boolean blockCollisionFound = false;
    
    public DrawPanel(){
        setBackground(Color.white);      
    }
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        Block b = new Block(50, 80, 230, 20);
        b.Draw(g);
        Block b1 = new Block(300, 100, 100, 100);
        b1.Draw(g);
        Block b2 = new Block(1000, 80, 500, 20);
        b2.Draw(g);
        
        Spike s = new Spike(220, b.returnAboveY());
        s.Draw(g);
        Spike s2 = new Spike(1050, b2.returnAboveY());
        s2.Draw(g);
        
        //These next two lines of code must go last
        character.Draw(g);
        blockCollisionFound = false;
    }
    public void panelRepaint(){
    	Frame.drawPanel.repaint();
    }
}
