package exercise1;

import java.util.Scanner;

public class VoterEligibility {

	int age;
public void gettingAge()
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the age: ");
age=sc.nextInt();

}
public void check()
{
if(age>=18)	
{
	System.out.println("He/She is Eligible to vote");
}
else
{
	System.out.println("He/She is not Eligible to vote");
}
	
}


}
