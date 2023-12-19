package HierarchicalInheritence;

public class Employee extends Person {
   String companyname;
   public void ShowData() {
	   System.out.println(name+ "work at"+companyname);
   }
}
