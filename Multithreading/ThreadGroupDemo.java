class ThreadGroupDemo implements Runnable{ 
    static ThreadGroup tg1;
    public void run() {    
        /*synchronized(this)
        {
            for(int i=1;i<=5;i++)
            {
                System.out.println(tg1.getName()+" : "+i);  
            }
            System.out.println(tg1.getName());  
        }*/
    }    
   public static void main(String[] args) {    
      ThreadGroupDemo runnable1 = new ThreadGroupDemo();    
          tg1 = new ThreadGroup("Parent ThreadGroup");    
              
          Thread t1 = new Thread(tg1, runnable1,"one");    
          t1.start();    
          Thread t2 = new Thread(tg1, runnable1,"two");    
          t2.start();    
          Thread t3 = new Thread(tg1, runnable1,"three");    
          t3.start();    
          //System.out.println(t1);
          System.out.println(t2);
          System.out.println(t3);

          try{
            tg1.wait();
          }
          catch(Exception e){}
          
		System.out.println("Thread Group Name: "+tg1.getName());    
		
    }    
   } 