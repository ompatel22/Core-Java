import java.io.*;
class Skip
{
    public static void main(String args[])
    {
        File f=new File("myFile.txt");
        try
        {
            FileInputStream fis=new FileInputStream(f);
            int size=fis.available();
            int i;
            for(i=0;i<10;i++)
            {
                System.out.print((char)fis.read());
            }
            fis.skip(size-20);
            System.out.println();
            while((i=fis.read())!=-1)
            {
                System.out.print((char)i);
            }
        }
        catch(Exception e){}
    }
}