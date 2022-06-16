package constructor;

public class B extends A {

	public B() {
		super(10);
		
	//  System.out.println(" ");
		System.out.println(" default constructor of B");
	}
	public B(int a) {
	this();
		System.out.println(" parametrized constructor of B");
	}

	public static void main(String[] args) {
		
		B b=new B(10);
	}

}
