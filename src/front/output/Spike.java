package front.output;
import java.awt.*;

import back.GameTimer;

public class Spike {
	public int x;
	public int y;
	public static int w = 32;
	public static int h = 32;
	static int frame = 0;
	int ox = 0;
	
	public Spike(int xPos, int yPos) {
		x = xPos - GameTimer.levelDone;
		y = yPos;
		ox = xPos;
	}
	
	void Draw(Graphics g){
		Graphics2D g2 = (Graphics2D)g;
		checkCollision();
		x = ox - GameTimer.levelDone;
		/*switch(frame){
		case 0:
			g2.drawImage(Toolkit.getDefaultToolkit().getImage
		            ("pictures/spikeAnimation/spike0.png"), x, y, Frame.drawPanel);
			frame++;
		break;
		case 1:
			g2.drawImage(Toolkit.getDefaultToolkit().getImage
					("pictures/spikeAnimation/spike1.png"), x, y, Frame.drawPanel);
			frame++;
		break;
		case 2:
			g2.drawImage(Toolkit.getDefaultToolkit().getImage
					("pictures/spikeAnimation/spike2.png"), x, y, Frame.drawPanel);
			frame = 0;
		break;
		default:
			frame = 0;
		break;
		}*/
		if(frame == 0 | frame == 1 | frame == 2){
			g2.drawImage(Toolkit.getDefaultToolkit().getImage("pictures/spikeAnimation/spike_0.png"), x, y, Frame.drawPanel);
		}
		if(frame == 3 | frame == 4 | frame == 5){
			g2.drawImage(Toolkit.getDefaultToolkit().getImage("pictures/spikeAnimation/spike_1.png"), x, y, Frame.drawPanel);
		}
		if(frame == 6 | frame == 7 | frame == 8){
			g2.drawImage(Toolkit.getDefaultToolkit().getImage("pictures/spikeAnimation/spike_2.png"), x, y, Frame.drawPanel);
		}
		if(frame == 9 | frame == 10 | frame == 11){
			g2.drawImage(Toolkit.getDefaultToolkit().getImage("pictures/spikeAnimation/spike_3.png"), x, y, Frame.drawPanel);
			
		}
		if(frame == 16 | frame == 17 | frame == 18){
			g2.drawImage(Toolkit.getDefaultToolkit().getImage("pictures/spikeAnimation/spike_4.png"), x, y, Frame.drawPanel);
	
		}
		/*if(frame == 15 | frame == 16 | frame == 17){
			g2.drawImage(Toolkit.getDefaultToolkit().getImage("pictures/spikeAnimation/spike_5.png"), x, y, Frame.drawPanel);
			frame++;
		}
		if(frame == 18 | frame == 19 | frame == 20){
			//g2.drawImage(Toolkit.getDefaultToolkit().getImage("pictures/spikeAnimation/spike_6.png"), x, y, Frame.drawPanel);
		frame = 24;
		}
		if(frame == 21 | frame == 22 | frame == 23){
			//g2.drawImage(Toolkit.getDefaultToolkit().getImage("pictures/spikeAnimation/spike_7.png"), x, y, Frame.drawPanel);
			frame = 24;
		}
		if(frame == 24 | frame == 25 | frame == 26){
			g2.drawImage(Toolkit.getDefaultToolkit().getImage("pictures/spikeAnimation/spike_8.png"), x, y, Frame.drawPanel);
			frame++;
		}
		if(frame > 26){
			frame = 0;
		}*/
		if(frame == 18){
			frame = 0;
		} else {
			frame++;
		}
	}
	void checkCollision() {
		
		
	}
}
