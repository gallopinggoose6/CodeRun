package front.output;
import java.awt.*;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

public class character {
	
  public static double VELOCITY = 0;
  static double absoluteValueVELOCITY = 0;
  public static int GRAVITY = 1;
  public static int startery = 30;
  public static int y = startery;
  public static int x = 50;
  public static int tick = 0;
  static int frame = 0;
  public static boolean isFalling = true;
  static boolean spacePressed = false;
  static String killType="You died by Spontaneous Death";
  public static boolean kill = false;
  public static boolean drawing = true;
  static Image frame0;
  static Image frame1;
  static Image frame2;
  static Image frame3;
  static Image frame4;
  static Image frame5;
  
  	public character(){
  		try {
			frame0 = ImageIO.read(getClass().getResourceAsStream("\\..\\..\\pictures\\charcterAnimation\\CodeRun_Runner0.png"));
			frame1 = ImageIO.read(getClass().getResourceAsStream("\\..\\..\\pictures\\charcterAnimation\\CodeRun_Runner1.png"));
			frame2 = ImageIO.read(getClass().getResourceAsStream("\\..\\..\\pictures\\charcterAnimation\\CodeRun_Runner2.png"));
			frame3 = ImageIO.read(getClass().getResourceAsStream("\\..\\..\\pictures\\charcterAnimation\\CodeRun_Runner3.png"));
			frame4 = ImageIO.read(getClass().getResourceAsStream("\\..\\..\\pictures\\charcterAnimation\\CodeRun_Runner4.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
		if(y>1000 && kill == false){
			killType="You Died by Falling";
			killCharc();
		}
		if(spacePressed){
			isFalling = true;
			spacePressed = false;
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
					VELOCITY = 0;
					break;
				}
			}
			spacePressed = false;
		}
		if(drawing){
			Graphics2D g2 = (Graphics2D)g;
			if(frame == 0){
		        g2.drawImage(frame0, x, y, Frame.drawPanel);
		        frame++;
		    } else if(frame == 1){
		        g2.drawImage(frame1, x, y, Frame.drawPanel);
		        frame++;
		    } else if(frame == 2){
		        g2.drawImage(frame2, x, y, Frame.drawPanel);
		        frame++;
		    } else if(frame == 3){
		        g2.drawImage(frame3, x, y, Frame.drawPanel);
		        frame++;
		    } else if(frame == 4){
		        g2.drawImage(frame4, x, y, Frame.drawPanel);
		        frame=0;
		    }
		}
	}
	static void killCharc(){
		if(kill == false){
			kill = true;
			drawing=false;
			JOptionPane op = new JOptionPane();
			JOptionPane.showMessageDialog(null, killType);
		}
	}
}
