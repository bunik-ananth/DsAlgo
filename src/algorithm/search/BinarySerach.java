package algorithm.search;

import java.util.Arrays;

/**
 * 
 * @author Ananth
 * 
 *Data Must be sorted
 *Choose the element in the middle of the array and compares it against the search value
 *If the element is equal to the value we are done
 *If the element is greater than the value, search the left half of the array
 *If the element is lesser than the value, search the right half of the array
 *It can be implemented recursively
 *O(logn) because it keeps dividing the array in half
 */
public class BinarySerach {

	public static void main(String[] args) {
		int array[] = {1,4,2,6,9,3,-22,11};
		System.out.println(binarySearch(array, -22));
	}
	
		
	public static boolean binarySearch(int[] array, int number) {
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		int start = 0;
		int end = array.length;
		
		while(end>start) {
			int midpoint = (start+end)/2;
			System.out.println("midpoint-"+midpoint);
			if(array[midpoint] == number)
				return true;
			else if(number>array[midpoint])
				start = midpoint+1;
			else
				end = midpoint;
		}
		return false;
	}
}
