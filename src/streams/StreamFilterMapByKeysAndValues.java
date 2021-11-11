package streams;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamFilterMapByKeysAndValues {
	public static void main(String[] args) {

		// Map - Rank of top Cricket Nations
		Map<Integer, String> rankOfCricketNations = new
				HashMap<Integer, String>();

		// add nations - August-2021 test rankings
		rankOfCricketNations.put(1, "New Zealand");
		rankOfCricketNations.put(2, "India");
		rankOfCricketNations.put(3, "Australia");
		rankOfCricketNations.put(4, "England");
		rankOfCricketNations.put(5, "Pakistan");
		rankOfCricketNations.put(6, "South Africa");
		rankOfCricketNations.put(7, "West Indies");

		// iterate and print original Map
		System.out.println("All Cricket nations are :-\n");
		for(Map.Entry<Integer, String> entry : rankOfCricketNations.entrySet()) {
			System.out.println("Rank: " + entry.getKey()
					+ "\tCountry: " + entry.getValue());
		}

		// filter top 3 nation by its Rank(key)
		Map<Integer, String> filteredMap = rankOfCricketNations
				.entrySet()
				.stream()
				.filter(entry -> entry.getKey() <= 3 && entry.getValue().startsWith("I"))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

		// Iterate and print to console after filtering
		System.out.println("\n\nCountry starts with 'I' and Rank under 3 :-\n");
		filteredMap
				.entrySet()
				.stream()
				.forEach(entry -> System.out.println("Rank: " + entry.getKey()
						+ "\tCountry: " + entry.getValue()));
	}
}
