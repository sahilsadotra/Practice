package streams;

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SortLinkedHashSetOfStringUsingStream {
	public static void main(String[] args) {

		// 1. create LinkedHashSet
		Set<String> names = new LinkedHashSet<>();


		// 1.1 add names to LHS
		names.add("Saranya");
		names.add("Karthika");
		names.add("Amudha");
		names.add("Pushpa");
		names.add("Bhagyalakshmi");
		names.add("Meena");


		// 1.2 original LinkedHashSet in insertion order
		System.out.println("1. Original LinkedHashSet<String> "
				+ "as per insertion-order :- \n");
		names.forEach(System.out::println);


		// 2. Sorting Alphabetical order
		System.out.println("\n2. Alphabetically sorted-order "
				+ "of LinkedHashSet<String> :- \n");


		// 2.1 sort using Stream - alphabetical order
		names
				.stream() // get sequential stream
				.sorted() // alphabetical sorting
				.forEach(System.out::println); // print


		// 3. Sorting Reverse Alphabetical order
		System.out.println("\n3. Reverse alphabetically sorted-order "
				+ "of LinkedHashSet<String> :- \n");


		// 3.1 sort using Stream - reverse alphabetical order
		names
				.stream() // get sequential stream
				.sorted(Comparator.reverseOrder()) // reverse alphabetical sorting
				.forEach(System.out::println); // print
	}
}
