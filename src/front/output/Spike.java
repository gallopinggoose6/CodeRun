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
}
