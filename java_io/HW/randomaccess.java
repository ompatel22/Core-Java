import java.io.*;
class randomaccess
{
public static void main(String args[]) throws IOException
{
RandomAccessFile raf = new RandomAccessFile("test.txt","rw");
raf.seek(0);
raf.skipBytes(5);
raf.write((byte)'H');
System.out.println("Modification done");
}
}