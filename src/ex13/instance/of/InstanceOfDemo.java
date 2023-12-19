package ex13.instance.of;
class Parent{}
class Child extends Parent{}
public class InstanceOfDemo {

	public static void main(String[] args) {
		//case 1
		Child child=new Child();
		System.out.println(child instanceof Child);
		System.out.println(child instanceof Parent);
		System.out.println(child instanceof Object);
		
		if(child instanceof Parent) {
			System.out.println("child instanceof parent class");}
			
			//case2
		Parent p=new Child();
		System.out.println(p instanceof Child);
		System.out.println(p instanceof Parent);
		
		//case3
		Parent p1=new Parent();
		System.out.println(p1 instanceof Parent);
		System.out.println(p1 instanceof Child);
		
		//case4
		Child child1=null;
		System.out.println(child1 instanceof Child);
		System.out.println(p1 instanceof Parent);
		System.out.println(p1 instanceof Object); }
}
		
		//case5
		/*8Child child1=new Child();
		System.out.println(child1 instanceof Child2);
		*///sibling classes child1,child2 dont works instance of class hieracrchy
		
		
		
		
		

	
 

