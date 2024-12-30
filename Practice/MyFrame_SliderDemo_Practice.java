package Practice;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 * frame for sliderDemo
 */
public class MyFrame_SliderDemo_Practice implements ChangeListener
{
	
	JFrame frame;
	JPanel panel;
	JLabel label;
	JSlider slider;
	
	MyFrame_SliderDemo_Practice()
	{
		
		frame = new JFrame("Slider Demo");
		panel = new JPanel();
		label = new JLabel();
		slider = new JSlider(0, 100, 50);   //minimum value, maximum value, starting point for slider
		
		slider.setPreferredSize(new Dimension(400, 200));      //sets size for slider
		slider.setPaintTicks(true);                        //tick marks can be painted
		slider.setMinorTickSpacing(10);                //how often we want a tick
		
		slider.setPaintTrack(true);                //for bigger ticks
		slider.setMajorTickSpacing(25);           //how often for major tick spaces
		
		slider.setPaintLabels(true);   //sets numbers for major ticks
		slider.setFont(new Font("MV Boli", Font.PLAIN, 15));     //sets the font
		
		slider.setOrientation(SwingConstants.VERTICAL);    //switches slider to verticle
		
		label.setText("°C = " + slider.getValue());    //reads the current input
		label.setFont(new Font("MV Boli", Font.PLAIN, 25));
		
		slider.addChangeListener(this);   //adds changeListener to listen for input
		
		panel.add(slider);
		panel.add(label);
		frame.add(panel);
		frame.setSize(500, 500);
		frame.setVisible(true);
		
	}
	
	@Override
	public void stateChanged(ChangeEvent e) 
	{
		label.setText("°C = " + slider.getValue());    //reads the current input and updates value
	}
	
}
