package front.output;
import java.awt.*;

import javax.swing.*;

import back.GameTimer;

public class TelemetryPanel extends JPanel{
	public TelemetryPanel(){
		setBackground(Color.white);
	}
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D)g;
		
		g2.setColor(Color.green);

		float drawjumpTime = GameTimer.levelDone - DrawPanel.initialTime;
		/*if(drawjumpTime < -600) {
			drawjumpTime = -600;
		}*/
		int drawVELOCITY = (int) (drawjumpTime *.04)*100;
		if(drawVELOCITY > 600) drawVELOCITY = 600;
		if(DrawPanel.wait == true){
			g2.fillRect(0, 0, drawVELOCITY, 20);
		}
	}
}
