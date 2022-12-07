package module2;

public class que_34 {
	public static void main(String[] args)
    {
       
        try {
            for (int i = 0; i < 5; i++) {
               
                Thread.sleep(2000);
                System.out.println(i);
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
