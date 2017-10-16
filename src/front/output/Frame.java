package front.output;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Frame extends JFrame{
	public static DrawPanel drawPanel = new DrawPanel();
	public static TelemetryPanel telemetryPanel = new TelemetryPanel();
	private static final long serialVersionUID = 1L;

    public Frame (){   
    	JPanel mainPanel = new JPanel(new BorderLayout());
    	add(mainPanel);
        mainPanel.add(drawPanel, BorderLayout.CENTER);
        mainPanel.add(telemetryPanel, BorderLayout.PAGE_END);
        drawPanel.setVisible(true);
        telemetryPanel.setVisible(true);
        ImageIcon img = new ImageIcon("pictures/Stick Figure for coderunner.png");
        setIconImage(img.getImage());
        setLayout(new GridLayout(1,1));
        setSize(600,400);
        setResizable(true);
        setTitle("Code Run");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
