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
    character c = new character();
    Block b = new Block(character.ReturnX(), character.ReturnBY(), 100, 20);
    Block b1 = new Block(300, 100, 100, 100);
    Block b2 = new Block(1000, character.ReturnBY(), 500, 20);
    Spike s = new Spike(500, 300);
    Spike s1 = new Spike(1010, character.ReturnY());
    
    
    
    
    public void paintComponent(Graphics g){
    	
        super.paintComponent(g);
        
        c.Draw(g);
        b.Draw(g);
        b1.Draw(g);
        b2.Draw(g);
        s.Draw(g);
        s1.Draw(g);
    }
}