import java.io.*;
class RAF
{
    public static void main(String args[]) throws IOException
    {
        RandomAccessFile raf=new RandomAccessFile("raf.txt","rw");
        int size=(int)raf.length();

        for(int i=0;i<10;i++)
        {
            System.out.print((Character.toUpperCase((char)raf.read()))  );
        }
        
        raf.seek(size-10);
        System.out.println();
        
       for(int i=0;i<10;i++)
        {
            System.out.print((Character.toUpperCase((char)raf.read())) );
        }
        
    }
}