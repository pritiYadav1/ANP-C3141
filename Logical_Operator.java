import java.util.Scanner;

public class Logical_Operator {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ter_demo();

	}
	
	public static void demo()
	{
		boolean num1,num2,res;
		num1=false;
		num2=false;
		res=!(num1||num2);
		System.out.println("The result of && is = "+res);
		
		
	}
	public static void bit_demo()
	{
		int num1,num2, result,res;
		Scanner sc=new Scanner(System.in);
		System.out.println("Ente 2 no");
		 num1=sc.nextInt();
		 num2=sc.nextInt();
		 result=num1&num2;
		 
		 System.out.println("the resul is="+result);
		 res=num1|num2;
		 
		 System.out.println("the resul is="+res);
		 res=num1^num2;
		 
		 System.out.println("the resul is="+res);
		
	}

	public static void ter_demo()
	{
		int num1,num2, result;
		Scanner sc=new Scanner(System.in);
		System.out.println("Ente 2 no");
		 num1=sc.nextInt();
		 num2=sc.nextInt();
		 result=(num1>num2)?num1:num2;
		 System.out.println("The graeter no is ="+result);
	}
}
