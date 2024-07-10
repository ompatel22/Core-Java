public class threadExample extends Thread{
String msg;
threadExample(String s){
msg=s;
System.out.println("Hi");
}
public void run() {
System.out.println(msg);
}
public static void main(String[] args) {
threadExample obj1=new threadExample("hello");
threadExample obj2=new threadExample("world"); } }