import java.io.*;
import java.net.*;

class ServerSide
{
    public static void main(String args[]) throws Exception
    {
        ServerSocket ss=new ServerSocket(9999);
        Socket s=ss.accept();
        System.out.println("connected");

        DataInputStream dis=new DataInputStream(s.getInputStream());
        int l=dis.readInt();
        int b=dis.readInt();

        System.out.println("l= "+l+" b= "+b);
        int a=l*b;

        DataOutputStream dos=new DataOutputStream(s.getOutputStream());
        dos.writeInt(a);
        dos.flush();//----->>>IMPP

        dis.close();
        dos.close();
        ss.close();
    }
}