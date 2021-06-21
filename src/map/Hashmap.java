package map;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		String s1 = "FB";
		String s2 = "Ea";
		
		System.out.println(s1.hashCode() + "   "+s2.hashCode());
		
		map.put(s1, 1);
		map.put("abc", 3);
		map.put(s2, 2);
		System.out.println("Test");
	}
}