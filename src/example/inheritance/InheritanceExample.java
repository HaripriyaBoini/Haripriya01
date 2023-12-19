package example.inheritance;

public class InheritanceExample {

	public static void main(String[] args) {
		Animal animal1=new Animal();
		animal1.eat();
		animal1.walks();
		
		Dog dog =new Dog();
		dog.eat();
		dog.bark();
		dog.walks();
		
		Cat cat=new Cat();
		cat.eat();
		cat.walks();
		cat.meows();

	}

}
