package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Maps {

	public static void main(String[] args) {
		Map<String, String> phoneNumbers = new HashMap<>();
		phoneNumbers.put("Esen", "608-123-4567");
		phoneNumbers.put("sn", "608-123-4567");
		phoneNumbers.put("Hi", "Hello");
		System.out.println("ending");
//		System.out.println(phoneNumbers.get("Esen"));
		
		Set<String>keys = phoneNumbers.keySet();
		for(String key:keys){
			System.out.println(phoneNumbers.get(key));
		}
//		***** Map<K,V> ===> Key && Value *****

	}

}
