package front.output;

import java.awt.*;

import back.GameTimer;

public class Spike {
	public static int x;
	public static int y;
	public static int w = 32;
	public static int h = 32;
	int levelDone = GameTimer.levelDone;
	
	public Spike(int xPos, int yPos) {
		x = xPos - levelDone;
		y = yPos;
	}
	
	public void Draw(Graphics g) {
		Graphics2D g2 = (Graphics2D)g;
		
		}
}
