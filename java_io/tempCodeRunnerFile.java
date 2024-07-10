import java.awt.*;

public class Moving_Ball extends Frame implements Runnable {
   int x[]=new int[]{10,50,400,380};
   int y[]=new int[]{470,40,40,480};
    int f1[]=new int[]{1,1,1,1};
    int f2[]=new int[]{1,1,1,1};
    Moving_Ball() {
        setSize(500, 500);
        setVisible(true);
        setLayout(new FlowLayout());
     }

    public void run() {
        synchronized(this)
        {
        while (true) {
            repaint();
            try {
                Thread.sleep(50);
            } catch (Exception e) {

            }
        }
    }
    }

    public void paint(Graphics g) {
        
        for(int i=0;i<4;i++)
        {
            g.drawOval(x[i], y[i], 10, 10);
            if(y[i]>480)
            {
                f1[i]=-1;
            }
            if(x[i]>480)
            {
                f2[i]=-1;
            }
            if(y[i]<20)
            {
                f1[i]=1;
            }
            if(x[i]<20)
            {
                f2[i]=1;
            }
            x[i]=x[i]+f2[i]*10;
            y[i]=y[i]+f1[i]*10;
        }
    }

    public static void main(String[] args) {
        Moving_Ball f = new Moving_Ball(); 
        Thread t = new Thread(f);
        t.start();

    }

}