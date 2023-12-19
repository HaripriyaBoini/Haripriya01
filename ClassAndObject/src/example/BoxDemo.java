package example;

public class BoxDemo {

	public static void main(String[] args) {
		Box myBox=new Box();                 //"new" and "default-constructor" give default values
		//myBox.length=10;                    // basd on datatype
		//myBox.width=8;
		//myBox.height=5;
		//myBox.type="Shoe Box";
		//myBox.noOfBoxes=100;
		//myBox.isAvailable=true;          
		
		System.out.println(myBox.length);
		System.out.println(myBox.width);
		System.out.println(myBox.height);
		System.out.println(myBox.isAvailable);
		System.out.println(myBox.noOfBoxes);
		System.out.println(myBox.type);
		myBox.calculateVolume();
		
		
		

	}

}
