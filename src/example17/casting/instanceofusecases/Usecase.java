package example17.casting.instanceofusecases;
class Person {
	String name;
}
class Employee extends Person{
	String JobTitle;
}
class Student extends Person{
	String Subject;
}
class DataBase{
	public Person getData(Person person) {
		if(person instanceof Employee) {
			Employee employee=new Employee();
			employee.JobTitle="software Engineer";
			return employee;}
			
		
		else if(person instanceof Student) {
				Student student = new Student();
				student.Subject="maths";
				return student;}
				else {
					return null; }
				}
			}
		
	


public class Usecase {
	public static void main(String[] args) {
		
      DataBase database=new DataBase();//it will ask database to give me employee record
	  Employee emp=new Employee();//i will ask database to give me student record
		emp=(Employee)database.getData(emp);
        System.out.println(emp.JobTitle);
        
        Student student = new Student();
        student = (Student)database.getData(student);
        System.out.println(student.Subject);
        
		
		
	}

}
