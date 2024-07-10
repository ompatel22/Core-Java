import java.awt.*;
import java.awt.event.*;
import java.awt.Graphics;
class GUIThread extends Frame implements Runnable,ActionListener
{
    Thread t;
    TextField tf;
    TextArea ta;
    String msg;
    GUIThread()
    {
        super("GUIThread");
        setSize(500,500);
        setVisible(true);
        setLayout(new FlowLayout());

        t=new Thread(this);

        tf=new TextField(50);tf.addActionListener(this);add(tf);
        ta=new TextArea(10,50);add(ta);
    }
    public void run()
    {
        
        for(int i=0;i<msg.length();i++)
        {
            ta.append(msg.charAt(i)+"\n");
            try{Thread.sleep(1000);}catch(Exception e){}
        }
    }
    public void actionPerformed(ActionEvent e)
    {
        msg=tf.getText();
        t.start();
    }
    public static void main(String args[])
    {
       GUIThread gt=new GUIThread(); 
    }

}