package corejava;

public class MethodType {
	void m1(){
		System.out.println("Method without return type");
	}
	public final void m3(){
		System.out.println("from final Method ");
	}
	//public abstract void m4();
	public synchronized  void m5(){
		System.out.println("from the synchronized method");
	}
	public static void main(String[] args) {
		MethodType obj=new MethodType(); 
		System.out.println(VariableType.a);
		
		m2();
		obj.m3();
		obj.m1();
		obj.m5();

	}
	static int m2(){
		System.out.println("Method with  return type");
		return 0;
	}


}
