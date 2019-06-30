package exercise1;

import java.util.Scanner;

public class Range {
   int i;
   int n;
 public void gettingInput()
 {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number of terms");
	n=sc.nextInt();
	 
 }
 public void output()
 {
	for(i=1;i<=n;i++)
	
	{
	System.out.println(i);
	
	}
 }
}
