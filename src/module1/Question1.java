package module1;

import java.util.Scanner;

public class Question1 {
	public static void main(String[] args) {
		int a,b,c,ans;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of A =");
		a = sc.nextInt();
		
		System.out.print("Enter the value of B = ");
		b = sc.nextInt();
		
		System.out.print("Enetr the value of c =");
		c = sc.nextInt();
		
		if (a>b) 
		 {
			if (a>c) 
			{
				System.out.println("A is greater");
			}
			else 
			{
				System.out.println("C is greater");
			}
		}
		else if (b>c) 
		   {
			System.out.println("B is greater");
	       }
		else
		{
			System.out.println("C is greater");
		}
		
	}
}
