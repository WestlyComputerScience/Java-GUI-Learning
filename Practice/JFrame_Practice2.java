package Practice;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 * this class is just used to show you can create your own JFrame as a subclass of JFrame
 */

public class JFrame_Practice2 extends JFrame
{
	JFrame_Practice2()
	{
		this.setTitle("Jthis title goes here");  //sets title of this
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //exit on application (when you press x)
		//this.setDefaultCloseOperation(Jthis.DO_NOTHING_ON_CLOSE);  //doesn't let you close application with x
		//this.setDefaultCloseOperation(Jthis.HIDE_ON_CLOSE);  //closes Jthis, but program is still running
		this.setResizable(false);     //prevent this from being resized
		this.setSize(500, 500);       //sets x and y for Jthis
		this.setVisible(true);        //makes this visible
		
		ImageIcon image = new ImageIcon("potato.png");  //create an image icon
		this.setIconImage(image.getImage());   //change icon of this
		this.getContentPane().setBackground(new Color(0, 0, 0));  //change color of background  rgd values or hexidecimal
		//this.getContentPane().setBackground(new Color(0xFFFFFF));  //hexidecimal color values
	}
}
