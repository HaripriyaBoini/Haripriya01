package example;

public class Rectangle_Demo {

	public static void main(String[] args) {
		Assign_Rectangle rect=new Assign_Rectangle();
		rect.length=4;
		rect.breadth=3;
		System.out.println(rect.length);
		System.out.println(rect.breadth);
		
		rect.printArea();
		 rect.setlength(5);
		rect.printPerimeter();
		 rect.setBreadth(4);
		 rect.getBreadth();
		 rect.printDiagonal();
		 

	}

}
