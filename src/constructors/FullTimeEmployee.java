package constructors;

public class FullTimeEmployee extends Employee {

		double basicSalary;
		 double allowance;
		 
		 public FullTimeEmployee() {
			 super();
			 System.out.println("fulltime employee class default constructor");
		 }
		 public FullTimeEmployee(String name,String companyname,double basicSalary,double allowance) {
			 super(name,companyname);
			 this.basicSalary=basicSalary;
			 this.allowance=allowance;
          System.out.println("Full time employee 4 param constructor");
		 }
		 void displayData() {
System.out.println(getName()+ "works at"+companyname + "and earns"+(basicSalary+allowance));
		 }

	}


