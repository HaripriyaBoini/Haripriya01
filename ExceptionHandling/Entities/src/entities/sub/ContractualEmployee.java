package entities.sub;

import entities.Employee;

public class ContractualEmployee extends Employee {
private int noOfHours;
private double ratePerHour;
public ContractualEmployee() {
	super();
	
}
public ContractualEmployee(int id, String name1, int noOfHours, double ratePerHour) {
	super(id, name1);
	this.noOfHours = noOfHours;
	this.ratePerHour = ratePerHour;
}
public int getNoOfHours() {
	return noOfHours;
}
public void setNoOfHours(int noOfHours) {
	this.noOfHours = noOfHours;
}
public double getRatePerHour() {
	return ratePerHour;
}
public void setRatePerHour(double ratePerHour) {
	this.ratePerHour = ratePerHour;
}
@Override
public String toString() {
	return "ContractualEmployee [noOfHours=" + noOfHours + ", ratePerHour=" + ratePerHour + "]";
}


}
