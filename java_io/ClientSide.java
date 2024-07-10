import java.io.*;///////////////
import java.net.*;//////////////////

class ClientSide
{
    public static void main(String args[]) throws Exception
    {
        Socket s=new Socket("localhost",9999);
        DataOutputStream dos=new DataOutputStream(s.getOutputStream());
        dos.writeInt(5);
        dos.writeInt(7);
        dos.flush();///////////////////////////////////->>>>>>>>>>>>>>>>>>IMPPPPP

        DataInputStream dis=new DataInputStream(s.getInputStream());
        int a=dis.readInt();
        System.out.println("ans: "+a);
        dos.close();////////////////////////////
        dis.close();
        s.close();
    }
}