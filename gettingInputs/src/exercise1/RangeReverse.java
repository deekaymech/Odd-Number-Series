package exercise1;

import java.util.Scanner;

public class RangeReverse {
 int i,n;

 
 
 public void gettingInput()
 {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the number of terms");
	 n=sc.nextInt(); 
 }

public void reverse()
{
for(i=50;i>=n;i--)

	System.out.println(i);

}
}
