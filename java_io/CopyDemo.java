import java.io.*;
class CopyDemo
{
    public static void main(String args[])
    {
        try
        {
            /*FileReader fr=new FileReader("1.txt");
            FileWriter fw=new FileWriter("2.txt");

            int i;
            while((i=fr.read())!=-1)
            {
                fw.write((byte)i);
            }
            fw.close();
            fr.close();*/
            BufferedReader br=new BufferedReader(new FileReader("1.txt"));
            BufferedWriter bw=new BufferedWriter(new FileWriter("2.txt"));
            String str;
            while((str=br.readLine())!=null)
            {
                bw.write(str+"\n");
            }
            br.close();
            bw.close();
        }
        catch(Exception e){}
    }
}