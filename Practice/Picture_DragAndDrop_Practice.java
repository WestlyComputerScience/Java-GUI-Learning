package Practice;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 * the picture class for the drag and drop practice
 */
public class Picture_DragAndDrop_Practice extends JPanel
{
	
	ImageIcon image = new ImageIcon("Smiley Face.png");
	final int width = image.getIconWidth();
	final int height = image.getIconHeight();
	Point imageCorner;
	Point previousPoint;
	
	Picture_DragAndDrop_Practice()
	{
		
		imageCorner = new Point(0,0);
		ClickListener clickListener = new ClickListener();
		DragListener dragListener = new DragListener();
		this.addMouseListener(clickListener);                      //based on click
		this.addMouseMotionListener(dragListener);                 //based on dragging
		
	}
	
	public void paintComponent(Graphics g)      //repaint image when we move image
	{
		
		super.paintComponent(g);
		
		//gets new position for our image
		//cast as int 
		image.paintIcon(this, g, (int)imageCorner.getX(), (int)imageCorner.getY());   //JPanel, graphic, x-position, y-position
		
	}
	
	private class ClickListener extends MouseAdapter  //waits until we click the mouse
	{
		
		public void mousePressed(MouseEvent e)
		{
			
			previousPoint = e.getPoint();    //updating previous point to where we clicked
			
		}
		
	}
	
	private class DragListener extends MouseMotionAdapter  //move image as move mouse around
	{
		
		public void mouseDragged(MouseEvent e)
		{
			
			Point currentPoint = e.getPoint();     //gets where mouse event is
			
			imageCorner.translate((int)(currentPoint.getX() - previousPoint.getX()), 
					(int)(currentPoint.getY() - previousPoint.getY()));                //updates imageCorner
			
			previousPoint = currentPoint;                //previous to current
			repaint();
			
		}
		
	}
	
}
