import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ButtonCount extends JFrame implements ActionListener {
    JButton b1;
    String str;
    int i;

    public ButtonCount() {
        setLayout(new FlowLayout());

        str = new String();
        i = 0;
        b1 = new JButton("One");
        add(b1);

        b1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            str = "Button was clicked " + i + " time(s)";
        }
        i++;
        repaint();
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.drawString(str, 50, 100);
    }

    public static void main(String args[]) {
        ButtonCount bc = new ButtonCount();
        bc.setSize(400, 400);
        bc.setVisible(true);
    }
}
