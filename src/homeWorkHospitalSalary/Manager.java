package homeWorkHospitalSalary;

public class Manager extends employeeInfo implements Person {
	
	
	
	
	
	public Manager() {
		super();

	}

	public Manager(String name, String lastName, String job, double salary) {
		super(name, lastName, job, salary);

	}

	@Override
	public void salaryRaise() {
		double salaryM = this.salary *1.3;
		setSalary(salaryM);

}

	@Override
	public String toString() {
		return "Manager [name=" + name + ", lastName=" + lastName + ", job=" + job + ", salary=" + salary + "]";
	}

}

