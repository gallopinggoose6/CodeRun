package front.output;

import java.awt.*;

import back.GameTimer;

public class Spike {
	int x;
	int y;
	int w = 32;
	int h = 32;
	Color c = Color.gray;
	int frame = 0;
	int numFrames = 5;
	
	public Spike(int xPos, int yPos) {
		x = xPos;
		y = yPos;
	}
	public void Draw(Graphics g) {
		Graphics2D g2 = (Graphics2D)g;
		
		x -= GameTimer.levelDone;
		
		if(frame == 0 | frame == 1){
	        g2.drawImage(Toolkit.getDefaultToolkit().getImage
	            ("pictures/spikeAnimation/spike0.png"), x, y, Frame.drawPanel);
	    } else if(frame == 2 | frame == 3){
	        g2.drawImage(Toolkit.getDefaultToolkit().getImage
	            ("pictures/spikeAnimation/spike1.png"), x, y, Frame.drawPanel);
	    } else if(frame == 4 | frame == 5){
	        g2.drawImage(Toolkit.getDefaultToolkit().getImage
	            ("pictures/spikeAnimation/spike2.png"), x, y, Frame.drawPanel);
	    }
		if(frame < numFrames){
            frame++;
        } else {
            frame = 0;
        }
	}
}