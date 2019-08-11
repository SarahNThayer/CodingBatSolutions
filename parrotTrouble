import java.util.Scanner;

public class parrotTrouble2
{
	public static void main(String[] args) 
	{
		System.out.println("If the bird is talking AND please enter an hour between 0 and 23");
		Scanner myObj = new Scanner(System.in);
		String answer = myObj.nextLine();
		int hour = myObj.nextInt();
		answer = answer.toLowerCase();
		
		if ((answer.equals("yes")) && (hour < 7 || hour > 20))
		{
			System.out.println("We are in trouble!");
		}
		
		else 
		{
			System.out.println("We are NOT in trouble!");
		}
	}
}
