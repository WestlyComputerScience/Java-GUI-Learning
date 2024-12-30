package Practice;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 * panel for 2D animations
 */
public class MyPanel_2DAnimation_Practice extends JPanel implements ActionListener
{
	
	final int PANEL_WIDTH = 500;
	final int PANEL_HEIGHT = 500;
	Image enemy;
	Image backgroundImage;
	Timer timer;
	int xVelocity = 2;  //adjust how many pixels image is moving
	int yVelocity = 1;
	int x = 0;   //starting positions
	int y = 0;
	
	
	MyPanel_2DAnimation_Practice()
	{
		
		this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
		this.setBackground(Color.black);
		enemy = new ImageIcon("enemy.png").getImage();  //makes image from our image icon
		
		backgroundImage = new ImageIcon("SpaceDefendersBackground.png").getImage();
		
		//action performed every 1000 miliseconds
		timer = new Timer(10, this);  //int on how often timer runs, action listener
		timer.start();
		
	}
	
	public void paint(Graphics g)
	{
		
		super.paint(g); //paints background for us
		
		Graphics2D g2D = (Graphics2D) g;
		
		g2D.drawImage(backgroundImage, 0, 0, null);
		
		g2D.drawImage(enemy, x, y, null);  //image, x, y, imageObserver
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		//if it goes out of bounds
		if(x >= PANEL_WIDTH - enemy.getWidth(null) || x < 0)  //enemy.getWidth(imageObserver)
		{
			xVelocity = -1 * xVelocity;
		}
		
		if(y >= PANEL_WIDTH - enemy.getWidth(null) || y < 0)  //enemy.getWidth(imageObserver)
		{
			yVelocity = -1 * yVelocity;
		}
		
		y = y + yVelocity;
		x = x + xVelocity;
		repaint();  //repaints the image
	}
	
}
