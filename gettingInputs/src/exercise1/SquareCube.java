package exercise1;

import java.util.Scanner;

public class SquareCube {
	
	int number;
public void gettingInput()
{
Scanner sc = new Scanner(System.in);	
System.out.println("Enter the number to square and cube");
number=sc.nextInt();
	
}

public void square()
{
System.out.println("The square is  "+number*number);	
}
public void cube()

{
System.out.println("The cube is  "+number*number*number);	
}
}

