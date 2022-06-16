package corejava;
import java.util.Scanner;
public class AddThreeNumber2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c,r;
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter your first number");
		a=sc.nextInt();
		System.out.println(" enter your second number");
		b=sc.nextInt();
		System.out.println(" enter your third number");
		c=sc.nextInt();
	
		r=a+b+c;
		System.out.println(" Addition of three number is "+r);

	}

}
