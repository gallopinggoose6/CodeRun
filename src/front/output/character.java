package front.output;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;

public class character {
  public static int VELOCITY = 0;
  public static int GRAVITY = 1;
  public static int y = 10;
  public static int x = 50;
  public static int tick = 0;
  static int frame = 0;
  static boolean isFalling = true;
	public static int ReturnY() {
		return y;
	}
	public static int ReturnBY() {
		return y+32;
	}
	public static int ReturnX(){
		return x;
	}
	public static void Draw(Graphics g){
		if(isFalling){
			if(tick == 5){
				VELOCITY += GRAVITY;
				tick = 0;
			}
			tick++;
			if(VELOCITY > 75){
				VELOCITY = 75;
			}
			y+=VELOCITY;
		} else {
			VELOCITY = 0;
		}
		Graphics2D g2 = (Graphics2D)g;
		
		switch(frame){
		case 0:
			g2.drawImage(Toolkit.getDefaultToolkit().getImage
					("pictures/charcterAnimation/CodeRun_Runner0.png"), x, y, Frame.drawPanel);
			frame++;
		break;
		case 1:
			g2.drawImage(Toolkit.getDefaultToolkit().getImage
					("pictures/charcterAnimation/CodeRun_Runner1.png"), x, y, Frame.drawPanel);
			frame++;
		break;
		case 2:
			g2.drawImage(Toolkit.getDefaultToolkit().getImage
					("pictures/charcterAnimation/CodeRun_Runner2.png"), x, y, Frame.drawPanel);
			frame++;
		break;
		case 3:
			g2.drawImage(Toolkit.getDefaultToolkit().getImage
					("pictures/charcterAnimation/CodeRun_Runner3.png"), x, y, Frame.drawPanel);
			frame++;
		break;
		case 4:
			g2.drawImage(Toolkit.getDefaultToolkit().getImage
					("pictures/charcterAnimation/CodeRun_Runner4.png"), x, y, Frame.drawPanel);
			frame = 0;
		break;
		default:
			frame = 0;
		break;
		}
	}
}
