package front.output;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

public class DrawPanel extends JPanel implements KeyListener{		
    /**
     * 
     */
    private static final long serialVersionUID = -7776152874154687369L;
    static boolean blockCollisionFound = false;
    
    public DrawPanel(){
    	this.setFocusable(true);
    	this.requestFocus();
    	addKeyListener(this);
        setBackground(Color.white);
    }
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        drawBlocks(g);
        
        //These next two lines of code must go last
        character.Draw(g);
        blockCollisionFound = false;
    }
    public void drawBlocks(Graphics g){
    	Block b = new Block(50, 80, 230, 20);
        b.Draw(g);
        Block b1 = new Block(300, 100, 100, 100);
        b1.Draw(g);
        Block b2 = new Block(1000, 80, 500, 20);
        b2.Draw(g);
        Block b3 = new Block(400, 253, 1000, 10);
        b3.Draw(g);
        Block b4 = new Block(550, 100, 100, 10);
        b4.Draw(g);
        Block b5 = new Block(750, 100, 200, 10);
        b5.Draw(g);
        Block b6 = new Block(2750, 100, 200, 10);
        b6.Draw(g);
        Spike s = new Spike(800, 221);
        s.Draw(g);
        Spike s2 = new Spike(1050, 48);
        s2.Draw(g);
    }

	public void keyPressed(KeyEvent e) {
		int k = e.getKeyCode();
		if(k == KeyEvent.VK_SPACE){
			if(character.isFalling == false){
				character.spacePressed = true;
				character.VELOCITY = -5;
			}
		}
	}

	public void keyReleased(KeyEvent e) {}
	public void keyTyped(KeyEvent e) {}
}
