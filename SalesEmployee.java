package salesEmployee;

import java.io.Serializable;

@SuppressWarnings("serial")
public abstract class SalesEmployee implements Serializable {

	//This program is used to Calculate the reward for the employees
	
	private String firstName,ppsNumber;
	private String lastName;
	
	protected double sales;
	protected double commission;
	
	
	private static int bikeEmployeeNumber = 0000; //Every time you call constructor, this ++
	private int employeeNumber;


	public SalesEmployee() {
	
		firstName="?";
		lastName="?";
		ppsNumber="0000";
		sales=0000;
		commission=0;
		employeeNumber = ++bikeEmployeeNumber;
}

	public SalesEmployee(String firstName, String lastName, String ppsNumber) {

	this.firstName=firstName;
	this.lastName=lastName;
	this.ppsNumber=ppsNumber;
	this.employeeNumber = ++bikeEmployeeNumber;

	}

	//Using setter to set the values of the Variables 
	public void setFirstName(String firstName) {

	this.firstName = firstName;

	}
	
	public void setLastName(String lastName) {
	this.lastName = lastName;
	}
	
	
	public void setPPS(String ppsNumber) {

	this.ppsNumber = ppsNumber;

	}

	
	//Using getter to get the Values of the variables
	
	public String getFirstName() {

	return this.firstName;

	}
	

	public String getLastName() {

	return this.lastName;

	}
	
	public String getPPS() {

	return this.ppsNumber;

	}

	public int getEmployeeNumber() {

	return employeeNumber;

	}

	//Override toString method for the driver class
	public String toString() {

	return "Employee First Name: " + getFirstName() +" "+ "Employee Last Name: " + getLastName() +" "+ "PPS Number: " + getPPS() +" "+

	"Employee Number: " +" "+ getEmployeeNumber();

	}

	//Abstract void method to be implemented in the subclasses
	abstract void calculateCommission();	

}//End of Class
