package set.hashset;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class HashSetImpl {

	private final int Max_VALUE = 10000000;
	private final int ARRAY_SIZE = 100;
	private List<List<Integer>> parentList;
	
	public HashSetImpl(){
		parentList = new ArrayList<>(ARRAY_SIZE);
		for(int i=0; i<ARRAY_SIZE; i++) {// add sysout
			parentList.add(null);// just to create 100 bucket in my list
		}
	}
	
	public boolean add(int key) {
		int index = key % ARRAY_SIZE;
		List<Integer> childList = parentList.get(index);
		if(childList == null) {
			List<Integer> list = new LinkedList();
			list.add(key);
			parentList.set(index, list);
			return true;
		}
		
		else {
			if(!childList.contains(key)) {
				childList.add(key);
				return true;
			}
		}
		return false;
	}

	public boolean remove(int key) {
		int index = key % ARRAY_SIZE;
		List<Integer> childList = parentList.get(index);
		if(childList != null || childList.isEmpty()) {
			childList.remove(Integer.valueOf(key));// to remove the value not the index(bucket or location)
			return true;
		}
		return false;
	}
	
	public boolean contains(int key) {
		int index = key % ARRAY_SIZE;
		List<Integer> childList = parentList.get(index);
		return childList != null && childList.contains(key);
	}
	
	public static void main(String[] args) {
		HashSetImpl map = new HashSetImpl();
		System.out.println(map.add(100));
		System.out.println(map.add(100));
		System.out.println(map.remove(100));
		System.out.println(map.remove(10));
		
	}
}
