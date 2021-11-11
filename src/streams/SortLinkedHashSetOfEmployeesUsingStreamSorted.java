package streams;

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SortLinkedHashSetOfEmployeesUsingStreamSorted {
	public static void main(String[] args) {

		// 1. create LinkedHashSet
		Set<Employee> employees = new LinkedHashSet<>();


		// 1.1 add Employees to LHS
		employees.add(new Employee(101, "Saranya", 85000L));
		employees.add(new Employee(102, "ThenMozhi", 57000L));
		employees.add(new Employee(103, "Amudha", 49000L));
		employees.add(new Employee(104, "Pushpa", 24000L));
		employees.add(new Employee(105, "Bhagyalakshmi", 29000L));
		employees.add(new Employee(106, "Meena", 38000L));


		// 1.2 original LinkedHashSet in insertion order
		System.out.println("1. Original LinkedHashSet "
				+ "as per insertion-order :- \n");
		employees.forEach(System.out::println);


		// 2. Sorting Employee - increasing salary
		System.out.println("\n2. Sorted Employee LinkedHashSet -"
				+ " according to increasing salary :- \n");


		// 2.1 sort using Stream - increasing-order of salary
		employees
				.stream()
				.sorted(Comparator.comparingLong(Employee::getSalary))
				.forEach(System.out::println);


		// 3. Sorting Employee - increasing salary
		System.out.println("\n3. Reverse sorted Employee LinkedHashSet -"
				+ " according to descending Id :- \n");


		// 3.1 sort using Stream - reverse-order of employee Id
		employees
				.stream()
				.sorted(Comparator.comparingInt(Employee::getId).reversed())
				.forEach(System.out::println);
	}
}
