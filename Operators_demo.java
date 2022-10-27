import java.util.Scanner;

public class Operators_demo 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String User_name;
		int User_no;
		double Per;
		
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter Your Name:");
		User_name=sc.next();
				
		System.out.println("Enter Your Number :");
		User_no=sc.nextInt();
		
		System.out.println("Entyer your Percentage");
		Per=sc.nextDouble();
		
		System.out.println("Your Name:"+User_name);
		System.out.println("The Number is ="+User_no);
		System.out.println("The per is ="+Per);
	}

}
