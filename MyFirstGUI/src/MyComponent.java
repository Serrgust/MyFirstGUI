import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.util.Random;

import javax.swing.JComponent;

public class MyComponent extends JComponent {

	public static int counter=0;
	public void paintComponent(Graphics g) {

		Car theCar = new Car(0,0);
	
		Car theCar2 = new Car(100,100);
		int xLowerRight = this.getWidth()-theCar2.getWidth(g);
		int yLowerRight = this.getHeight()-theCar2.getHeight(g);
		theCar2.setxPosition(xLowerRight);
		theCar2.setyPosition(yLowerRight);
		
		Car theCar3 = new Car(0,150);
		Random genRand = new Random();
		int randomX = genRand.nextInt(this.getWidth()-theCar3.getWidth(g));
		int randomY = genRand.nextInt(this.getHeight()-theCar3.getHeight(g));
		theCar3.setxPosition(randomX);
		theCar3.setyPosition(randomY);
		
		theCar.draw(g);
		theCar2.draw(g);
		theCar3.draw(g);

		counter++;
		System.out.println("Counter = "+counter);

		//g2.drawString("HelloWorld", 10, 10);

	}

}
