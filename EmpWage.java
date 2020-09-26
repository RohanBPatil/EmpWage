package EmpWage;

public class EmpWage {
	public static void main(String[] args) {
		
		System.out.println("Welcome To Employee Wage Computation");
		
		//constants
		int is_part_time = 1;
		int is_full_time = 2;
		int emp_wage_per_hr = 20;
		int working_days_per_month = 20;
		//variables
		int empHrs = 0;
		int empWage = 0;
		int total_empWage = 0;
		//computation
		for(int day=0; day<working_days_per_month; day++) {
			int empCheck = (int)Math.floor(Math.random() * 10) % 3;
			
			switch(empCheck) {
			case 1:
				empHrs = 8;
				break;
			case 2:
				empHrs = 8;
				break;
			default:
				empHrs = 0;
				break;
			}
			empWage = emp_wage_per_hr * empHrs;
			total_empWage += empWage;
			System.out.println("Employee Wage : "+empWage);
		}
		System.out.println("Total Employee Wage : "+total_empWage);
		
	}
}
