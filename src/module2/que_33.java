package module2;

public class que_33  extends Thread { 
	public void run(){  
		System.out.println("thread is running...");  
		}  
		public static void main(String args[]){  
		que_33 t1=new que_33();  
		t1.start();  
		 }    

}
