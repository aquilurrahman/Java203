package constructor;
/**
 * connect constructor with class
 * @author mr22038
 *
 */
public class ConstructorConnect {

	public ConstructorConnect() {
		//this();
		System.out.println("default constructor  ");
	}
	public ConstructorConnect(int a) {
		this();
		System.out.println("parametrized constructor  ");
	}


	public static void main(String[] args) {
		
		ConstructorConnect consobj=new ConstructorConnect(20);
	}

}
