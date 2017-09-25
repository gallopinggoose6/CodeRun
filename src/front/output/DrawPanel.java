package front.output;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

import back.GameTimer;
import front.input.*;

public class DrawPanel extends JPanel implements KeyListener{		
	
    private static final long serialVersionUID = -7776152874154687369L;
    static boolean blockCollisionFound = false;
    float initialTime = 0;
    float jumpTime = 0;
    
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
    	for(int i = 0; i < BlockLoader.blocks.size(); i++){
    			BlockLoader.blocks.get(i).Draw(g);
    	}
    	for(int i = 0; i < BlockLoader.spikes.size(); i++){
			BlockLoader.spikes.get(i).Draw(g);
    	}

        Exit e = new Exit(1500-32, 80-32);
        e.Draw(g);
    }
    boolean wait = false;
	public void keyPressed(KeyEvent e) {
		int k = e.getKeyCode();
		if(k == KeyEvent.VK_SPACE){
			if(character.isFalling == false && wait == false){
				initialTime = GameTimer.levelDone;
				wait = true;
			}
		}
		if(k == KeyEvent.VK_R){				/* Probably should insert new system using KeyBindings */
			back.GameTimer.reset();
		}
	}

	public void keyReleased(KeyEvent e) {
		int k = e.getKeyCode();
		if(k == KeyEvent.VK_SPACE){
			if(character.isFalling == false){
				character.spacePressed = true;
				jumpTime = GameTimer.levelDone - initialTime;
				character.VELOCITY = jumpTime *-.04;
				if(character.VELOCITY < -6) character.VELOCITY = -6;
				System.out.println("Released " + character.VELOCITY);
				wait = false;
			}
		}	
	}
	
	
	public void keyTyped(KeyEvent e) {}
}
