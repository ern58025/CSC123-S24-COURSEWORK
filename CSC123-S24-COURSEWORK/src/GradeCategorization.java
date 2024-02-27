import java.util.Scanner;
public class GradeCategorization 
{

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter your grade: ");
		int grade = keyboard.nextInt();
		
		if (grade >= 90) 
		{
	         System.out.println("Grade A");
	         int grade1 = keyboard.nextInt();
	     } 
		else if (grade >= 80) 
	     {
	         System.out.println("Grade B");
	         int grade2 = keyboard.nextInt();
	     } 
	     else if (grade >= 70) 
	     {
	         System.out.println("Grade C");
	         int grade3 = keyboard.nextInt();
	     } 
	     else if (grade >= 60) 
	     {
	         System.out.println("Grade D");
	         int grade4 = keyboard.nextInt();
	     } 
	     else 
	     {
	         System.out.println("Grade F");
	         int grade5 = keyboard.nextInt();
	     }
		

	}

}
