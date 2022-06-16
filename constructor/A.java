package constructor;

public class A {
	public A(){
		//this(10);
		System.out.println(" default constructor");
	}
	public A(int a){
		this();
		
		System.out.println(" parametrized constructor of A");
	}
	public A(int a,int b){
		//this();
		
		System.out.println(" parametrized constructor of two parm");
	}

	public static void main(String[] args) {
		A a=new A(1);

	}

}
