package programmingProjects;
import javax.swing.*;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class PP610Panel extends JPanel 
{
	public PP610Panel()
	{
		addMouseListener(new Listener());
		
		setPreferredSize(new Dimension(300, 200));
	}
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.setColor(Color.red);
		
	}
	private class Listener implements MouseListener
	{
		@Override
		public void mouseClicked(MouseEvent event) 
		{
			if(getX() < 150)
			{
				setBackground(Color.red);
				repaint();
			}
			if(getX() > 150)
			{
				setBackground(Color.green);
				repaint();
			}
			
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
		public void mouseReleased(MouseEvent arg0) 
		{
			
			
		}

		@Override
		public void mousePressed(MouseEvent e) 
		{
			
			
		}
	}

}
