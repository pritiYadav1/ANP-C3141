import java.util.Scanner;

public class Pre_Post_Increament 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int res;
		Scanner sc=new Scanner(System.in);
		System.out.println("Ente the no");
		int num=sc.nextInt();
		
		res=++num;
		
		System.out.println("The res is ="+res);

		System.out.println("The num++ is ="+num);

	}

}
