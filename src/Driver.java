import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * Driver
 * 
 * @author Kacper Woloszyn
 * @version 22/4/2016
 */

public class Driver
{
	private Scanner sc = new Scanner(System.in);
	private List<Employee> employees;
	
	public Driver(){
		employees= new ArrayList<Employee>();
	}
	
	//starting the driver
	
    public static void main(String[] args) 
    {
        Driver app = new Driver();
        app.run();
    }
    
    //menu of driver
   
    	private int mainMenu()
    	{
		System.out.println("  1) Add a Manager");
		System.out.println("  2) Add a Temp Worker");
		System.out.println("  3) Add a Sales Worker");
		System.out.println("  4) List all Employees");
		System.out.println("  5) Calculate Salary for one Employee");
		System.out.println("  6) Calculate Salary for total number of Employee's");
		System.out.println("  7) Assign to department");
		System.out.println("  8) Number of people in department");
		System.out.println("  9) Delete from Department");
        System.out.println(" ---------");
        System.out.println("0) Exit");
        System.out.print("==>>");
        int option = sc.nextInt();
        return option;
    	}
    	
     // cases behind the statements from above
        
        private void run(){
        
        	System.out.println("Employees");
    		int option = mainMenu();
    		while (option != 0)
    		{	
    			switch (option)
    			{
    			case 1:
    				addManager();
    				break;
    			case 2:
    				addTempWorker();
    				break;
    			case 3:
    				addSalesWorker();
    				break;
    			case 4:
    				int index=1;
    				if (employees.size() ==0){
    					System.out.println("No Employees.");
    				}
    				else{
    				for(Employee employee: employees){
    					System.out.println(index+employee.toString());
    					index++;
    				}
    				}
    				break;
    			case 5:
    				calculateSalaryOne();
    				break;
    			case 6:
    				calculateSalaryTotal();
    				break;
    			case 7:
    				addDeptEmployee();
    				break;
    			case 8:
    				numberInDept();
    				break;
    			case 9:
    				deleteDeptEmployee();
    				break;
    			default:
    				System.out.println("Invalid option selected.");
    				break;
    			}

    			System.out.println("");
    			option = mainMenu();
    		}
    		System.out.println("Exiting... bye");
    	 }
       
        //adds manager to the array list of employee

		public void addManager()   {
            System.out.println("Please enter the employee's name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Please enter the employee's second name : ");
            String secondName = sc.nextLine();
            System.out.println("Please enter the employee's hourly rate : "); 
            double hourlyRate = sc.nextDouble();
            System.out.println("Please enter the manager's bonus");
            double bonus = sc.nextDouble();
            sc.nextLine();
            employees.add(new Manager(name, secondName, hourlyRate, bonus));
			
        }

		//adds salesWorker to the array list of employee
		
        public void addSalesWorker()  {
            System.out.println("Please enter the employee's name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Please enter the employee's second name : ");
            String secondName = sc.nextLine();
            System.out.println("Please enter the employee's hourly rate : "); 
            double hourlyRate = sc.nextDouble();
            System.out.println("Please enter the employee's bonus percentage : ");
            double bonusPercentage = sc.nextDouble();
            
            employees.add(new SalesWorker(name, secondName, hourlyRate, bonusPercentage));
          }
        
      //adds tempWorker to the array list of employee

        public void addTempWorker() {
        	System.out.println("Please enter the employee's name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Please enter the employee's second name : ");
            String secondName = sc.nextLine();
            System.out.println ("Please enter the employee's hourly rate : "); 
            double hourlyRate = sc.nextDouble();

            employees.add(new TempWorker(name, secondName, hourlyRate));
        }
        
      //Calculates salary for one employee by using scanner input and the method from employee super class
        
        public void calculateSalaryOne(){
        	int index=1;
        	for(Employee employee: employees){
        	System.out.println(index+employee.toString());
        	}
        	System.out.println("Type in the employees number minus one ( small maths exercise )");  // couldn't get the index to match up 
        	sc.nextLine();
        	int c= sc.nextInt();  	
        	Employee e = employees.get(c);
        	System.out.println(" Type in how many hours this employee worked");
        	double h= sc.nextDouble();
        	double sal= e.calculateSalary(h);
        	System.out.println(sal);
        }
        
      //Calculates salary for more than one employee by using scanner input and the method from employee super class
        
        public void calculateSalaryTotal(){
        	int index=1;
        	for(Employee employee: employees){
        	System.out.println(index+employee.toString());
        	}
        	System.out.println("Type in the employees number minus one ( small maths exercise )"); // couldn't get the index to match up 
        	sc.nextLine();
        	int c= sc.nextInt();  	
        	Employee e = employees.get(c);
        	int em = employees.size();
        	System.out.println(" Type in how many hours all employees worked");
        	double hours = sc.nextDouble();
        	double sala= em*e.calculateSalary(hours);
        	System.out.println(sala);
        }

        /**
         * All of the classes below failed to give me the thing i asked for
         *
         */

        
        
        public void addDeptEmployee(){
        	if (employees.size()== 0){
        		System.out.println(" There are no employees");
        		}
        	else {
        		//Manager.addDeptEmployee(employees);	
        	}
        }
        
        public void numberInDept(){
        	if (employees.size()== 0){
        		System.out.println(" There are no employees");
        		}
        	else{
        		//double e =Manager.getNumberInDept(double);
        		//System.out.println(e);
        	}
        }
        
        public void deleteDeptEmployee(){
        	if (employees.size()== 0){
        		System.out.println(" There are no employees");
        	}
        	else{
        		//double x = Manager.deleteDeptEmployee();
        		//System.out.println(x);
        }
      }
}



