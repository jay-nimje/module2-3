package module2;

public class que_35  extends Thread{  
	 public void run(){  
		   System.out.println("running...");  
		 }  
		 public static void main(String args[]){  
		  que_35 t1=new que_35();  
		  t1.start();  
		  t1.start();  
		 }  
		}