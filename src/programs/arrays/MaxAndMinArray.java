package programs.arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;


public class MaxAndMinArray {

	public static void main(String[] args) {
		int[] array = {122,34,4,35,6,71,0,-1798798798};
		checkMaxAndMin(array);
	}
	
	public static void checkMaxAndMin(int[] array) {
		int min = array[0];
		int max = array[0];
		
		for(int i=0; i<array.length; i++) {
			if(array[i]<min)
				min= array[i];
			else if (array[i]>max) {
				max=array[i];
			}
		}
		System.out.println(min);
		System.out.println(max);		
	}
}
