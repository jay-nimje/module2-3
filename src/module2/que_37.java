package module2;

public class que_37 extends Thread
{
    public que_37(String name){
        super(name);
    }
  
    public void run()
    {
        // Checking whether the thread is Daemon or not
        if(Thread.currentThread().isDaemon())
        {
            System.out.println(getName() + " is Daemon thread");
        }
          
        else
        {
            System.out.println(getName() + " is User thread");
        }
    }
      
    public static void main(String[] args)
    {
      
    	que_37 t1 = new que_37("t1");
    	que_37 t2 = new que_37("t2");
    	que_37 t3 = new que_37("t3");
      
        t1.setDaemon(true);
        t1.start();
        t2.start();
        t3.setDaemon(true);
        t3.start();        
    }
}