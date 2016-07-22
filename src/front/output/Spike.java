package front.output;
import java.awt.*;

import back.GameTimer;

public class Spike {
	public static int x;
	public static int y;
	public static int w = 32;
	public static int h = 32;
	static int frame = 0;
	int levelDone = GameTimer.levelDone;
	
	public Spike(int xPos, int yPos) {
		x = xPos - levelDone;
		y = yPos;
	}
	public static int ReturnX(){
		return x;
	}
	public static int ReturnY(){
		return y;
	}
	public static int ReturnW(){
		return w;
	}
	public static int ReturnH(){
		return h;
	}
	public static void Draw(Graphics g){
		Graphics2D g2 = (Graphics2D)g;
		switch(frame){
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
		}
	}
}
