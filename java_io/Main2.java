
import java.io.*;
public class Main2 {
 public static void main(String[] args) throws IOException {
 File file = File.createTempFile("Alphabets", "txt");
 RandomAccessFile raf = new RandomAccessFile(file, "rw");
 raf.write("ABCDEFGHIJKLMNOP".getBytes());
 raf.seek(5); System.out.println(raf.readLine());
 raf.seek(8); System.out.println(raf.readLine());
 raf.close(); } }
