package collections;

import java.util.Properties;
import java.util.Set;
import java.util.Map.Entry;

public class PropertyClass {

	public static void main(String[] args) {
		// Properties class is sub class of HashTable class 
		// (one of Map implementation)
		Properties prop = new Properties();
		prop.setProperty("Tyson", "20282");
		prop.setProperty("Fairfax", "22030");
		prop.setProperty("Centerville", "20120");
		prop.setProperty("Tyson", "20282");
		prop.setProperty("Fairfax", "221560");
		prop.setProperty("Centerville", "20120");
		System.out.println(prop);
		System.out.println(prop.getProperty("Tyson"));
		
        Set<Entry<Object, Object>> entries = prop.entrySet();
		for(Entry<Object, Object> each : entries) {
			System.out.println(each);
		}
		System.out.println(prop
				
				
				);

	}

}
