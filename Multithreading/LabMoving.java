import java.awt.*;
import java.awt.Graphics.*;
import java.awt.event.*;
public class LabMoving extends Frame implements Runnable,ActionListener{
    TextField t1,t2,t3;
    Button b1,b2;
    Thread t;
    String msg,color;
    int size;
    Choice c;
    boolean b=false;///////////////////////////////////////////////////////////////////////////
    Font f;///////////////////////////////////////////
    int x=50,y=250;////////////////////////////////
    LabMoving()
    {
        setSize(500,500);
        setVisible(true);
        setBackground(Color.CYAN);
        t1=new TextField(15);t2=new TextField(15);t3=new TextField(15);b1=new Button("start");
        b1.addActionListener(this);
        b2=new Button("stop");b2.addActionListener(this);
        setLayout(new FlowLayout());
        c=new Choice();c.add("left");c.add("right");
        add(t1);add(t2);add(t3);add(c);add(b1);add(b2);
        t=new Thread(this);
    }
    public void run()
    {
        while(b)
        {
            repaint();
            try{
                Thread.sleep(30);
            }catch(Exception e){}
        }
    }
    public void paint (Graphics g)
    {
        if(c.getSelectedItem().equals("left"))
        {
            if(x!=490)
            {
                x=x+5;
            }
        }
        else if(c.getSelectedItem().equals("right"))
        {
            if(x!=10)
            {
                x=x-5;
            }
        }
        g.setFont(f);
        g.drawString(msg,x,y);
    }
    public void actionPerformed(ActionEvent e)
    {
        //details of t1 t2 t3
        msg=t1.getText();
        size=Integer.parseInt(t2.getText());
        color=t3.getText();
        if(color.equals("YELLOW"))
            setForeground(Color.YELLOW);
        f=new Font("Arial",Font.BOLD,size);

        if(e.getSource()==b1)
        {b=true;
        t.start();}
        if(e.getSource()==b2)
        {b=false;}

      
    }
    public static void main(String args[])
    {
        LabMoving lm=new LabMoving();
    }
}
