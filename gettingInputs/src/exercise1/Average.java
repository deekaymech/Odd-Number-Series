package exercise1;

import java.util.Scanner;

public class Average {
	
	float number1;
	float number2;
	float number3;
	float result;
public void gettingInput()
{
  Scanner sc =new Scanner(System.in);	
  System.out.println("Enter the first number");
  number1=sc.nextFloat();
  System.out.println("Enter the second number");
  number2=sc.nextFloat();
  System.out.println("Enter the third number");
  number3=sc.nextFloat(); 
}
public void operation()
{
	result=(number1+number2+number3)/3;
	System.out.println("The Average of three number is"+result);
	}
}
