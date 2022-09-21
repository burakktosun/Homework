package homeWorkHospitalSalary;


public class Doctor extends employeeInfo implements Person {

	
	
	
	public Doctor() {
		super();

	}

	public Doctor(String name, String lastName, String job, double salary) {
		super(name, lastName, job, salary);

	}

	@Override
	public void salaryRaise() {
		double salaryD = this.salary*1.4;
		setSalary(salaryD);
	
	}

	@Override
	public String toString() {
		return "Doctor [name=" + name + ", lastName=" + lastName + ", job=" + job + ", salary=" + salary + "]";
	}

	
}
