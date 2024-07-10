class Test extends Thread
{
    public void run()
    {
        try{
            Thread.sleep(1000);
            System.out.println("in run() : "+this.isAlive());
        }catch(Exception e){}

    }
    public static void main(String args[]) throws InterruptedException
    {
        Test t1=new Test();
        System.out.println("main->before start() : "+t1.isAlive());
        t1.start();
        //t1.join();
        System.out.println("main->after start() : "+t1.isAlive());
        
    }
}