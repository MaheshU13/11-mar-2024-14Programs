

/*
//BouncingBall.java
import java.awt.*;

public class BouncingBall extends Frame implements Runnable
{
	int i,j;
	Thread t;
	int ctr=0;

	public BouncingBall()
	{
		setLayout(new FlowLayout());
		i=20;
		j=20;
		setBackground(Color.white);
		setForeground(Color.red);
		t=new Thread(this);
		t.start();
	}
	
	public void run()
	{
		while(true)
		{
		
			//System.out.println("i="+i);
			//System.out.println("j="+j);	
			if(i==400)
			{
				i=20;
				j=20;
			}
			j+=20;
			if(j==200)
			{
				ctr=20;
				//System.out.println("The value of ctr is " + ctr);
				j=ctr;
				i=i+20;
			}
			repaint();
			try
			{
				t.sleep(100);
			}
			catch(InterruptedException e)
			{
			}
		}
	}
	public void paint(Graphics g)
	{
		g.fillOval(i,j,50,50);
		g.drawLine(0,230,400,230);
		//g.drawLine(200,230,210,400);
	}

	public static void main(String args[])
	{
		BouncingBall b1=new BouncingBall();

		b1.setSize(400,400);
		b1.setVisible(true);

		BouncingBall b2=new BouncingBall();
		b2.setSize(400,400);
		b2.setVisible(true);

		BouncingBall b3=new BouncingBall();
		b3.setSize(400,400);
		b3.setVisible(true);

		BouncingBall b4=new BouncingBall();
		b4.setSize(400,400);
		b4.setVisible(true);

		BouncingBall b5=new BouncingBall();
		b5.setSize(400,400);
		b5.setVisible(true);

	}
	
}

*/
import java.awt.*;

public class BouncingBall extends Panel implements Runnable {
    int i, j;
    Thread t;
    int ctr = 0;

    public BouncingBall() {
        setBackground(Color.white);
        setForeground(Color.red);
        t = new Thread(this);
        t.start();
    }

    public void run() {
        while (true) {
            if (i == 400) {
                i = 20;
                j = 20;
            }
            j += 20;
            if (j == 200) {
                ctr = 20;
                j = ctr;
                i = i + 20;
            }
            repaint();
            try {
                t.sleep(100);
            } catch (InterruptedException e) {
            }
        }
    }

    public void paint(Graphics g) {
        g.fillOval(i, j, 50, 50);
        g.drawLine(400, 300, 400, 300);
    }

    public static void main(String args[]) {
        Frame frame = new Frame("Bouncing Balls");
        frame.setLayout(new GridLayout(1, 5));

        for (int i = 0; i < 5; i++) {
            BouncingBall ball = new BouncingBall();
            ball.setSize(400, 400);
            frame.add(ball);
        }

        frame.setSize(2000, 400);
        frame.setVisible(true);
    }
}

