package module2;

public class que_36 extends Thread{
	 public void run()
	    {
	        System.out.println("Inside run method");
	    }
	    public static void main(String[] args)
	    {
	    	que_36 m1 = new que_36();
	    	que_36 m2 = new que_36();
	    	que_36 m3 = new que_36();
	  
	        System.out.println(+ m1.getPriority());
	        System.out.println(+ m2.getPriority());
	        System.out.println(+ m3.getPriority());
	 
	        m1.setPriority(2);
	        m2.setPriority(5);
	        m3.setPriority(8);
	 
	        System.out.println(+ m1.getPriority());
	        System.out.println(+ m2.getPriority());
	        System.out.println(+ m3.getPriority());
	  
	 
	        System.out.println(
	            "Currently Executing Thread : "
	            + Thread.currentThread().getName());
	  
	        System.out.println(
	            "Main thread priority : "
	            + Thread.currentThread().getPriority());
	  
	        Thread.currentThread().setPriority(10);
	  
	        System.out.println(
	            "Main thread priority : "
	            + Thread.currentThread().getPriority());
	    }
	 }