package super_constructor;

public class Superconstructor_demo {

	public static void main(String[] args) {
		Box_Weight b=new Box_Weight();
		b.display();
		b.display_Weight(); 
		
		System.out.println("-----------------------------------");
		
		Box_Weight b2=new Box_Weight(1,2,3,4);
		b2.display();
		b2.display_Weight();
			
		
		Box_Weight b3=new Box_Weight(5,15);
		b3.display();
		b3.display_Weight(); 
		
	}

}
