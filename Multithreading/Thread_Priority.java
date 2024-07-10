class Thread_Priority extends Thread
{
  public void run()
  {
    System.out.println("child "+this.getPriority());
  }
  public static void main(String args[])
  {
    Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
    Thread_Priority t = new Thread_Priority();
	  System.out.println(t.getPriority());
	  //t.setPriority(Thread.MIN_PRIORITY);
    Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
	  System.out.println("main "+Thread.currentThread().getPriority());
    t.start();

  }

}