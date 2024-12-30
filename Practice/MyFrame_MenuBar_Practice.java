package Practice;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 * frame for menu bar practice
 */
public class MyFrame_MenuBar_Practice extends JFrame implements ActionListener
{
	
	JMenuBar menuBar;
	
	JMenu fileMenu;
	JMenu editMenu;   //adds menus to menu bar
	JMenu helpMenu;
	
	JMenuItem loadItem;
	JMenuItem saveItem;    //items in menu bar
	JMenuItem exitItem;
	
	ImageIcon loadIcon;
	ImageIcon saveIcon;
	ImageIcon exitIcon;
	
	
	MyFrame_MenuBar_Practice()
	{
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(500, 500);
		this.setLayout(new FlowLayout());
		
		//loadIcon = new ImageIcon("load.png");
		//saveIcon = new ImageIcon("save.png");    //creates icons
		//exitIcon = new ImageIcon("exit.png");
		
		menuBar = new JMenuBar();
		
		fileMenu = new JMenu("File");          //creates options at the top of menu's!
		editMenu = new JMenu("Edit");
		helpMenu = new JMenu("Help");
		
		loadItem = new JMenuItem("Load");
		saveItem = new JMenuItem("Save");   //creats buttons under things(Ex: load under file)
		exitItem = new JMenuItem("Exit");
		
		loadItem.addActionListener(this);
		saveItem.addActionListener(this);       //adds action listener to read input
		exitItem.addActionListener(this);
		
		
		//loadItem.setIcon(loadIcon);
		//saveItem.setIcon(saveIcon);   //sets icon for menu bars
		//exitItem.setIcon(exitIcon);
		
		
		loadItem.setMnemonic(KeyEvent.VK_L);  //sets l for load 
		saveItem.setMnemonic(KeyEvent.VK_S);                        //sets keybindings to shortcuts
		exitItem.setMnemonic(KeyEvent.VK_E);            //NOTE: must press file, then use shortcuts
		
		fileMenu.setMnemonic(KeyEvent.VK_F);
		editMenu.setMnemonic(KeyEvent.VK_E);      //hold ALT + keybinding in order for it to work!
		helpMenu.setMnemonic(KeyEvent.VK_H);
		
		fileMenu.add(loadItem);
		fileMenu.add(saveItem);       //adds items to menu
		fileMenu.add(exitItem);
		
		menuBar.add(fileMenu);
		menuBar.add(editMenu);            //adds them to the menu
		menuBar.add(helpMenu);
		
		this.setJMenuBar(menuBar);       //sets menu bar to frame
		
		this.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource() == loadItem)
		{
			System.out.println("loading file...");
		}
		else if(e.getSource() == saveItem)
		{
			System.out.println("saving file...");
		}
		else if(e.getSource() == exitItem)
		{
			System.exit(0);    //terminates program
		}
	}
	
}
