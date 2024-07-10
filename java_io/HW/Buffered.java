import java.io.*;
class Buffered
{
    public static void main(String args[]) throws IOException
    {
        File f=new File("myFile.txt");
        BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream("myFile.txt")));
        String str;
        while((str=br.readLine())!=null)
        {
           System.out.println(str.toUpperCase());
        }
         System.out.println("size="+f.length());
    }
}