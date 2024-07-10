import java.awt.*;

public class Moving_Ball extends Frame implements Runnable {
   int x[]=new int[]{200,100,50,480};
   int y[]=new int[]{30,250,90,480};
    int f1[]=new int[]{1,1,1,1};
    int f2[]=new int[]{1,1,1,1};
    Moving_Ball() {
        setSize(500, 500);
        setVisible(true);
        setLayout(new FlowLayout());
     }

    public void run() {
        while (true) {
            repaint();
            try {
                Thread.sleep(30);
            } catch (Exception e) {

            }
    }
    }

    public void paint(Graphics g) {
        
        for(int i=0;i<4;i++)
        {
            
            if(x[i]>480 || x[i]<20)
            {
                f1[i]*=-1;
            }
            if(y[i]>480 || y[i]<20)
            {
                f2[i]*=-1;
            }
            

            x[i]=x[i]+f1[i]*5;
            y[i]=y[i]+f2[i]*5;

            g.drawOval(x[i], y[i], 20, 20);
        }
    }

    public static void main(String[] args) {
        Moving_Ball f = new Moving_Ball(); 
        Thread t = new Thread(f);
        t.start();

    }

}