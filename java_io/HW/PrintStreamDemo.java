import java.io.*;
class PrintStreamDemo
{
    public static void main(String args[])
    {
        PrintStream ps=new PrintStream(System.out);
        ps.println("bye");
        ps.close();
    }
}