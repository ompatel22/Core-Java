import java.io.*; 
import java.net.*; 
public class Main{ 
public static void main(String[] args){ 
try{ 
URL url=new URL("http://.ddu.:987/java-tutorial"); 
 
System.out.println("Protocol: "+url.getProtocol()); 
System.out.println("Host Name: "+url.getHost()); 
System.out.println("Port Number: "+url.getPort()); 
 
}catch(Exception e){System.out.println(e);} 
} 
} 