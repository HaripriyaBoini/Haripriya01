package ex11.sub_sup_ref;

public class Reference_demo {

	public static void main(String[] args) {
		
		B b=new B();
		      // parent class ref can't be put in child class ref
		        //b=a;
		
		          //a=b;
		
		A a=new B();
		a.num1=10;
		a.num2=20;
		a.methodA();
		a.methodCommon();   //calls child "methodcommon" cause main parentclass A override the superclass method
		
	 
		

	}

}
