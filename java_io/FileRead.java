import java.io.FileInputStream;
import java.io.IOException;

class FileRead
{
 public static void main(String[] args) throws IOException
 {
   /*if(args.length!=1)
   {
	   System.out.println("Java File Read");
	   System.exit(0);
   }*/
   
   FileInputStream fis = new FileInputStream("myFile.txt");
   int i;
   /*size= fis.available();  //return the size of file
   //size=fis.length(); --------------------->>>>>>>>>>>>>>>>MOST (we can not use this!!!!!!!)
   System.out.println("The File"+args[0]+"has"+size+"bytes");
   System.out.println("Content Of File");
   for(int i=0; i<size; i++)
   {
	   System.out.print((char)fis.read());
   }*/
   while((i=fis.read())!=-1)
   {
        System.out.print((char)i);
   }

 }

}