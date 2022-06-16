package operator;

public class BitwiseOperatorTest {

	public static void main(String[] args) {
		int a = 10, b = 5; 
	    int andRes, orRes, xorRes, rShiftRes, lShiftRes, complementRes; 
	    andRes = a & b; 
	    orRes = a | b;  
	    xorRes = a ^ b; 
	    rShiftRes = ( a >> b ); // a right shifted b times 
	    lShiftRes = ( a << b ); // a left shifted b times 
	    complementRes = ~a; 
	    System.out.println(rShiftRes );
	    System.out.println(lShiftRes );
	    System.out.println(complementRes);
	    System.out.println(andRes);
	     
	}

}
