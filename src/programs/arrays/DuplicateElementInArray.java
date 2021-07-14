package programs.arrays;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElementInArray {

	public static void main(String[] args) {
		int array[] = {1,2,3,4,5,5,6,7,4,6};
		Set set = new HashSet();
		for(Integer number : array) {
			if(!set.add(number)) {
				System.out.println("Duplicate-->"+number);
			}
		}		
	}
}


