import java.io.*;
class ByteArrayReading
{
   public static void main(String[] args) 
   {
    String inputString="Information Technology";
	//byte[] b = inputString.getBytes();
	
    try{

    ByteArrayInputStream bias = new ByteArrayInputStream(inputString.getBytes());
    CharArrayReader car=new CharArrayReader(inputString.toCharArray());
	int c;
	while((c=bias.read())!=-1)
	{
		System.out.print((char)c);
	}
	bias.reset();
	System.out.println();

	while((c=bias.read())!=-1)
	{
		System.out.print(Character.toUpperCase((char)c));
        //System.out.print( ((char)c).toUpperCase() );------->MOST ,we can not use this!!!!!!!!
	}
    System.out.println();

    while((c=car.read())!=-1)
    {
        System.out.print((char)c);
    }

    }
    catch(Exception e){}
   }
}