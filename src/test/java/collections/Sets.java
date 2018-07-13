package collections;

import java.util.HashSet;
import java.util.Set;

public class Sets {
	
	static Set<String> names = new HashSet<>();
	public static void main(String[] args) {
//		Set --> HashSet
		Set<String>values = new HashSet<String>();
		values.add("School");
		values.add("Car");
		values.add("Cat");
		values.add("Car");
		
		boolean schoolCheck = values.contains("School");
		System.out.println("Check:" + schoolCheck);
				
		for (String value : values) {
			System.out.println(value);
		}
		System.out.println("Size:" + values.size());
	}
		
		public static void addValue(String name){
			if(names.contains(name)) {
				System.out.println("Name: " + name + "already exists in the set");
				throw new RuntimeException();
			}
			System.out.println("Adding the name: " + name);
			names.add(name);
	}

}
