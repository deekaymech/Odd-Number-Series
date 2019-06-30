package exercise1;

import java.util.Scanner;

public class SimpleCalculator {

	int number1;
	int number2;
public void gettingValues()
{
    Scanner sc = new Scanner(System.in);
     System.out.println("Enter the first number: ");
     number1=sc.nextInt();
     System.out.println("Enter the second number: ");
     number2=sc.nextInt();

}

public void add()

{
  int add=number1+number2;
  System.out.println("The addition value = "+add);
  
}

public void sub()

{
  int sub=number1-number2;
  System.out.println("The difference ="+sub);
  
}
public void mul()

{
  int mul=number1*number2;
  System.out.println("The multiplication value ="+mul);
  
}
public void div()

{
 float div=number1/number2;
  System.out.println("The division = "+div);
  
}




}

