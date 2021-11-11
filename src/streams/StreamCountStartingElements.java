package streams;

import java.util.ArrayList;
import java.util.List;

public class StreamCountStartingElements {
	public static void main(String[] args) {

		// list of String elements
		List<String> companies = new ArrayList<>();
		companies.add("Tata Motor");
		companies.add("Tata Power");
		companies.add("Tata Steel");
		companies.add("Tata Chemicals");
		companies.add("Tata Capital");
		companies.add("Tata Sky");
		companies.add("Titan");
		companies.add("Birla");
		companies.add("Adani");
		companies.add("Reliance");
		companies.add("Mittal");

		// get count for companies starting with alphabet 'T'
		long count = companies
				.stream()
				.filter(company -> company.startsWith("T"))
				.count();

		// print to console
		System.out.println("count for companies "
				+ "starting with alphabet 'T' = " + count);
	}

}
