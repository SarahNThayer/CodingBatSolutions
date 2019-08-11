import java.util.Scanner;

public class sumDouble 
{
	public static void main(String[] args)
	{
		Scanner num = new Scanner(System.in);
		
		System.out.println("Enter two numbers to add");
		
		int a = num.nextInt();
		int b = num.nextInt() ;
		
		int sum = a + b ;
		
		if (a == b)
		{
			sum = sum * 2;
		}
		
		System.out.println(sum);
	}
}
