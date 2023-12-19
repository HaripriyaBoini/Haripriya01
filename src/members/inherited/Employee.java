package members.inherited;

public class Employee extends Person {
   String companyname;
   void showData() {
	   System.out.println(getName()+ "works at "+companyname);
   }
}
