package constructors;

public class Person {
	private String name;
	
	public Person() {
            System.out.println("person class default constructor");

	}
	public Person(String name) {
		this.name=name;
		System.out.println("person class param1 constructor");
		
	}
	public String getName() {
		return name;
	}
	
}
