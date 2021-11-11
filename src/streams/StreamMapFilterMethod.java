package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapFilterMethod {
	public static void main(String[] args) {

		System.out.println("First class Student percentage : \n");

		List<Student> studentList = Arrays.asList(
				new Student("Vanita", 62, "Arts"),
				new Student("Rajesh", 55, "Commerce"),
				new Student("Naresh", 73, "Science"),
				new Student("Shiva", 64, "Arts"),
				new Student("Dinesh", 72, "Science"),
				new Student("Suresh", 50, "Commerce"),
				new Student("Radhika", 61, "Science")
		);

		// map and distinct
		List<Double> newList = studentList
				.stream() // 1. get stream
				.map(s -> s.getPercentage()) // 2.1 get percentage
				.filter(p -> p > 60) // 2.2 filter first class student
				.collect(Collectors.toList());

		// print to console
		newList.forEach(System.out::println);
	}
}
