import java.io.*;
public class NewClass
{ public static void main(String[] args)
{ try
{ FileInputStream fin = new FileInputStream("test.txt");
 InputStreamReader in_strm = new InputStreamReader(fin);
 int t; int count=3;
while((t=in_strm.read())!= -1)
{
char r = (char)t;
count++;
}
System.out.println(count);
in_strm.close();
fin.close();
}
catch (FileNotFoundException fnfe)
{ System.out.println("NO Such File Exists"); }
catch (IOException except)
{System.out.println("IOException occurred"); }
}
}