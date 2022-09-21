package homeWorkHospitalSalary;

public class Nurse extends employeeInfo implements Person { 

	
	
	
	
	public Nurse() {
		super();

	}

	public Nurse(String name, String lastName, String job, double salary) {
		super(name, lastName, job, salary);

	}

	@Override
	public void salaryRaise() {
		double salaryN = this.salary*1.2;
		setSalary(salaryN);
	
}

	@Override
	public String toString() {
		return "Nurse [name=" + name + ", lastName=" + lastName + ", job=" + job + ", salary=" + salary + "]";
	}
}