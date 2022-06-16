package flowcontrolls;

import java.util.Scanner;

public class ForLoopUsingNextTenNumber {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println(" enter your number for which you want to next Ten Number");
	int number=sc.nextInt();
	for(int i=number;i<=number+10;++i){
		System.out.println(" "+i);
	}
	}

	}


