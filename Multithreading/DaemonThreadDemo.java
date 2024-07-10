class adminThread extends Thread {
   adminThread() {
      setDaemon(false);
   }
   public void run() {
     while(true)
     {
      System.out.println("thread ");
     }
   }
}

public class DaemonThreadDemo {
   public static void main(String[] args) throws InterruptedException {
      adminThread thread = new adminThread();
      //thread.setDaemon(true);
      thread.start();
      Thread.sleep(5000);
      ///System.out.println("thread = " + thread);
      //System.out.println("thread = " +Thread.currentThread());
      //thread.setDaemon(true);
      //thread.start();
   }
}