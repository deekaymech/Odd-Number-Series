package exercise1;

import java.util.Scanner;

public class PersonalDetails {

	String name;
	int rollno;
	String foi;
public void gettingDetails()
{
  Scanner sc = new Scanner(System.in);
  Scanner sc1 = new Scanner(System.in);
  System.out.println("Enter the Name: ");
  name=sc.nextLine();
  System.out.println("Enter the RollNumber: ");
  rollno=sc.nextInt();
  System.out.println("Enter the Field of Interest: ");
  foi=sc1.nextLine();
  
}	
	
public void display()
{
	System.out.println("Hey, My name is " +name+" and my rollnumber is "+rollno+" and My field of interest " +foi);
}	
}
