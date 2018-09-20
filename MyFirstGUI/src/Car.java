import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

public class Car {
	
	private int xPosition;
	private int yPosition;
	private int speed; //pixels per second
	private int direction;
	
	private static final int DEFAULT_PIXELS_PER_TICK = 10;
	private static final int DEFAULT_DIRECTION = 1;
	
	public Car(int xPosition, int yPosition) {
		this(xPosition, yPosition, DEFAULT_PIXELS_PER_TICK, DEFAULT_DIRECTION);
	}
	
	public Car(int xPosition, int yPosition, int speed) {
		this(xPosition, yPosition, 5, DEFAULT_DIRECTION);
	}
	
	public Car(int xPosition, int yPosition, int speed, int direction) {
		super();
		this.xPosition = xPosition;
		this.yPosition = yPosition;
		this.speed = speed;
		this.direction = direction;
	}

	public int getxPosition() {
		return xPosition;
	}

	public int getyPosition() {
		return yPosition;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public void setxPosition(int xPosition) {
		this.xPosition = xPosition;
	}

	public void setyPosition(int yPosition) {
		this.yPosition = yPosition;
	}
	public void setSpeed (int speed ) {
		this.speed = speed;
		
	}

	public void setDirection(int direction) {
		this.direction = direction;
	}
	
	public int getDirection() {
		return direction;
	}
	
	public int getWidth(Graphics g) {
		return 120;
	}
	public int getHeight(Graphics g) {
		return 80;
	}
	public void draw(Graphics g) {
		
		Graphics2D g2 = (Graphics2D) g;

		Rectangle body = new Rectangle(this.getxPosition()+0, this.getyPosition()+20, 120, 30);

		Ellipse2D.Double rearTire = new Ellipse2D.Double(this.getxPosition()+20, this.getyPosition()+50, 20, 20);
		Ellipse2D.Double frontTire = new Ellipse2D.Double(this.getxPosition()+70, this.getyPosition()+50, 20, 20);

		Line2D.Double rearWindow;
		Line2D.Double frontWindow;
		Line2D.Double roof; 
		
		if (this.getDirection() > 0) {
		 rearWindow = new Line2D.Double(this.getxPosition()+20, this.getyPosition()+20, 
				 this.getxPosition()+40, this.getyPosition()+0);
		 frontWindow = new Line2D.Double(this.getxPosition()+60, this.getyPosition()+0, 
				 this.getxPosition()+80, this.getyPosition()+20);
		 roof = new Line2D.Double(this.getxPosition()+40, this.getyPosition()+0, 
				 this.getxPosition()+60, this.getyPosition()+0);
		}

		else {
			rearWindow = new Line2D.Double(20+this.getxPosition()+20, this.getyPosition()+20, 
					20+this.getxPosition()+40, this.getyPosition()+0);
			frontWindow = new Line2D.Double(20+this.getxPosition()+60, this.getyPosition()+0, 
					20+this.getxPosition()+80, this.getyPosition()+20);
			roof = new Line2D.Double(20+this.getxPosition()+40, this.getyPosition()+0, 
					20+this.getxPosition()+60, this.getyPosition()+0);
		}
		
		
		g2.setColor(Color.BLUE);
		g2.fill(body);
		g2.setColor(Color.BLACK);
		g2.fill(rearTire);
		g2.fill(frontTire);
		g2.setColor(Color.BLUE);
		g2.draw(rearWindow);
		g2.draw(frontWindow);
		g2.draw(roof);
	}

}
