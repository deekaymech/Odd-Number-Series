package exercise1;

import java.util.Scanner;

public class OddNumberSeries {
	int number;
	int i;
	
public void gettingInput()
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number");
number=sc.nextInt();

}
public void odd()
{
	for(i=1;i<=number;i++)
	{
		if(i%2==1)
		{
		System.out.println(i);
		}
	}
	
}
	
}


