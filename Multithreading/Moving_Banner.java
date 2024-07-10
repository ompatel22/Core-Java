import java.awt.*;
import java.awt.event.*;

public class Moving_Banner extends Frame implements Runnable {
   int x=50, y=250, flag=1;

    Moving_Banner() {
        setSize(500, 500);
        setVisible(true);
        setLayout(new FlowLayout());
        Thread t = new Thread(this);
        t.start();
     }

    public void run() {
        while (true) {
            repaint();
            try {/////////////////////////////////////////////////
                Thread.sleep(50);//---------------------------->MOST
            } catch (Exception e) {//////////////////////////////////////////////////////////////////////////////////

            }
        }

    }

    public void paint(Graphics g) {
       
        if (x > 480 || x<20){
            flag=flag*(-1);
        }
        x = x +(5*flag);
		g.drawString("ompatel", x,y);
	
    }

    public static void main(String[] args) {
        Moving_Banner f = new Moving_Banner();
        

    }
}

