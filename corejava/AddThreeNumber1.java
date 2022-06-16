package corejava;
import java.util.Scanner;

public class AddThreeNumber1 {
	public static int add()
{
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter your first number");
		int a=sc.nextInt();
		System.out.println(" enter your second number");
		int b=sc.nextInt();
		System.out.println(" enter your third number");
		int c=sc.nextInt();
	
		int r=a+b+c;
	return r;
	
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r;
		r=add();
		System.out.println("Addition of three number is "+r);

	}

}
