package coderun;

// This class launches the game.
// It obviously is the public static void
// It has one thing that it does, initializes the startup class;
// More than likely the startup class will only have a consturctor
// The reason we have a startup class and don't just put the code in this class is that I don't want to make everything static for this class.
public class LaunchGame{
	public static void main (String[] args){
		
		new Startup();
	}
}
