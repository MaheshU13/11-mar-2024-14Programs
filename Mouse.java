import java.awt.*;
import java.awt.event.*;
class Mouse extends Frame implements MouseListener
{
	String msg;
	public Mouse()
	{
		addMouseListener(this);	
	}
	public void mouseClicked(MouseEvent me)
	{
		msg="Mouse was clicked here";
		repaint();
	}
	public void mouseEntered(MouseEvent me)
	{
		msg="Mouse entered the frame";
		repaint();
	}
	public void mouseExited(MouseEvent me)
	{
		
		msg="Mouse exited the frame";
		repaint();
	}
	public void mousePressed(MouseEvent me)
	{
		msg="Mouse was pressed";
		repaint();
	}
	public void mouseReleased(MouseEvent me)
	{	
		msg="Mouse was released";
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString(msg,90,120);
		
	}
	public static void main(String args[])
	{
		Mouse m=new Mouse();
		m.setSize(400,400);
		m.setVisible(true);
	}	
}