package front.output;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import back.GameTimer;
import front.input.*;

public class DrawPanel extends JPanel implements KeyListener{		
	
    private static final long serialVersionUID = -7776152874154687369L;
    static boolean blockCollisionFound = false;
    public static float initialTime = 0;
    public float jumpTime = 0;
    public static boolean wait = false;
    
    public DrawPanel(){
    	this.setFocusable(true);
    	this.requestFocus();
    	addKeyListener(this);
        setBackground(Color.white);
    }
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        if(Frame.runGame){
        	drawBlocks(g);
        	//These next two lines of code must go last
        	character.Draw(g);
        	blockCollisionFound = false;
        	if(wait && character.isFalling) wait = false;
        } else {
        	
        }
    }
    public void drawBlocks(Graphics g){
    	for(int i = 0; i < BlockLoader.blocks.size(); i++){
    			BlockLoader.blocks.get(i).Draw(g);
    	}
    	for(int i = 0; i < BlockLoader.spikes.size(); i++){
			BlockLoader.spikes.get(i).Draw(g);
    	}
    	Frame.telemetryPanel.repaint();
        Exit e = new Exit(1500-32, 80-32);
        e.Draw(g);
    }
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
				wait = false;
			}
		}	
	}
	
	
	public void keyTyped(KeyEvent e) {}
}
