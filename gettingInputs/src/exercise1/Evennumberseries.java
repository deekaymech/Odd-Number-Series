package exercise1;

import java.util.Scanner;

public class Evennumberseries {
	int n;
public void gettingInput()
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number of terms :");
	n=sc.nextInt();
}
public void even()
{
	int i;
	for(i=1;i<=n;i++)
	{
		
		if(i%2==0)
		{
			System.out.println(i);
		}
	}
}
}
