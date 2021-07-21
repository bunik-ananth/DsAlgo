package programs.arrays;

import java.util.Iterator;

/*
 * Dutch National Flag Algorithm
 * Link:  https://www.youtube.com/watch?v=oaVa-9wmpns&ab_channel=takeUforward
 */
public class SortAnArrayof0s1s2sUsingAlgo {

	public static void main(String[] args) {
		int[] array = {0,1,2,0,2,0,1,0,2,1,2,1,0};
		sort(array);
		for (int i : array) {
			System.out.println(i+",");
		}
	}
	
	public static void sort(int[] array) {
		int low = 0;
		int mid = 0;
		int high = array.length-1;
		int temp;
		
		while(mid<=high) {
			switch (array[mid]) {
			case 0: {
				temp = array[low];
				array[low] = array[mid];
				array[mid] = temp;
				low++;
				mid++;
				break;
			}
			
			case 1:{
				mid++;
				break;
			}
			
			case 2:{
				temp = array[mid];
				array[mid] = array[high];
				array[high]= temp;
				high--;
				break;
			}
			}
			
		}
	}
}
