package single.inheritance.copy;

public class SingleInheritance {

	public static void main(String[] args) {
		Person p=new Person();
		p.name="yash";
		System.out.println(p.name);
		
		Employee e=new Employee();
		e.name="ankit";
		e.companyname="unocareer";
		System.out.println(e.name+"works at"+e.companyname);
		

	}

}
