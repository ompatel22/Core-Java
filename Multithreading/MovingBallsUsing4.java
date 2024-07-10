import java.awt.*;
import java.awt.Graphics.*;
import java.awt.event.*;
class MT1 extends Thread
{
    int x=20,y=20,f1=1,f2=1;
    
    public void run() {
        if(x>490 || x<10)
        {
            f1*=-1;
        }
        if(y>490 || y<10)
        {
            f2*=-1;
        }
        x+=(f1*5);
        y+=(f2*5);
    }
}
class MovingBallsUsing4 extends Frame //implements Runnable
{
    MT1 t1;
    MovingBallsUsing4()
    {
        setSize(500,500);
        setVisible(true);
        t1=new MT1();
        t1.start();
    }
    public static void main(String args[])
    {
        MovingBallsUsing4 ob=new MovingBallsUsing4();
    }
}