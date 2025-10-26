package lesson46_sortedmaps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

class Temp {
	
}

public class SortedMapsPractice {

	public static void main(String[] args) {
		//순서 보장 X
		Map<Integer, String> hashMap = new HashMap<Integer, String>();
		// 입력한 순서 유지
		Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
		// 키를 자동 정렬 (오름차순)
		Map<Integer, String> treeMap = new TreeMap<Integer, String>();
		
		testMap(treeMap);

	}
	
	public static void testMap(Map<Integer, String> map) {
		map.put(9, "fox");
		map.put(4, "cat");
		map.put(8, "dog");
		map.put(1, "giraffe");
		map.put(0, "swan");
		map.put(15, "bear");
		map.put(6, "snake");
		
		for(Integer key: map.keySet()) {
			String value = map.get(key);
			
			System.out.println(key + ": " + value);
		}
	}

}