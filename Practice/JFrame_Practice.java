package Practice;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class JFrame_Practice 
{
	public static void main(String[] args)
	{
		
		/*
		JFrame frame = new JFrame();   //creates frame
		frame.setTitle("JFrame title goes here");  //sets title of frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //exit on application (when you press x)
		//frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);  //doesn't let you close application with x
		//frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);  //closes JFrame, but program is still running
		frame.setResizable(false);     //prevent frame from being resized
		frame.setSize(500, 500);       //sets x and y for Jframe
		frame.setVisible(true);        //makes frame visible
		
		ImageIcon image = new ImageIcon("potato.png");  //create an image icon
		frame.setIconImage(image.getImage());   //change icon of frame
		frame.getContentPane().setBackground(new Color(0, 0, 0));  //change color of background  rgd values or hexidecimal
		//frame.getContentPane().setBackground(new Color(0xFFFFFF));  //hexidecimal color values
		*/
		
		JFrame_Practice2 mframe = new JFrame_Practice2();
		
		// new JFrame_Practice2(); // or do this
	}
}
