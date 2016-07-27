package front.output;

import java.awt.*;

import back.GameTimer;

public class Block {
	static int x;
	static int y;
	static int w;
	static int h;
	int levelDone = GameTimer.levelDone;
	Color c = Color.gray;
	public Block(int xPos, int yPos, int width, int height) {
		x = xPos - levelDone;
		y = yPos;
		w  = width;
		h = height;
	}
	public void Draw(Graphics g) {
		checkCollide();
		Graphics2D g2 = (Graphics2D)g;
		g2.setColor(c);
		g2.fillRect(x, y, w, h);
	}
	void checkCollide() {
		if(character.ReturnBY() == y && (character.ReturnX()>x && character.ReturnX() < x+w)){
		}
		
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
