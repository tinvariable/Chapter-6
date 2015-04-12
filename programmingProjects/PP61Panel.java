package programmingProjects;
import javax.swing.*;
import java.awt.*;

public class PP61Panel extends JPanel 
{
	private int count;
	
	public PP61Panel()
	{
		count = 0;
		setBackground(Color.BLUE);
		JButton button = new JButton("Increment");
		add(button);
		
	}

}
