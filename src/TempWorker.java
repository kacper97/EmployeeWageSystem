import java.util.ArrayList;


/**
 * Temp Worker class
 * 
 * @author Kacper Woloszyn
 * @version 21/4/2016
 */

public class TempWorker extends Employee {
		//fields
		private ArrayList<Employee> deptEmployee;
		private double numberInDept;
		
		/**
	     * Constructor for objects of class TempWorker.
	     * Some of the constructor object, i.e name, lastName and hourlyRate are brought from the super class : Employee.
	     */
		
		public TempWorker(String name, String lastName, double hourlyRate) {
			super(name, lastName, hourlyRate);
		}

		//getters
		
		public double getNumberInDept() {
			return numberInDept;
		}

		public ArrayList<Employee> getDeptEmployee() {
			return deptEmployee;
		}
		
		//each class has a different calculateSalary as for example Managers have bonuses 
		// calculate salary is now called from the employee class instead of the complicated method below.
		
		public double calculateSalary(double numHours){
		return super.calculateSalary(numHours);
		//public double calculateSalary(double numHours){
			//if(numHours >= 0 ){
				//double calculateOvertime =super.calculateOvertime(numHours);
					//if(calculateOvertime > 0){
						//return ((numHours-(calculateOvertime/(super.getHourlyRate()*2)))*super.getHourlyRate()+calculateOvertime);
					//}
					//else{
						//return numHours*super.getHourlyRate();
					//}
				//}
			//else{
				//return numHours*super.getHourlyRate();
			}
}

 

	