import java.util.Scanner;

public class calculator
   {

	public static void main(String[] args)
	{
	 
	  Scanner sc = new Scanner(System.in);

	  while(true)
	   {

		System.out.println("\n------- Simple Calculator-------");
		System.out.println("1. Addition ");
		System.out.println("2. Substraction ");
		System.out.println("3. Multiplication ");
		System.out.println("4. Division ");
		System.out.println("5. Exit ");
		System.out.print("Enter Your Choice: ");

		int ch = sc.nextInt();

		if(ch == 5)
		{
		  System.out.println("Thank You! Happy Coding.....");
		  break;
		}


		System.out.print("Enter First Number: ");
		double a = sc.nextDouble();

		System.out.print("Enter Second Number: ");
		double b = sc.nextDouble();
		
		double result = 0;

		if(ch == 1)
		{
		  result = a+b;

		  System.out.println("Result = "+result);
		}
		
		else if(ch == 2)
		{
		  if(a>b)
			result = a-b;
		  else
		 	result = b-a;

		  System.out.println("Result = "+result);
		}
	
		else if(ch == 3)
		{
		  result = a*b;

		  System.out.println("Result = "+result);
		}

		else if(ch == 4)
		{
		  if(b == 0)
			{
			  System.out.println("Error! Division by Zero is not allowed.");
			  System.out.print("Enter Second Number again : ");
			  b = sc.nextDouble();

			  result = a/b;
			}
		  else
		 	result = a/b;

		  System.out.println("Result = "+result);
		}

		else
		  System.out.println("Invalid Choice! Please try again.");
	   
	   }
	 sc.close();
	}
  }
