package front.output;

import java.awt.*;

import back.GameTimer;

public class Block {
	int x;
	int y;
	int w;
	int h;
	Color c = Color.gray;
	public Block(int xPos, int yPos, int width, int height) {
		x = xPos;
		y = yPos;
		w  = width;
		h = height;
	}
	public void Draw(Graphics g) {
		Graphics2D g2 = (Graphics2D)g;
		x -= GameTimer.levelDone;
		g2.setColor(c);
		g2.fillRect(x, y, w, h);
	}
}