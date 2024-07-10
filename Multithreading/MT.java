class MT extends Thread
{
    public void run()
    {
        System.out.println(Thread.currentThread().getName());
    }
    public static void main(String args[])
    {
        MT t1=new MT();
        MT t2=new MT();
        MT t3=new MT();

        //t1.start();
        //t2.start();
        //t3.start();

        t1.setPriority(6);
        t2.setPriority(9);
        t3.setPriority(8);

        //t1.start();
        //t2.start();
        //t3.start();

    }
}