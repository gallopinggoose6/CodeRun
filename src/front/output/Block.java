package front.output;

import java.awt.*;

public class Block {
	int x;
	int y;
	int w;
	int h;
	public Block(int xPos, int yPos, int width, int height) {
		x = xPos;
		y = yPos;
		w  = width;
		h = height;
	}
	public void Draw(Graphics g) {
		Graphics2D g2 = (Graphics2D)g;
		g2.drawRect(x, y, w, h);
		}
}
