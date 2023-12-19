package Corejavaelements;

public class AutomaticTypeConversion {  //In automatictypeconversion values convert to larger datatype

	public static void main(String[] args) {
		byte b=42;
		char c='a';
		short s=1209;
		int i=2345;
		float f =21.4f;
		double d=111.222;
		System.out.println("conversion of double to int"); //explicit type casting
		i=(int)d;
		System.out.println("d="+d + "\n i=" +i);
		
		double result= (f*b)+(i/c)-(d*s);
		System.out.println("result=" +result);
		
	}

}
