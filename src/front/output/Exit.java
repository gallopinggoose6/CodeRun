package front.output;

import java.awt.*;

import back.GameTimer;

public class Exit {
	static int x;
	static int y;
	static int w = 32;
	static int h = 32;
	int levelDone = GameTimer.levelDone;
	Color c = Color.blue;
	public Exit(int xPos, int yPos) {
		x = xPos - levelDone;
		y = yPos;
	}
	public void Draw(Graphics g) {
		checkCollide();
		Graphics2D g2 = (Graphics2D)g;
		g2.setColor(c);
		g2.fillRect(x, y, w, h);
	}
	public int returnAboveY(){
		return y-32;
	}
	void checkCollide() {
		if((character.ReturnY() <= y && character.ReturnY()+32 >= y && character.ReturnX() <= x && character.ReturnX()+32 >= x) && character.kill == false){
			character.killType="You Won";
			character.killCharc();
		}
		else {
			if(DrawPanel.blockCollisionFound == false){
				character.isFalling = true;
			}
		}
		
	}
}
