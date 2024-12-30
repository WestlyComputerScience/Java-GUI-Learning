package Practice;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 * Panel for 2D Graphics, used to stop overlapping window bar
 */
public class MyPanel_2DGraphics_Practice extends JPanel
{
	
	Image image;
	
	MyPanel_2DGraphics_Practice()
	{
		
		image = new ImageIcon("Smiley Face.png").getImage();
		
		this.setPreferredSize(new Dimension(500, 500));
		
	}
	
	//Graphics 2D is a subclass of graphics (more updated)
	public void paint(Graphics g)   //method is used in background when we call a component
	{
		
		Graphics2D g2D = (Graphics2D) g;        //creates Graphics2D object, more options available
		
		g2D.setPaint(Color.blue);
		g2D.setStroke(new BasicStroke(5));    //increases stroke size
		//g2D.drawLine(0, 0, 500, 500);         // (x,y), to (x,y)
		
		
		g2D.setPaint(Color.pink);
		//g2D.drawRect(0, 0, 100, 200);      //write draw. and see all the options : x, y and width, height
		g2D.fillRect(0,0,100,200);           //fills in rectangle
		
		//Note: most recent draw overlaps other lines
		
		//g2D.drawOval(ALLBITS, ABORT, WIDTH, HEIGHT);   //first 2 are x,y
		g2D.setPaint(Color.orange);
		g2D.drawOval(50, 50, 100, 100);
		g2D.fillOval(200, 200, 100, 100);
		
		//g2D.drawArc(FRAMEBITS, ERROR, WIDTH, HEIGHT, ALLBITS, ABORT);
		g2D.drawArc(50, 300, 100, 100, 0, 180);    //last 2 are angles, start, end angle
		
		//pokiball lol
		g2D.setPaint(Color.red);
		g2D.fillArc(200, 300, 100, 100, 0, 180);
		g2D.setPaint(Color.white);
		g2D.fillArc(200, 300, 100, 100, 180, 0);
		
		int[] xPoints = {150, 250, 350};
		int[] yPoints = {300, 150, 300};
		g2D.setPaint(Color.yellow);
		g2D.drawPolygon(xPoints, yPoints, 3);      //takes: array of ints, number of points(sides)
		//g2D.fillPolygon(xPoints, yPoints, 3);   //fills triangle
		
		//Note: in order to make it visible, must set it lower, bottom of letters start at start
		g2D.setPaint(Color.blue);
		g2D.setFont(new Font("Ink Free", Font.BOLD, 50));
		g2D.drawString("YESSIR", 300, 50);      //Arguments: String, x, y
		
		//adds image
		g2D.drawImage(image, 400, 400, null);   //takes: image, x, y, image observer
		//can be a background if put at top
		
	}
	
}
