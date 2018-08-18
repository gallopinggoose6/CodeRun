package front.output;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import back.*;

public class Spike {
	public int x;
	public int y;
	public static int w = 32;
	public static int h = 32;
	static int frame = 0;
	int ox = 0;
	BufferedImage frame0;
	BufferedImage frame1;
	BufferedImage frame2;
	BufferedImage frame3;
	BufferedImage frame4;
	BufferedImage frame5;
	BufferedImage frame6;
	BufferedImage frame7;
	BufferedImage frame8;
	public Spike(int xPos, int yPos) {
		x = xPos - GameTimer.levelDone;
		y = yPos;
		ox = xPos;
		try {
			frame0 = ImageIO.read(getClass().getResourceAsStream("\\..\\..\\pictures\\spikeAnimation\\spike_0.png"));
			frame1 = ImageIO.read(getClass().getResourceAsStream("\\..\\..\\pictures\\spikeAnimation\\spike_1.png"));
			frame2 = ImageIO.read(getClass().getResourceAsStream("\\..\\..\\pictures\\spikeAnimation\\spike_2.png"));
			frame3 = ImageIO.read(getClass().getResourceAsStream("\\..\\..\\pictures\\spikeAnimation\\spike_3.png"));
			frame4 = ImageIO.read(getClass().getResourceAsStream("\\..\\..\\pictures\\spikeAnimation\\spike_4.png"));
			frame5 = ImageIO.read(getClass().getResourceAsStream("\\..\\..\\pictures\\spikeAnimation\\spike_5.png"));
			frame6 = ImageIO.read(getClass().getResourceAsStream("\\..\\..\\pictures\\spikeAnimation\\spike_6.png"));
			frame7 = ImageIO.read(getClass().getResourceAsStream("\\..\\..\\pictures\\spikeAnimation\\spike_7.png"));
			frame8 = ImageIO.read(getClass().getResourceAsStream("\\..\\..\\pictures\\spikeAnimation\\spike_8.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	void Draw(Graphics g){
		Graphics2D g2 = (Graphics2D)g;
		checkCollision();
		x = ox - GameTimer.levelDone;
		if(character.ReturnX()+32 >= x && character.ReturnX() <= x+w){
			if(character.ReturnY() >= y && character.ReturnY() <= y+h){
				character.killType = "You Died by running into a spike";
				character.killCharc();
			}
		}
		
		if(frame == 0 | frame == 1 | frame == 2){
			g2.drawImage(frame0, x, y, Frame.drawPanel);
		}
		if(frame == 3 | frame == 4 | frame == 5){
			g2.drawImage(frame1, x, y, Frame.drawPanel);
		}
		if(frame == 6 | frame == 7 | frame == 8){
			g2.drawImage(frame2, x, y, Frame.drawPanel);
		}
		if(frame == 9 | frame == 10 | frame == 11){
			g2.drawImage(frame3, x, y, Frame.drawPanel);
			
		}
		if(frame == 16 | frame == 17 | frame == 18){
			g2.drawImage(frame4, x, y, Frame.drawPanel);
	
		}
		if(frame == 19 | frame == 20 | frame == 21){
			g2.drawImage(frame5, x, y, Frame.drawPanel);
		}
		if(frame == 22 | frame == 23 | frame == 24){
			g2.drawImage(frame6, x, y, Frame.drawPanel);
		}
		if(frame == 25 | frame == 26 | frame == 27){
			g2.drawImage(frame7, x, y, Frame.drawPanel);
		}
		if(frame == 28 | frame == 29 | frame == 30){
			g2.drawImage(frame8, x, y, Frame.drawPanel);
		}
		if(frame >= 30){
			frame = 0;
		} else {
			frame++;
		}
	}
	void checkCollision() {
		
		
	}
}
