package entities;

public class Employee {
	private int id;
	private String name1;
	public Employee() {
		super();
		
	}
	public Employee(int id, String name1) {
		super();
		this.id = id;
		this.name1 = name1;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name1=" + name1 + "]";
	}
	
	

}
