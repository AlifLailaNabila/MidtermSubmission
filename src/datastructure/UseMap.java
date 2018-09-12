package datastructure;

import java.util.*;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */

		List<String> name = new ArrayList<>();
		name.add("Alif");
		name.add("Laila");
		name.add("Abdul");

		List<String> color = new ArrayList<>();
		color.add("Red");
		color.add("Black");
		color.add("White");




		List<Integer> id = new ArrayList<>();
		id.add(100);
		id.add(200);
		id.add(300);
		Map<String,List<String>> list1 =new LinkedHashMap<String, List<String>>();
		list1.put("name",name);
		list1.put("color", color);


		Map<String,List<Integer>> list2 =new HashMap<String, List<Integer>>();
		list2.put("ID", id);


		for(Map.Entry key: list1.entrySet()){
			System.out.println(key.getKey()+" "+key.getValue());
		}

		for(Map.Entry key: list2.entrySet()){
			System.out.println(key.getKey()+" "+key.getValue());
		}

	}

}
