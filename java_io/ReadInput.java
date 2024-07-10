import java.io.*;
class ReadInput
{
  public static void main(String[] args) throws IOException
   {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter an integer number= ");
	int i = Integer.parseInt(br.readLine());
	System.out.println("Entered number is " +i );
	System.out.println("Enter a floating number= ");
	float f = Float.parseFloat(br.readLine());
	System.out.println("Entered number is " +f );
   }
}