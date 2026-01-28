import java.util.Scanner;

public class SeriesSum02
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the total number of you want to sum : ");
		int N = scanner.nextInt();

		for(int i=1; i<=N; i++)
		{
		  System.out.print("Enter " + i + "th number : ");
		  int n = scanner.nextInt();

		  StringBuilder series = new StringBuilder();
		  for(int j=1; j<=n; j++)
		  { 
		    series.append(j);
		    
		    if(j<n)
		      series.append("+");
		  }		
		
		int sum = n*(n+1)/2;
		System.out.println(series + " = " + sum);
		}
		
		scanner.close();
	}
}
		
		
		
		
