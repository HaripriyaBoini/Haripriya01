package ex15.upcasting.use;
class A{
	public void method()
	{
          System.out.println("method A");
	}
}
class B extends A{
	@Override
	public void method() {
		  System.out.println("method B");
		
	}
	
}
class C extends A{
	@Override
	public void method() {
	System.out.println("void c method"); }
}
	class D extends A{
		@Override
		public void method() {
			System.out.println("d method");
		}
	                   }
	


public class UpcastingUse {
	//static void CallMethod(B b) {
		//b.method();
	//}
	//static void CallMethod(C c) {
		//c.method();
	//}
	//static void CallMethod(D d) {
	//	d.method();
	//}
	static void CallMethod(A a) {
		a.method();
	}

	public static void main(String[] args) {
		 B b=new B();
		 CallMethod(b);              //A a = b
		 C c=new C();
		 CallMethod(c);              //A a = c
		 D d=new D();
		 CallMethod(d);               //D d = d
	}

}
