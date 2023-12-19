package constructors;

public class Employee extends Person {
   String companyname;
   public Employee() {
System.out.println("employee class default constructor");
   }
   public Employee(String companyname) {
	   this.companyname=companyname;
	   System.out.println("employee class 1 param");
   }
   public Employee(String name, String companyname) {
	   
	   super(name);
	   this.companyname=companyname;
	   System.out.println("employee class 2has  param");}
	   
	   public void showData() {
            System.out.println(getName()+ "works at"+companyname);
	   }
   }

