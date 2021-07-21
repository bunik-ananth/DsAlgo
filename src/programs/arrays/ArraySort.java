package programs.arrays;

import java.util.SortedSet;
import java.util.TreeSet;

public class ArraySort {

	public static void main(String[] args) {
		int[] arr = {7,2,7,4,3,6,9,4,25,7,8};
		
		SortedSet set = new TreeSet();
		for(int i : arr) {
			set.add(i);
		}	
		
		for (Object sort : set) {
			System.out.print(sort+", ");
		}
	}
}
