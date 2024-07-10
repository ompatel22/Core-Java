class one extends Thread
{
 public void run()
 {
 for(int i=0; i<2; i++) {
 System.out.print(i);
 }
 }
}
public class Test1
{
 public static void main(String args[])
 {
 Test1 t = new Test1();
 t.call (new one());
 }
 public void call(one o)
 {
 o.start(); } }