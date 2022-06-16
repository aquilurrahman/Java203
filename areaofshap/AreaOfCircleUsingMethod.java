package areaofshap;

import java.util.Scanner;
/**
 * calculate area of circle using mehtod 
 * @author mr22038
 *
 */
public class AreaOfCircleUsingMethod {
	static double area=0;
	static double area(double radius){
		return(22*radius*radius)/7;
	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println(" enter your radius");
		double radius=sc.nextDouble();
		
		double area=area(radius);
		System.out.println(" Area of the circle is "+area);

	}

}
