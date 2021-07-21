package algorithm.search;

import java.util.Arrays;

public class RecursiveBinarySearch {

	public static void main(String[] args) {
		int[] array = {1,23,4,2,5,7,8,99,4,66,-1};
		Arrays.sort(array);
		System.out.println(recursiveSearch(array, 0, array.length, -1));
	}

	
	public static boolean recursiveSearch(int[] array, int start, int end, int value) {
		if(start>=end)
			return false;
		int midpoint = (start+end)/2;
		
		if(array[midpoint] == value) {
			return true;
		}
		else if(value>midpoint) {
			return recursiveSearch(array, midpoint+1, end, value);
		}
		else {
			return recursiveSearch(array, start, midpoint, value);
		}
	}
}
