package Practice;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

/**
 * Practice for JLabels
 * 
 * Note: CRTL + SHIFT + o
 * does any necessary imports you need
 */
public class JLabel_Practice 
{
	public static void main(String[] args)
	{
		
		ImageIcon image = new ImageIcon("potato.png");
		Border border = BorderFactory.createLineBorder(new Color(144, 238, 144), 3);
		
		JLabel label = new JLabel();  //creates label
		label.setText("I'm da programming god");  //adds text to a label
		// JLabel label = new JLabel("I'm da programming god"); //could do this as well
		label.setIcon(image); 
		label.setHorizontalTextPosition(JLabel.CENTER);  //set text LEFT, CENTER, or RIGHT of image icon
		label.setVerticalTextPosition(JLabel.TOP);  //set text TOP, CENTER, or BOTTOM of image icon
		label.setForeground(new Color(144, 238, 144));  //hexidecimal colors or RGB, this sets text color of text
		label.setFont(new Font("MV Boli", Font.PLAIN, 20));  //set font of text
		label.setIconTextGap(100);  //sets gap between text and image, can use neg numbers
		label.setBackground(Color.BLACK);  //set background color, follow with setOpaque()
		label.setOpaque(true);  //sets true to the changes
		label.setBorder(border);  //shows the border of our label, likes to take up as much room as possible
		label.setVerticalAlignment(JLabel.TOP);     //changes the place on the label where label located
		label.setHorizontalAlignment(JLabel.CENTER);  //does the same, with icon + text
		//label.setBounds(250, 100, 500, 500);   //sets the bounds of a label as to where it can be on a frame
		
		
		
		//previous knowledge
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1000, 1000);
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setVisible(true);
		//previous knowledge
		
		//frame.setLayout(null);    //sets a null layout to the frame, so label doesn't take up the entire frame
		
		frame.add(label);   //adds label to frame
		frame.pack();   //resize the size of the frame to accommodate all the components you have
		
	}
}
