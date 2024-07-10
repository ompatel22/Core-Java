import java.io.*;
class ArrayStreams
{
    public static void main(String args[])
    {   
        try
        {
            String msg1="Array Stream";
            String msg2="Demo";

            File f1=new File("1.txt");
            File f2=new File("3.txt");

            FileOutputStream fos=new FileOutputStream(f1);
            FileWriter fw=new FileWriter(f2);

            ByteArrayOutputStream baos=new ByteArrayOutputStream();
            CharArrayWriter caw=new CharArrayWriter();

            baos.write(msg1.getBytes());
            caw.write(msg2.toCharArray());

            baos.writeTo(fos);
            caw.writeTo(fw);
        }
        catch(Exception e){}

    }
}