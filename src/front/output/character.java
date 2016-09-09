package front.output;
import java.awt.*;
import java.awt.event.*;

public class character {
	
  public static int VELOCITY = 0;
  static int absoluteValueVELOCITY = 0;
  public static int GRAVITY = 1;
  public static int y = 10;
  public static int x = 50;
  public static int tick = 0;
  static int frame = 0;
  static boolean isFalling = true;
  static boolean spacePressed = false;
  
  	public character(){
  		
  	}
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
		if(spacePressed){
			isFalling = true;
		}
		if(isFalling){
			if(tick == 5){
				VELOCITY += GRAVITY;
				tick = 0;
			}
			tick++;
			if(VELOCITY > 75){
				VELOCITY = 75;
			}
			if(VELOCITY < 0){
				absoluteValueVELOCITY = VELOCITY + (-2*VELOCITY);
			} else {
				absoluteValueVELOCITY = VELOCITY;
			}
			for(int i = 0; i < absoluteValueVELOCITY; i++){
				
				if(VELOCITY > 0){
					y++;
				} else {
					y--;
				}
				Frame.drawPanel.drawBlocks(g);
				if(!isFalling){
					break;
				}
			}
			spacePressed = false;
		} else{
			VELOCITY = 0;
		}
		Graphics2D g2 = (Graphics2D)g;
		if(frame == 0){
	        g2.drawImage(Toolkit.getDefaultToolkit().getImage
	            ("pictures/charcterAnimation/CodeRun_Runner0.png"), x, y, Frame.drawPanel);
	        frame++;
	    } else if(frame == 1){
	        g2.drawImage(Toolkit.getDefaultToolkit().getImage
	            ("pictures/charcterAnimation/CodeRun_Runner1.png"), x, y, Frame.drawPanel);
	        frame++;
	    } else if(frame == 2){
	        g2.drawImage(Toolkit.getDefaultToolkit().getImage
	            ("pictures/charcterAnimation/CodeRun_Runner2.png"), x, y, Frame.drawPanel);
	        frame++;
	    } else if(frame == 3){
	        g2.drawImage(Toolkit.getDefaultToolkit().getImage
	            ("pictures/charcterAnimation/CodeRun_Runner3.png"), x, y, Frame.drawPanel);
	        frame++;
	    } else if(frame == 4){
	        g2.drawImage(Toolkit.getDefaultToolkit().getImage
	            ("pictures/charcterAnimation/CodeRun_Runner4.png"), x, y, Frame.drawPanel);
	        frame=0;
	    }
	}
}
