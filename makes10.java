import java.util.Scanner;

public class makes10 
{
	public static void main(String[] args)
	{
		Scanner num = new Scanner(System.in);
		System.out.println("Enter TWO integers");
		int a = num.nextInt();
		int b = num.nextInt();
		int sum = a + b;
		boolean make10 = true;
		
		if(( a == 10 || b == 10) || (sum == 10))
		{
			System.out.println(make10);
			
		}
		else
		{
			make10 = false;
			System.out.println( make10);
		}
	}
}
