package bookExamples;
import javax.swing.*;
import java.awt.*;

public class LightBulbPanel extends JPanel
{
	private boolean on;
	private ImageIcon lightOn, lightOff;
	private JLabel imageLabel;
	
	public LightBulbPanel()
	{
	
	lightOn = new ImageIcon("lightBulbOn.gif");
	lightOff = new ImageIcon("lightBulbOff.gif");
	
	setBackground(Color.black);
	
	on = true;
	imageLabel = new JLabel(lightOff);
	add(imageLabel);
	}
	
	public void painComponent(Graphics page)
	{
		super.paintComponent(page);
		
		if (on)
			imageLabel.setIcon(lightOn);
		else
			imageLabel.setIcon(lightOff);
	}
	
	public void setOn(boolean lightBulbOn)
	{
		on = lightBulbOn;
	}

}
