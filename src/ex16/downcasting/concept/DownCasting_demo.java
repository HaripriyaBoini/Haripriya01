package ex16.downcasting.concept;
class Animal{
}
class Cat extends Animal{
	
}

public class DownCasting_demo {

	public static void main(String[] args) {
		Animal animal =new Cat();
System.out.println(animal instanceof Cat);
            Cat cat=(Cat)animal; 
		

	}

}
