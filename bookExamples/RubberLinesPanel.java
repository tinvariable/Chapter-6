package bookExamples;
import javax.swing.JPanel;

import java.awt.*;
import java.awt.Event.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class RubberLinesPanel extends JPanel
{
	private Point point1 = null, point2 = null;
	
	public RubberLinesPanel()
	{
		LineListener listener = new LineListener();
		addMouseListener(listener);
		addMouseMotionListener(listener);
		
		setBackground(Color.black);
		setPreferredSize(new Dimension(400, 200));
	}
	public void painComponent(Graphics page)
	{
		super.paintComponent(page);
		
		page.setColor(Color.yellow);
		if (point1 != null && point2 != null)
			page.drawLine(point1.x, point1.y, point2.x, point2.y);
	}
	private class LineListener implements MouseListener, MouseMotionListener
	{
		public void mousePressed(MouseEvent event)
		{
			point1 = event.getPoint();
		}
		public void mouseDragged(MouseEvent event)
		{
			point2 = event.getPoint();
			repaint();
		}
		public void mouseClicked(MouseEvent event)
		{
			
		}
		public void mouseReleased(MouseEvent event)
		{
			
		}
		public void mouseEntered(MouseEvent event)
		{
			
		}
		public void mouseExited(MouseEvent event)
		{
			
		}
		public void mouseMoved(MouseEvent event)
		{
			
		}
	}

}
