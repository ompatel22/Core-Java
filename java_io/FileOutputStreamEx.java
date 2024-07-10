import java.io.*;
class FileOutputStreamEx
{
    public static void main(String args[])
    {
        File f=new File("3H.txt");
        FileOutputStream fos=null;
        try
        {
            fos=new FileOutputStream(f);
            String str="ha bhai hu bhanuj chhu";
            fos.write(str.getBytes());
            fos.close();
        }
        catch(Exception e){}
    }
}