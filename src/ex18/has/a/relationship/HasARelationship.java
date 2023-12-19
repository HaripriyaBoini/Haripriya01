package ex18.has.a.relationship;
class Address{
	String city;
	String State;
	String Country;
	public Address(String city, String state, String country) {
		super();
		this.city = city;
		this.State = state;
		this.Country = country;
	}
	void showAddress() {
              System.out.println("city="+city+"state="+State+"country"+Country);
	}
}
class Student{
	String name;
	Address address;
	public Student(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
	}
	void showStudent() {
                System.out.println("name"+name);
                 address.showAddress();
	}
	
}

public class HasARelationship {

	public static void main(String[] args) {
		Address address=new Address("jabalbur","madhyapradesh","india");
		Student student=new Student("kaustubh",address);
		student.showStudent();
	}

}
