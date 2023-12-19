package demo01.packages;

import demo01.packages.model.Employee;

public class Packagedemo {

	public static void main(String[] args) {
		
		System.out.println("we are learning packages");
         System.out.println("Fully Qualified name"+"java.util.Date");
         
         Employee employee=new Employee(1,"raj");
         System.out.println(employee.getName());
	}

}
