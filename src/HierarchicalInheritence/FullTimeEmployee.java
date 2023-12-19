package HierarchicalInheritence;

public class FullTimeEmployee extends Employee {

		double basicSalary;
		 double allowance;
		 void displayData() {
System.out.println(name+ "works at"+companyname + "and earns"+(basicSalary+allowance));
		 }

	}


