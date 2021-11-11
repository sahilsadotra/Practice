package streams;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class SortMapEntryUsingComparingByValue {
	public static void main(String[] args) {

		// 1. creating HashMap object of type <String, Integer>
		Map<String, Integer> countryPopulation = new HashMap<>();


		// 1.1 adding key-value pairs to HashMap object
		countryPopulation.put("Indian", 382357386);
		countryPopulation.put("America", 332429717);
		countryPopulation.put("Russia", 146748590);
		countryPopulation.put("Brazil", 213728559);
		countryPopulation.put("Pakistan", 220892331);


		// 1.2 print - before sorting - random order
		System.out.println("Before Sorting - Random order :- \n");


		// 1.3 print Map entries to console
		countryPopulation.forEach((key, value) -> System.out.println(
				"Key : " + key  + "\t\t"  + "Value : "  + value
		));



		// 2. Sorting according to natural order of Map Values
		System.out.println("\n\nSorted according to "
				+ "natural order of Values :- \n");


		// 2.1 Ascending-order sorting using Map.Entry.comparingByValue()
		countryPopulation
				.entrySet()
				.stream()
				.sorted(Map.Entry.comparingByValue())
				.forEach(entry -> System.out.println(
						"Key : " + entry.getKey() + "\t\t"  +
								"Value : " + entry.getValue()
				));



		// 3. Sorting according to reverse order of Map Values
		System.out.println("\n\nSorted according to "
				+ "reverse order of Values :- \n");


		// 3.1 Descending-order sorting using Map.Entry.comparingByValue()
		countryPopulation
				.entrySet()
				.stream()
				.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())) //reverse
				.forEach(entry -> System.out.println(
						"Key : " + entry.getKey() + "\t\t"  +
								"Value : " + entry.getValue()
				));
	}
}
