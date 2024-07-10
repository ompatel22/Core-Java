import java.io.*;
class Main3
 {
 public static void main(String args[]) throws IOException
 {
 char c;
 BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
 do
 {
 c = (char) obj.read();
 System.out.print(c);
 } while(c != 'q');
 }
 }