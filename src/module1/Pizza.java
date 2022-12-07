package module1;

import java.util.Scanner;

public class Pizza {
	public static void main(String[] args) {
		
		System.out.println("Wellcome to the pizza shope.");
		String userinput;
		int i;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a size of pizza :: ");
		userinput =sc.next();
		System.out.println("Enter the Qty ::");
		i = sc.nextInt();
			if (userinput.equalsIgnoreCase("small")) 
			{
				if (i == 4) 
				{
					System.out.println("You get 500ml coke free. ");
				}
				else
				{
					System.out.println("no offer");
				}
			}
		    if(userinput.equalsIgnoreCase("Medium"))
		    {
			   if (i == 6)
			   {
				 System.out.println("You get 1 liter coke free. ");
			   }
			   else
			   {
				   System.out.println("no offer");
			   }
		    }
		    if(userinput.equalsIgnoreCase("large"))
		    {
			   if (i == 10)
			   {
				 System.out.println("You get 1 liter coke and ice free. ");
			   }
			   else
			   {
				   System.out.println("no offer");
			   }
		    }
		    if(userinput.equalsIgnoreCase("Monster"))
		    {
			   if (i == 12)
			   {
				 System.out.println("You get 1 liter coke , ice and brawni free. ");
			   }
			   else
			   {
				   System.out.println("no offer");
			   }
		   }
			
		}
		
	}



