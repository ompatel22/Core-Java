import java.util.*;
class StringThread extends Thread
{
    static String msg;
    public void run()
    {
        for(int i=0;i<msg.length();i++)
        {
            //System.out.println(msg[i]);-------->MOST,this is not valid!!!
            System.out.println(msg.charAt(i));
            try{Thread.sleep(1000);}catch(Exception e){}
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        StringThread t=new StringThread();
        msg=sc.next();
        t.start();
    }
}