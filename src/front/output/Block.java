package front.output;

import java.awt.*;

import back.GameTimer;

public class Block {
	public int x;
	public int y;
	public int w;
	public int h;
	Color c = Color.blue;
	int ox = 0;
	
	public Block(int xPos, int yPos, int width) {
		x = xPos;
		ox = xPos;
		y = yPos;
		w  = width;
	}
	public void Draw(Graphics g) {
		checkCollide();
		Graphics2D g2 = (Graphics2D)g;
		g2.setColor(c);
		g2.fillRect(x, y, w, 1);
		x = ox - GameTimer.levelDone;
	}
	public int returnAboveY(){
		return y-32;
	}
	void checkCollide() {
		if(character.ReturnBY() == y && (character.ReturnX()>= x - 32 && character.ReturnX() < x+w)){
			character.isFalling = false;
			Frame.drawPanel.blockCollisionFound = true;
		}
		else {
			if(DrawPanel.blockCollisionFound == false){
				character.isFalling = true;
			}
		}
	}
}
