package HierarchicalInheritence;

public class HierarchicalInheritence {

	public static void main(String[] args) {
		FullTimeEmployee f=new FullTimeEmployee();
		         f.name="shubham";
				 f.companyname="infy";
				 f.basicSalary=70000;
			  	 f.allowance=20000;
				ContractualEmployee c=new ContractualEmployee();
				        c.name="kiran";
						c.companyname="wipro";
						c.hourlyRate=2000;
						c.noOfHours=4;
						c.displayData();
	}

}


