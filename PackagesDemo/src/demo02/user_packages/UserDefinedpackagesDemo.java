package demo02.user_packages;

import entities.Employee;

public class UserDefinedpackagesDemo {

	public static  void main(String[] args) {
		Employee employee=new Employee(1,"jay");
		System.out.println(employee);
		
		RegularEmployee regularemployee = new RegularEmployee(2,"RAJ",20000,5000);
		System.out.println(regularemployee);
	
		ContractualEmployee contractualEmployee = new ContractualEmployee(3,"kastubh",10);
		System.out.println(contractualEmployee.getNoHours()*contractualEmployee.getRatePerHour(A));
	}
	

}
