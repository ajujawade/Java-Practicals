// Button Events 
// On Pressing a Button Color Changes

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*   <applet code = "P16.class" width=140 height =140>
    </applet> */

public class P16 extends Applet implements ActionListener {

    String msg = "";
    Button first, second;

    public void init() {

        first = new Button("Yes");
        second = new Button("No");
        add(first);
        add(second);
        first.addActionListener(this);
        second.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {

        String str = e.getActionCommand();
        if (str.equals("Yes")) {

            first.setBackground(Color.red);
            second.setBackground(Color.white);
            msg = "Pressed Yes";
        } else {
            second.setBackground(Color.blue);
            first.setBackground(Color.white);
            msg = "Pressed No";
        }
        repaint();
    }

    public void paint(Graphics g) {
        g.drawString(msg, 13, 12);
    }

}
