import java.io.*;
class FileReaderEx
{
    public static void main(String args[])
    {
        File f=new File("3I.txt");
        FileReader fr=null;
        try
        {
            fr=new FileReader(f);
            int i;
            while((i=fr.read())!=-1)
            {
                System.out.print((char)i);
            }
        }
        catch(Exception e){}
    }
}