package programmingProjects;
import javax.swing.*;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class PP611Panel extends JPanel
{
	private int x;
	private int y;
	private int x2;
	private int y2;
	private int xf;
	private int yf;
	public PP611Panel()
	{
		setPreferredSize(new Dimension(300, 200));
		addMouseListener(new Listener());
		xf = x-x2;
		yf = y-y2;
		
	}
	private class Listener implements MouseListener
	{

		@Override
		public void mouseClicked(MouseEvent arg0) 
		{
			
			
		}

		@Override
		public void mouseEntered(MouseEvent arg0) 
		{
			
			
			
		}

		@Override
		public void mouseExited(MouseEvent arg0) 
		{
			
			
			
		}

		@Override
		public void mousePressed(MouseEvent arg0) 
		{
			x = getX();
			y = getY();
			
			
		}

		@Override
		public void mouseReleased(MouseEvent arg0) 
		{
			x2 = getX();
			y2 = getY();
			System.out.println("Distance Traveled: " +xf+yf);
			
			
		}

}
}
