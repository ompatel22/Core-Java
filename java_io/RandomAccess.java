import java.io.*;
class RandomAccess
{
  public static void main(String[] args) throws IOException
   {
	   /*RandomAccessFile raf = new RandomAccessFile("3.txt","rw");
      System.out.println(raf.length());
	   raf.seek(6);
	   raf.write((byte)'W');
        //raf.writeChar('W');---->do not use this!!!!!!!!!!!!!!!!!!!!
	   raf.skipBytes(5);
	   raf.write((byte)'H');
        raf.seek(16);
        raf.write((byte)'A');
        raf.seek(raf.length()-1-3);
        raf.write((byte)'Y');
        //raf.writeChar('H');--->do not use this!!!!!!!!!!!!!!!!!!!!!!!



        //Reading from starting 
        raf.seek(0);
        int i;
       while((i=raf.read())!=-1)
       {
            System.out.print((char)i);
       }
          raf.close();
         */
         RandomAccessFile raf = new RandomAccessFile("test.txt","rw");
raf.seek(0);
raf.skipBytes(5);
raf.write((byte)'H');
System.out.println("Modification done");
   }
} 