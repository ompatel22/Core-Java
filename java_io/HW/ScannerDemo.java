import java.io.*;
import java.util.*;
class ScannerDemo
{
    public static void main(String args[])
    {
        File f=new File("1.txt");
        try{
        Scanner sc=new Scanner(f);
        while(sc.hasNextLine())
        {
            System.out.print(sc.nextLine());
        }
        }catch(Exception e){}
    }
}