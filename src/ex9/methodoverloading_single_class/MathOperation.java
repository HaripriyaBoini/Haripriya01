package ex9.methodoverloading_single_class;

public class MathOperation {
	int add(int num1,int num2) {           // signatures=parameters
		System.out.println("MathOperation int is called");
		return num1+num2; }
		int add(int num1,int num2,int num3) {
			System.out.println("MathOperation int is called");
			return num1+num2; }
		int add(int num1,String num2) {
			System.out.println("MathOperation int is called");
			return num1+Integer.parseInt(num2);}
			int add(String num1,int num2) {
				return Integer.parseInt(num1)+num2;}
		}
			
		
	


