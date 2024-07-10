import java.io.*;
import java.awt.*;
import java.awt.event.*;

class NotePad extends Frame implements ActionListener
{
  TextArea ta;
  TextField tf;
  Button b;
  
  public static void main(String args[])
  {
	  NotePad f = new NotePad();
  }
  
  NotePad()
  {
	  super("Notepad");
	  ta = new TextArea();
	  tf = new TextField(35);
	  b = new Button("Show");
	  
	  Panel p = new Panel();
	  p.add(tf);
	  p.add(b);
	  b.addActionListener(this);
	  add(ta,BorderLayout.CENTER);
	  add(p,BorderLayout.SOUTH);
	  setSize(800,600);
	  setVisible(true);
	  //tf.request(focus);
  }  
	  public void actionPerformed(ActionEvent ae)
	  {
		FileInputStream fs = null;
        BufferedReader br = null;
        String str = null;
        
        if(ae.getSource()==b)
		{
			try
			{
				fs = new FileInputStream(tf.getText());
				br = new BufferedReader(new InputStreamReader(fs));
				while((str=br.readLine())!=null)
				{
                    ta.append(str+"\n");//IMP step
				}
			}
			catch(Exception oe)
			{
				System.out.println(oe);
			}
			finally
			{
				if(fs!=null)//means-->>>>object create thayo hoy to.
				{
					try{fs.close();}//////////////////////////////////////////////
					catch(Exception oe1){}//////////////////////////////////////////////////
				}
			}
		}			
	  }
  }