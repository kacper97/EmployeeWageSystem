import java.util.List;


/**
 * Employee Worker class
 * 
 * @author Kacper Woloszyn
 * @version 20/4/2016
 */

public abstract class Employee 
{
	//fields for Employee Super class.
	
	private String firstName;
	private String lastName;
	private double hourlyRate;
	final static double NORMAL_WORKWEEK = 37.5;
	private double numHours;
	private List<String> employees;
	
	
	//Constructor for Employee
	//The hourly Rate has to be equal to 0 or else it will be set up to 0.
	public Employee(String name, String lastName, double hourlyRate)
	{
		firstName = name;
		this.lastName = lastName;
		if(hourlyRate<0){
			hourlyRate = 0;
		}
		else{
			this.hourlyRate = hourlyRate;
		}
	
	}
	
	// Getters and Setters 
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getSecondName() {
		return lastName;
	}

	public void setSecondName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setEmployees(List<String> employees)
    {
    	this.employees = employees;
    }
	
	public List<String> getEmployees()
    {
    	return employees;
    }

	public void setHourlyRate(double hourlyRate)
    {
		if(hourlyRate>=0){
			this.hourlyRate = hourlyRate;
		}
    }
	
	public double getNumHours() {
		return numHours;
	}

	public void setNumHours(double numHours) {
		this.numHours = numHours;
	}
	
	public double getHourlyRate() {
		return hourlyRate;
	}
	
	// lists out all the employees
	
	public String toString(){
		String listEmployees= ( ":" + firstName +" "+  lastName + " and the hourly rate is " + hourlyRate + "\n");
		return listEmployees;
			}
	
	//Method to calculate Salary : If number of hours is less than or equal to 37.5 multiply that by hourly rate.
	// Else an overtime method has to be done.
	
	public double calculateSalary(double numHours){
		if(numHours <= NORMAL_WORKWEEK){
			return numHours*hourlyRate;
			}
			else{
			return NORMAL_WORKWEEK*(hourlyRate)+ calculateOvertime(numHours);
			}
	}
	
	//Overtime method: if number of hours is greater than 37.5 this method is used and returns overtime
	// and also calculates overtime by multiplying it by the double hourly Rate.
	
	public double calculateOvertime(double numHours){
		double overTime =0;
		if(numHours >NORMAL_WORKWEEK)
			{
			overTime = (numHours-NORMAL_WORKWEEK)*(hourlyRate*2);
			}
		else
			{
			overTime = 0;
			}
		return overTime;
	}

	public void addEmployee(Employee employee) {
		employee.addEmployee(employee);
	}

}
	

