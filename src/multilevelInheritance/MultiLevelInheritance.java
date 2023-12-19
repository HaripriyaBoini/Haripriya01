package multilevelInheritance;

public class MultiLevelInheritance {

	public static void main(String[] args) {
		Person p=new Person();
		p.name="ankit";
        System.out.println(p.name);
        
        Employee e=new Employee();
        e.name="megha";
        e.companyname="unocareer";
        
        FullTimeEmployee f=new FullTimeEmployee();
        f.name="kirti";
        f.companyname="amazon";
        f.basicSalary=8000;
        f.allowance=60000;
        f.displayData();
	
	}
}
