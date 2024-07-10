class BasicMethods extends Thread
{
    public void run()
    {
        System.out.println(Thread.currentThread().getName()+": "+Thread.currentThread().getPriority());
        for(int i=1;i<=5;i++)
        {
            System.out.println(i+" : "+this.getName());
           /*try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }*/
        }
        System.out.println("end\n");
    }
    public static void main(String args[]) throws InterruptedException
    {
        //Thread.currentThread().setPriority(10);
        BasicMethods t1=new BasicMethods();
        BasicMethods t2=new BasicMethods();
        BasicMethods t3=new BasicMethods();
        //t1.setPriority(1);
        //t2.setPriority(5);
        //t3.setPriority(9);
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
        //System.out.println("Hello");
        //System.out.println("main method");
        //System.out.println("end");
        //System.out.println("t1 is alive? "+t1.isAlive());
        //System.out.println("main is alive? "+Thread.currentThread().isAlive());
        //System.out.println(Thread.currentThread());
        //System.out.println(t1);
        //System.out.println(t2);
        //System.out.println(t3);
    }
}