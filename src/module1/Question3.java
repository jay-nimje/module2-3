package module1;

import java.util.Scanner;

public class Question3 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter year: ");
		int year = sc.nextInt();
		
		boolean x = (year % 4 == 0);
		boolean y = (year % 100 != 0);
		boolean z = ((year % 100 == 0) && (year % 400 == 0));
		
		if(x && (y||z)) {
			System.out.println("This is leap year");
		}
		else {
			System.out.println("This is not leap year");
		}
		int i;
		System.out.println("Enter the 10 neturale number");
		for(i=1; i<=10; i++)
		{
			System.out.println(i);
		}
						
	}
}