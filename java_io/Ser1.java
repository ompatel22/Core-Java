import java.io.*;
import java.net.*;

class Ser1
{
    public static void main (String args[]) throws Exception
    {
        ServerSocket ss = new ServerSocket(8888);
        
        while(true)
        {
            Socket s=ss.accept();
            System.out.println("connected!");
            cThread t=new cThread(s);
            t.start();
        }
    }
}
class cThread extends Thread
{
    Socket s;
    cThread(Socket s)
    {
        this.s=s;
    }
    public void run() 
    {
        try
        {
        BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
        String msg=br.readLine();
        System.out.println("msg="+msg+" length="+msg.length());
        }
        catch(Exception e){}
    }
}