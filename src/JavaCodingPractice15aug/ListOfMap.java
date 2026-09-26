package JavaCodingPractice15aug;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ListOfMap {

	public static void main(String[] args) {
		List<Map<String, String>> testData = new ArrayList<>();

		Map<String, String> data1 = new LinkedHashMap<>();
		data1.put("username", "user1");
		data1.put("password", "pass1");

		Map<String, String> data2 = new LinkedHashMap<>();
		data2.put("username", "user2");
		data2.put("password", "pass2");

		testData.add(data1);
		testData.add(data2);
		
		System.out.println(testData);
		
		for (Map<String, String> data : testData) {
		    System.out.println(data.get("username"));
		    System.out.println(data.get("password"));
		}

	}

}
