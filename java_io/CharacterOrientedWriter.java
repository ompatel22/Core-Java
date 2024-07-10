import java.io.IOException;
import java.io.*;

class CharacterOrientedWriter
{
  public static void main(String[] args) 
 {
	  if(args.length!=1)
      {
	   System.out.println("Usage:Java File Read");
	   System.exit(0);
      }
	  File file = new File(args[0]);
	  if(file.exists())
	  {
	  System.out.println("The file"+args[0]+"already exists"+"deletee it, and re rurn");
	  System.exit(0);
	  }
      
    try{
	 FileWriter fw  = new FileWriter(file);
	 String s="Hello to java programming";
	 fw.write(s);
	 System.out.println("writing complete");
	 if(fw!=null)
	 {
		 fw.close();
	 }
    }
      catch(Exception e){}
 }
}