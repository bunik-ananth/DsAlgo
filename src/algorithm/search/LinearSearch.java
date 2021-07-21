package algorithm.search;

/**
 * 
 * @author Ananth
 * Time complexity is o(n), if the value is at the end it should compare all the value
 */

public class LinearSearch {

	public static void main(String[] args) {
		int array[] = {1,2,4,5,6,8,-2,9,3,-11,22};
		System.out.println(linearSearch(array, 12));// not found
		System.out.println(linearSearch(array, 22));
		System.out.println(linearSearch(array, -11));
		
	}
	
	public static int linearSearch(int[] array, int number) {
		for(int i=0; i<array.length; i++) {
			if(array[i]== number)
				return i;
		}
		return -1;
	}
}
