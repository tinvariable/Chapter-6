package programmingProjects;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;
import javax.swing.JPanel;



public class PP66Panel extends JPanel
{
	private final int WIDTH = 300, HEIGHT = 200;
	private final int JUMP = 10;
	
	private final int IMAGE_SIZE = 31;
	
	private ImageIcon up, down, right, left, currentImage;
	private int x, y;
	
	public PP66Panel()
	{
		addKeyListener(new DirectionListener());
		
		x = WIDTH/2;
		y = HEIGHT/2;
		
		up = new ImageIcon("arrowUp.gif");
		down = new ImageIcon("arrowDown.gif");
		left = new ImageIcon("arrowLeft.gif");
		right = new ImageIcon("arrowRight.gif");
		
		currentImage = right;
		
		setBackground(Color.black);
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
		setFocusable(true);
	}
	public void paintComponent(Graphics page)
	{
		super.paintComponent(page);
		currentImage.paintIcon(this,  page,  x,  y);
	}
	private class DirectionListener implements KeyListener
	{
		public void keyPressed(KeyEvent event)
		{
			switch(event.getKeyCode())
			{
			case KeyEvent.VK_UP:
				currentImage = up;
				y-= JUMP;
				break;
			case KeyEvent.VK_DOWN:
				currentImage = down;
				y+=JUMP;
				break;
			case KeyEvent.VK_LEFT:
				currentImage = left;
				x-= JUMP;
				break;
			case KeyEvent.VK_RIGHT:
				currentImage = right;
				x+=JUMP;
				break;
			case KeyEvent.VK_W:
				currentImage = up;
				y-= JUMP;
				break;
			case KeyEvent.VK_A:
				currentImage = left;
				x-= JUMP;
				break;
			case KeyEvent.VK_S:
				currentImage = down;
				y+= JUMP;
				break;
			case KeyEvent.VK_D:
				currentImage = right;
				x+= JUMP;
				break;
			case KeyEvent.VK_Q:
				currentImage = left;
				x -= JUMP;
				y -= JUMP;
				break;
			case KeyEvent.VK_E:
				currentImage = right;
				x += JUMP;
				y -= JUMP;
				break;
			case KeyEvent.VK_X:
				currentImage = right;
				x += JUMP;
				y += JUMP;
				break;
			case KeyEvent.VK_Z:
				currentImage = left;
				x -= JUMP;
				y += JUMP;
				break;
			}
			
			repaint();
		}

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
	}

}