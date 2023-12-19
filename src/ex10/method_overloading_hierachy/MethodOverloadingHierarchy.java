package ex10.method_overloading_hierachy;

public class MethodOverloadingHierarchy {

	public static void main(String[] args) {
		AddOperation a=new AddOperation();
		System.out.println(a.add(10,20));
		System.out.println(a.add(100,200,89));
		
		Add a1=new Add();
		System.out.println(a1.add(1,2));
		System.out.println(a1.add(12,24,36));
		System.out.println(a1.add("10","20"));
		
		
		

	}

}
