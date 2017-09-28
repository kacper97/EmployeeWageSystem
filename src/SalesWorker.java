import java.util.ArrayList;


/**
 * Sales Worker class
 * 
 * @author Kacper Woloszyn
 * @version 20/4/2016
 */

public class SalesWorker extends Employee {
		//fields
	    private double bonusPercentage;
		private ArrayList<Employee> deptEmployee;
		private double numberInDept;
		
		 /**
	     * Constructor for objects of class SalesWorker.
	     * Some of the constructor object, i.e name, lastName and hourlyRate are brought from the super class : Employee.
	     * The setter is there to allow minus values in the test as otherwise they would be put in as 0.
	     */
		
		public SalesWorker(String name, String lastName, double hourlyRate, double bonusPercentage) {
			super(name, lastName, hourlyRate);
			if(bonusPercentage>=0){
				if(bonusPercentage<=20){
					this.bonusPercentage=bonusPercentage;
				}
			}
		else{
				bonusPercentage = 0;
			}
			this.bonusPercentage=bonusPercentage;
 		}
		
		//getters and setters for Departments and Percentages.
		
		public double getNumberInDept() {
			return numberInDept;
		}

		public ArrayList<Employee> getDeptEmployee() {
			return deptEmployee;
		}

		public double getBonusPercentage() {
			return bonusPercentage;
		}
		
		public void setBonusPercentage(double bonusPercentage) {
			if(bonusPercentage>=0){
				if(bonusPercentage<=20){
					this.bonusPercentage=bonusPercentage;
				}
			}
		else{
				bonusPercentage = 0;
			}
		}
		
		// calculate salary is now called from the employee class instead of the complicated method below.
		
		public double calculateSalary(double numHours){
			return super.calculateSalary(numHours) + bonusPercentage;
			
			/**
			*
			*Old method to calculate salary, which took away number of hours from overtime without getting paid.
			* 
			*if(numHours >= 0 ){
				*double calculateOvertime =super.calculateOvertime(numHours);
					*if(calculateOvertime > 0){
						*return ((numHours-(calculateOvertime/(super.getHourlyRate()*2)))*super.getHourlyRate()+calculateOvertime)*bonusPercentage;
					*}
					*else{
					*return numHours*super.getHourlyRate() *bonusPercentage;
					*}
			*	}
			* else{
			 *return numHours*bonusPercentage;
			 */
		
		}
  }
