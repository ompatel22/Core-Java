public class Suspend_resume_stop extends Thread {
    boolean suspended = false;
    boolean stopped = false;
    //static Object lock =new Object();
    public void run() {
        while (!stopped) 
        { 
           
            /*try {
                synchronized (lock) {
                while (suspended) {
                    lock.wait(); //caller->Thread (athi thread nu execution ataki jase.)
                }
                Thread.sleep(1000);} 
            }
            catch(Exception e) {}*/
           
                while(suspended)
                {
                     synchronized(this)
                    {
                        try{wait();}catch(Exception e){}
                    }
                }
        
            try{Thread.sleep(1000);}catch(Exception e){}
            System.out.println("Thread is running...");
        }
    }

    void suspendThread(){
        suspended = true;
    }

    void resumeThread() {
        suspended = false;
        synchronized (this) {
            this.notify();
        }
    }

    void stopThread() {
        stopped = true;
        this.resumeThread(); // Resume the thread to allow it to exit gracefully
    }

    public static void main(String[] args) throws InterruptedException {
        Suspend_resume_stop myThread = new Suspend_resume_stop();
        myThread.start();

        Thread.sleep(5000);

        
        System.out.println("Thread suspended for 5 seconds...");
        myThread.suspendThread();
        Thread.sleep(5000);

       
        System.out.println("Thread resumed for 2 seconds...");
        myThread.resumeThread();
        Thread.sleep(2000);

        
        System.out.println("Thread suspended for 5 seconds...");
        myThread.suspendThread();
        Thread.sleep(5000);

        System.out.println("Thread stopped.");
        myThread.stopThread();
    }
}
