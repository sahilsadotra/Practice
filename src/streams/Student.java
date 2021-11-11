package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Student {
	// member variables
	String name;
	double percentage;
	String department;

	// public parameterized constructor
	public Student(String name, double percentage, String department) {
		super();
		this.name = name;
		this.percentage = percentage;
		this.department = department;
	}

	// getter and setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
}
