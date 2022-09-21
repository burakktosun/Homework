package homeWorkHospitalSalary;


	public class Janitor extends employeeInfo implements Person {

		
		
		
		
		public Janitor() {
			super();

		}

		public Janitor(String name, String lastName, String job, double salary) {
			super(name, lastName, job, salary);

		}

		@Override
		public void salaryRaise() {
			double salaryJ =this.salary *1.101;
			setSalary(salaryJ);
		}

		@Override
		public String toString() {
			return "Janitor [name=" + name + ", lastName=" + lastName + ", job=" + job + ", salary=" + salary + "]";
		}
		
	}

