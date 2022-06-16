package areaofshap;

 

import java.util.Scanner;
/**
 * calculate area of the circle
 * @author mr22038
 *
 */

public class AreaOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter the radius of the cirle which you want to calculte area");
		double radius=sc.nextDouble();
		double area=(22*radius*radius)/7;
		System.out.println(" Area of the given cirle radius is "+area);
		

	}

}
