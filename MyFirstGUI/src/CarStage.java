import java.awt.Graphics;
import javax.swing.JComponent;

public class CarStage extends JComponent {

	private Car theCar = new Car(0,0,10);
	
	public static int counter=0;
	
	public void paintComponent(Graphics g) {

	
//		Car theCar2 = new Car(100,100);
//		int xLowerRight = this.getWidth()-theCar2.getWidth(g);
//		int yLowerRight = this.getHeight()-theCar2.getHeight(g);
//		theCar2.setxPosition(xLowerRight);
//		theCar2.setyPosition(yLowerRight);
		
//		Car theCar3 = new Car(0,150);
//		Random genRand = new Random();
//		int randomX = genRand.nextInt(this.getWidth()-theCar3.getWidth(g));
//		int randomY = genRand.nextInt(this.getHeight()-theCar3.getHeight(g));
//		theCar3.setxPosition(randomX);
//		theCar3.setyPosition(randomY);
		
		theCar.draw(g);
		if (theCar.getDirection()>=0) { 
			//Car is going left to right
			if ((theCar.getxPosition()+theCar.getWidth(g)) < this.getWidth()) { 
				// Car has not reached border 
				theCar.setxPosition(theCar.getxPosition()+theCar.getSpeed());
			}
			else {
				theCar.setDirection(-1);
			}
		}
		else {
			// TODO Check for left wall collision
			if (theCar.getxPosition() > 0) {
				theCar.setxPosition(theCar.getxPosition()-theCar.getSpeed());
			}
			else {
				theCar.setDirection(1);
			}
//		theCar2.draw(g);
//		theCar3.draw(g);

		counter++;
		System.out.println("Counter = "+counter);

		//g2.drawString("HelloWorld", 10, 10);

	}

	}
}
