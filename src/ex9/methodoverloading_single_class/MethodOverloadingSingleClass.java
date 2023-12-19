package ex9.methodoverloading_single_class;

public class MethodOverloadingSingleClass {

	public static void main(String[] args) {
		MathOperation m = new MathOperation();
		System.out.println(m.add(1,2));
		System.out.println(m.add(1,30,3));
		System.out.println(m.add(10,"100"));
		System.out.println(m.add("10",200));
		                                       //2 methods with different type-parameters can be overloaded
		

	}

}
