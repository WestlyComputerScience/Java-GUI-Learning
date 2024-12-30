package Practice;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

/**
 * Practice for JPanels
 */
public class JPanel_Practice 
{
	public static void main(String[] args)
	{
		Border border = BorderFactory.createLineBorder(new Color(144, 238, 144), 3);
		ImageIcon icon = new ImageIcon("potato.png");
		
		JLabel label = new JLabel();
		label.setText("Hi");
		label.setVerticalAlignment(JLabel.CENTER);    
		label.setHorizontalAlignment(JLabel.CENTER);  
		label.setFont(new Font("MV Boli", Font.PLAIN, 100));
		label.setForeground(Color.BLACK);
		label.setBounds(0 , 0, 100, 100);
		
		//label.setIcon(icon); //sets icon
		
		JPanel redPanel = new JPanel();
		redPanel.setBackground(Color.RED);   //sets background color
		redPanel.setBounds(0,0,250,250);     //sets the bounds for it
		
		JPanel greenPanel = new JPanel();
		greenPanel.setBackground(Color.GREEN);
		greenPanel.setBounds(0,250,250,250);
		
		JPanel bluePanel = new JPanel();
		bluePanel.setBackground(Color.BLUE);
		bluePanel.setBounds(250,0,250,250);
		
		JPanel blackPanel = new JPanel();
		blackPanel.setBackground(Color.BLACK);
		blackPanel.setBounds(250,250,250,250);
		
		JPanel orangePanel = new JPanel();
		orangePanel.setBackground(Color.ORANGE);
		orangePanel.setBounds(0,500,500,500);
		orangePanel.setLayout(new BorderLayout());   //sets a layout so you can move things, same layout as JFrame
		//cannot set alignments here! Must be in label
		orangePanel.add(label);
		
		
		//previous knowledge
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(500, 1000);
		frame.setVisible(true);
		//previous knowledge
		
		frame.add(redPanel);
		frame.add(greenPanel);
		frame.add(bluePanel);
		frame.add(blackPanel);
		frame.add(orangePanel);
	}
}
