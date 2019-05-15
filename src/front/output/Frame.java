package front.output;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.io.IOException;
import java.awt.event.*;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import front.input.BlockLoader;
import back.GameTimer;

public class Frame extends JFrame implements ActionListener{
	public static DrawPanel drawPanel = new DrawPanel();
	public static TelemetryPanel telemetryPanel = new TelemetryPanel();
	private static final long serialVersionUID = 1L;
	ImageIcon img;
	static Boolean runGame = false;
    JButton startGameButton = new JButton("Start Game");

    public Frame (){   
    	JPanel mainPanel = new JPanel(new BorderLayout());
    	add(mainPanel);
        mainPanel.add(drawPanel, BorderLayout.CENTER);
        mainPanel.add(telemetryPanel, BorderLayout.PAGE_END);
        drawPanel.setVisible(true);
        telemetryPanel.setVisible(true);
		try {
			img = new ImageIcon(ImageIO.read(getClass().getResourceAsStream("Stick Figure for coderunner.png")));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        setIconImage(img.getImage());
        setLayout(new GridLayout(1,1));
        setSize(600,400);
        setResizable(true);
        setTitle("Code Run");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        startGameButton.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e){
        		Frame.startGame();
        		remove(startGameButton);
        		revalidate();
        	}
        });
        add(startGameButton, new FlowLayout());
    }
    public static void startGame(){
    	new character();
    	new GameTimer();
    	new BlockLoader();
    	runGame = true;
    }
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
	}
}
