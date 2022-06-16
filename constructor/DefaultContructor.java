package constructor;

public class DefaultContructor {
	DefaultContructor(){
		
	
		System.out.println(" default contructor");
	}
	DefaultContructor(int a){
		this();
		System.out.println(" param c contructor");
	}
	
	

	public static void main(String[] args) {
		
		DefaultContructor obj=new DefaultContructor(10);
	}

}
