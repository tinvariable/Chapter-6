package programmingProjects;
import javax.swing.*;
import java.awt.*;

public class PP67Panel extends JPanel
{
	public PP67Panel()
	{
		setPreferredSize(new Dimension(300, 500));
		
	}
	public void painComponent(Graphics g)
	{
		
		 int height = 200;
         int width = 120;
         g.setColor(Color.red);
         g.drawRect(10, 10, height, width);
         g.setColor(Color.gray);
         g.fillRect(11, 11, height, width);
         g.setColor(Color.red);
         g.drawOval(250, 20, height, width);
         g.setColor(Color.magenta);
         g.fillOval(249, 19, height, width);
	}

}
