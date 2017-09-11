package front.input;

import front.output.*;

import java.util.*;

public class BlockLoader {
	public static ArrayList<Block> blocks = new ArrayList<Block>();
	public static ArrayList<Spike> spikes = new ArrayList<Spike>();
	Block b = new Block(50, 80, 230, 20);
    Block b1 = new Block(300, 100, 100, 100);
    Block b2 = new Block(1000, 80, 500, 20);
    Block b3 = new Block(400, 253, 1000, 10);
    Block b4 = new Block(550, 100, 100, 10);
    Block b5 = new Block(750, 100, 200, 10);
    Block b6 = new Block(2750, 100, 200, 10);
    Block b7 = new Block(1200, 230, 1000, 10);
    Block b8 = new Block(2200, 180, 500, 10);
    Block b9 = new Block(2400, 150, 500, 10);
    Spike s = new Spike(800, 189);
    Spike s1 = new Spike(1050, 16);
    Spike s2 = new Spike(50, 100);
    
	public BlockLoader(){
		blocks.add(b);
        blocks.add(b1);
        blocks.add(b2);
        blocks.add(b3);
        blocks.add(b4);
        blocks.add(b5);
        blocks.add(b6);
        blocks.add(b7);
        blocks.add(b8);
        blocks.add(b9);
        spikes.add(s);
        spikes.add(s1);
        spikes.add(s2);
	}
}
