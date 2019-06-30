package exercise1;

import java.util.Scanner;

public class PrintSameLine {
	String name1;
	String name2;
	
public void gettingName()
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the First name: ");
	name1=sc.nextLine();
	System.out.println("Enter the Second name: ");
	name2=sc.nextLine();
	
}

public void display()
{
	System.out.println(name1+name2);	
}
}
