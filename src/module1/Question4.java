package module1;

import java.util.Scanner;

public class Question4 {
	public static void main(String[] args) {
		int i,a=0,sum=0;
		float avg;
		Scanner sc = new Scanner(System.in);
		{
			System.out.println("Enter 5 input : ");
		}
		
		for(i=1;i<=5;i++)
		{
			
			a = sc.nextInt();
			
			sum +=a;
		}
		avg = sum/5;
		System.out.println("Sum = "+sum);
		System.out.println("avg = "+avg);
		
	}
}
