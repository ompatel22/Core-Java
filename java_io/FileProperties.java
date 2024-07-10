import java.io.File;
import java.util.Date;

class FileProperties
{
  public static void main(String args[]) throws Exception
  {
	  File f1 = new File("Demo1.java");
      f1.createNewFile();
	  File f2 = new File("D:\\JavaPrograms\\Demo1.java");
	  System.out.println("Filename::"+f2.getName());
	  System.out.println("Path::"+f2.getPath());
	  System.out.println("Absolute Path::"+f2.getAbsolutePath());
	  System.out.println("Parent"+f2.getParent());
	  System.out.println(f1.exists()?"exists":"does not exist");
	  System.out.println(f1.canWrite()?"is writable":"does not writable");
	  System.out.println(f1.canRead()?"is readable":"does not readable");
	  System.out.println(f1.isDirectory()?"yes":"no");
	  System.out.println(f1.isFile()?"yes":"no");
	  System.out.println(f2.isAbsolute()?"yes":"no");
	  System.out.println("File Last Modified:"+ new Date(f1.lastModified()));
      System.out.println("File size:"+ f1.length()+"bytes");
	  System.out.println(f1.isAbsolute()?"yes":"no");
	  System.out.println("f1 Parent "+f1.getParent());//MOST--------->null
	  
  }
}