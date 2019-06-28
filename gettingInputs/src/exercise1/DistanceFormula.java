package exercise1;

import java.util.Scanner;

public class DistanceFormula {
  float x2;
  float x1;
  float y1;
  float y2;
  float m;
   
public void formula()
{
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the value of x1 ");
	x1=scan.nextFloat();
	System.out.println("Enter the value of x2 ");
	x2=scan.nextFloat();
	System.out.println("Enter the value of y1 ");
	y1=scan.nextFloat();
	System.out.println("Enter the value of y2 ");
	y2=scan.nextFloat();
	m=(y2-y1)/(x2-x1);
	System.out.println("The slope of line"+m);
	

}
}
