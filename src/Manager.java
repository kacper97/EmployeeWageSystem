import java.util.ArrayList;


/**
 * Manager class
 * 
 * @author Kacper Woloszyn
 * @version 20/4/2016
 */

public class Manager extends Employee {
	
	//fields
	
	private double bonus;
	private ArrayList<Employee> deptEmployee;
	private int numberInDept;
	
	 /**
     * Constructor for objects of class Manager.
     * Some of the constructor object, i.e name, lastName and hourlyRate are brought from the super class : Employee.
     * The setter is there to allow minus values in the test as otherwise they would be put in as 0.
     * Array list is created
     */
	
	
	public Manager(String name, String lastName, double hourlyRate, double bonus) {
		super(name, lastName, hourlyRate);
		if(bonus>=0){
			this.bonus=bonus;}
		else{
		this.bonus=0;
		}
		deptEmployee= new ArrayList<Employee>();
	}
	
	//methods to add and delete employees from array
	
	public void addDeptEmployee(Employee employee){
		deptEmployee.add(employee);
	}
	
	public void deleteDeptEmployee(Employee employee){
		deptEmployee.remove(employee);
	}
	
	//setters and getters
	
	
	public void setBonus(double bonus) {
		if(bonus>=0){
			this.bonus=bonus;
		}
	}
	
	public double getBonus() {
		return bonus;
	}
	
	public void setDept(ArrayList<Employee> deptEmployee){
		this.deptEmployee= deptEmployee;
	}

	public ArrayList<Employee> getDept() {
		return deptEmployee;
	}
	
	public void setNumberInDept(int numberInDept) {
		this.numberInDept = numberInDept;
	}
	
	public double getNumberInDept() {
		return numberInDept;
	}

	//each class has a different calculateSalary as for example TempWorkers have bonusPercentage. 
	// calculate salary is now called from the employee class instead of the complicated method below.
	
	public double calculateSalary(double numHours){
		return super.calculateSalary(numHours) + bonus;
		//if(numHours >= 0 ){
			//double calculateOvertime =super.calculateOvertime(numHours);
			//	if(calculateOvertime > 0){
			// (numHours-(calculateOvertime/(super.getHourlyRate()*2)))*super.getHourlyRate()+calculateOvertime +bonus;
			//  }
			//	else {
		//		return numHours*super.getHourlyRate() +bonus;
			//	}
		//	}
		//else{
		// return numHours+bonus;
		//	}
	}
	
	public int numberInDept() {
		numberInDept = deptEmployee.size();
		return numberInDept;
	}
}

