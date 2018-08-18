package front.input;

import front.output.*;
import java.io.*;
import java.util.*;

public class BlockLoader {
	public static ArrayList<Block> blocks = new ArrayList<Block>();
	public static ArrayList<Spike> spikes = new ArrayList<Spike>();
	/*Block b = new Block(50, 80, 230);
    Block b1 = new Block(300, 100, 100);
    Block b2 = new Block(1000, 80, 500);
    Block b3 = new Block(400, 253, 1000);
    Block b4 = new Block(550, 100, 100);
    Block b5 = new Block(750, 100, 200);
    Block b6 = new Block(2750, 100, 200);
    Block b7 = new Block(1200, 230, 1000);
    Block b8 = new Block(2200, 180, 500);
    Block b9 = new Block(2400, 150, 500);
    Spike s = new Spike(800, 189);
    Spike s1 = new Spike(1050, 16);
    Spike s2 = new Spike(50, 100);
    */
	
	BufferedReader counter = null;
	BufferedReader reader = null;
	File currentLevel = new File("level_test.txt");
	int lines = 0;
	InputStreamReader isr;
	char[] levelContent;
	
	public BlockLoader(){
		levelContent = new char[(int) currentLevel.length()];
		try {
			isr = new InputStreamReader(new FileInputStream(currentLevel));
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		try {
			isr.read(levelContent);
			isr.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
			for(int i = 0; i < levelContent.length; i++){
				String line = "";
				if(levelContent[i] == 'B'){
					for(int j = 1; j < 19; j++){
						line += levelContent[i+j];
					}
					blocks.add(new Block(Integer.parseInt(line.substring(1, 6)),Integer.parseInt(line.substring(7, 12)),Integer.parseInt(line.substring(13, 18))));
				}
				if(levelContent[i] == 'S'){
					for(int k = 1; k < 13; k++){
						line += levelContent[i+k];
					}
					spikes.add(new Spike(Integer.parseInt(line.substring(1, 6)), Integer.parseInt(line.substring(7, 12))));
				}
			}
	}
}
