package ex14.upcasting.concept;

public class B extends A{
	int num3;
	int num4;
	
	void methodB() {
		System.out.println("methodB");
	}
	@Override 
	void methodCommon(){
		System.out.println("common method B");
	}
	{
		
	}
}
