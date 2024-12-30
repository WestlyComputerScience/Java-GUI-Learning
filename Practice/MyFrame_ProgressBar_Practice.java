package Practice;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

/**
 * demo for progress bar
 */
public class MyFrame_ProgressBar_Practice 
{

	JFrame frame = new JFrame();
	JProgressBar bar = new JProgressBar(0, 500);   //min, max values for progress bar

	MyFrame_ProgressBar_Practice()
	{

		bar.setValue(0);        //sets inital value
		bar.setBounds(0,0,500, 50);      //sets size
		bar.setStringPainted(true);    //adds percentage to progress bar
		bar.setFont(new Font("MV Boli", Font.BOLD, 25));
		bar.setForeground(Color.red);      //sets background color for progress
		bar.setBackground(Color.black);

		frame.add(bar);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setLayout(null);
		frame.setVisible(true);

		fill();

	}

	public void fill()
	{
		int counter = 500;
		
		while(counter > 0)    //decrements bar by 1 everytime
		{
			bar.setValue(counter);     //updates value of progress percentage
			try 
			{
				Thread.sleep(50);          //program sleeps for 0.05 seconds
			}
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
			counter = counter - 1;
		}
		bar.setString("Done! :)");
	}

}
