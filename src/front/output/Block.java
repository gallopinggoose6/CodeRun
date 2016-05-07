package front.output;

import java.awt.*;

import back.GameTimer;

public class Block {
	int x;
	int y;
	int w;
	int h;
	int levelDone = GameTimer.levelDone;
	Color c = Color.gray;
	public Block(int xPos, int yPos, int width, int height) {
		x = xPos - levelDone;
		y = yPos;
		w  = width;
		h = height;
	}
	public void Draw(Graphics g) {
		Graphics2D g2 = (Graphics2D)g;
		g2.setColor(c);
		g2.fillRect(x, y, w, h);
		}
}