import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		JFrame mainFrame = new JFrame("My First GUI");
		
		mainFrame.setSize(1280, 720);
		
		CarStage myComponent = new CarStage();
		
		mainFrame.add(myComponent);
		
		mainFrame.setVisible(true);
		
		while(true) {
			mainFrame.repaint();
			
			Thread.sleep(1000/60);
		}
	}
	
}
