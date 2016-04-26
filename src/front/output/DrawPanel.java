package front.output;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.Timer;

public class DrawPanel extends JPanel implements ActionListener{		
    /**
     * 
     */
    private static final long serialVersionUID = -7776152874154687369L;
        int frame = 0;
        int numFrames = 4;

    public DrawPanel(){
        setBackground(Color.white);

        Timer timer = new Timer(30, new ActionListener() {
   
            public void actionPerformed(ActionEvent e) {
                if(frame < numFrames){
                    frame++;
                } else {
                    frame = 0;
                }
                repaint();
                }
        });
        timer.start();
        timer.setRepeats(true);
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        if(frame == 0){
            g2.drawImage(Toolkit.getDefaultToolkit().getImage
                ("../pictures/charcterAnimation/CodeRun_Runner0.png"), 50, character.ReturnY(), this);
        } else if(frame == 1){
            g2.drawImage(Toolkit.getDefaultToolkit().getImage
                ("../pictures/charcterAnimation/CodeRun_Runner1.png"), 50, character.ReturnY(), this);
        } else if(frame == 2){
            g2.drawImage(Toolkit.getDefaultToolkit().getImage
                ("../pictures/charcterAnimation/CodeRun_Runner2.png"), 50, character.ReturnY(), this);
        } else if(frame == 3){
            g2.drawImage(Toolkit.getDefaultToolkit().getImage
                ("../pictures/charcterAnimation/CodeRun_Runner3.png"), 50, character.ReturnY(), this);
        } else if(frame == 4){
            g2.drawImage(Toolkit.getDefaultToolkit().getImage
                ("../pictures/charcterAnimation/CodeRun_Runner4.png"), 50, character.ReturnY(), this);
        }
    }

    public void actionPerformed(ActionEvent e) {
    }
}
