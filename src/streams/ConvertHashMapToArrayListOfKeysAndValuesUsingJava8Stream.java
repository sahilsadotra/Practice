package streams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class ConvertHashMapToArrayListOfKeysAndValuesUsingJava8Stream {
	public static void main(String[] args) {

		// 1. create HashMap object
		Map<Integer, String> map = new HashMap<>();


		// 1.1 add key-value pairs to HashMap
		map.put(1, "India");
		map.put(2, "Japan");
		map.put(3, "China");
		map.put(4, "Oman");
		map.put(5, "Qatar");


		// 1.2 print to console
		System.out.println("Original HashMap : \n" + map);



		// 2. convert HashMap Keys to ArrayList
		ArrayList<Integer> keyList = map
				.keySet()
				.stream()
				.collect(Collectors.toCollection(ArrayList::new));


		// 2.1 print Map keys
		System.out.println("\n\nArrayList of Map keys : \n" + keyList);


		// 3. convert HashMap Keys to ArrayList
		ArrayList<String> valueList = map
				.values()
				.stream()
				.collect(Collectors.toCollection(ArrayList::new));


		// 3.1 print Map keys
		System.out.println("\n\nArrayList of Map values : \n" + valueList);
	}
}
