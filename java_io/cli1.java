import java.io.*;
import java.net.*;
class cli1
{
    public static void main(String args[]) throws Exception
    {
        Socket s=new Socket("localhost",8888);
        PrintWriter pr=new PrintWriter(s.getOutputStream());
        pr.println("hello");
        pr.flush();

    }
}