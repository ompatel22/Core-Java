import java.io.*;

class LabnoOfcharandlines 
{
    public static void main(String args[]) throws IOException
    {
        int c=0,l=0;
        int i;
        String str;
        File f=new File("myFile.txt");
        FileInputStream fis=new FileInputStream(f);
       
        while((i=fis.read())!=-1)
        {
            c++;
        }
        //MOST MOST MOST MOST MOST 
        FileInputStream fis2=new FileInputStream(f);
        BufferedReader br=new BufferedReader(new InputStreamReader(fis2));
        while((str=br.readLine())!=null)
        {
            l++;
        }
        System.out.println(c+" <-char,lines-> "+l);
    }
}