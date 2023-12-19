package entities.sub;

import entities.Employee;

public class RegularEmployee extends Employee {
	private double salaries;
	private double incentives;
	public RegularEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RegularEmployee(int id, String name1, double salaries, double incentives) {
		super(id, name1);
		this.salaries = salaries;
		this.incentives = incentives;
	}
	public double getSalaries() {
		return salaries;
	}
	public void setSalaries(double salaries) {
		this.salaries = salaries;
	}
	public double getIncentives() {
		return incentives;
	}
	public void setIncentives(double incentives) {
		this.incentives = incentives;
	}
	

}
