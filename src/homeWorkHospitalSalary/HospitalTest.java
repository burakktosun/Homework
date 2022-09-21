package homeWorkHospitalSalary;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HospitalTest {

	public static void main(String[] args) {

		List<Person> employeeList = new ArrayList<>();
	
		
		employeeList.add(new Doctor("Gregory" , "House" , "Doctor", 16000));
		employeeList.add(new Doctor("Fatih" , "Tekke" , "Doctor", 14000));
		employeeList.add(new Manager("Bedri" , "Baykam" , "Manager", 12000));
		employeeList.add(new Manager("Sena" , "Tirt" , "Manager", 10000));
		employeeList.add(new Nurse("Nursel" , "Birsel" , "Nurse", 8000));
		employeeList.add(new Nurse("Ozan" , "Akyol" , "Nurse", 9000));
		employeeList.add(new Janitor("Hasan" , "Terim" , "Janitor", 6000));
		employeeList.add(new Janitor("Enes" , "Ozkan" , "Janitor", 6000));


		employeeList.stream().forEach(list -> System.out.println(list));
		
		System.out.println("-------------------");

		List<Person> managerList = employeeList.subList(2, 4);
		managerList.stream().forEach(traveler -> System.out.println(traveler));
		
		employeeList.stream().forEach(t-> t.salaryRaise());
		managerList.stream().forEach(t -> t.salaryRaise());

		System.out.println("\n\n--------zamdan sonra--------");
		employeeList.stream().forEach(traveler -> System.out.println(traveler));
		System.out.println("--------zamdan sonra--------");
		managerList.stream().forEach(traveler -> System.out.println(traveler));
		
	}
}
