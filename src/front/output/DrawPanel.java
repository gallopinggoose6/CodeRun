package front.output;

import java.awt.*;
import javax.swing.JPanel;

public class DrawPanel extends JPanel {		
    /**
     * 
     */
    private static final long serialVersionUID = -7776152874154687369L;
        public static int frame = 0;
        public static int numFrames = 4;

    public DrawPanel(){
        setBackground(Color.white);      
    }
    
    public void paintComponent(Graphics g){
    	
    	int x = character.ReturnX();
    	int y = character.ReturnY();
    	
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        
        if(frame == 0){
            g2.drawImage(Toolkit.getDefaultToolkit().getImage
                ("pictures/charcterAnimation/CodeRun_Runner0.png"), x, y, this);
        } else if(frame == 1){
            g2.drawImage(Toolkit.getDefaultToolkit().getImage
                ("pictures/charcterAnimation/CodeRun_Runner1.png"), x, y, this);
        } else if(frame == 2){
            g2.drawImage(Toolkit.getDefaultToolkit().getImage
                ("pictures/charcterAnimation/CodeRun_Runner2.png"), x, y, this);
        } else if(frame == 3){
            g2.drawImage(Toolkit.getDefaultToolkit().getImage
                ("pictures/charcterAnimation/CodeRun_Runner3.png"), x, y, this);
        } else if(frame == 4){
            g2.drawImage(Toolkit.getDefaultToolkit().getImage
                ("pictures/charcterAnimation/CodeRun_Runner4.png"), x, y, this);
        }
    }
    public void panelRepaint(){
    	Frame.drawPanel.repaint();
    }
}