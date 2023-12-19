package HierarchicalInheritence;

public class ContractualEmployee extends Employee {
               public double hourlyRate;
               public double noOfHours;
               
               public void displayData() {
System.out.println(name+ "is hired by" +companyname+ "and earned upto"+(hourlyRate*noOfHours));
               }
               
               
               
               
               
               
}
