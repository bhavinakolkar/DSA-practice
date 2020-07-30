/**
 * 
 */
package practice.arrays.sort;

/**
 * @author bhavinsuhas
 *
 */
public class ValidateArraySortASC {
	
	public static void main(String[] args) {
		
		int input[] = {4, 30, 24, 3, 3, 2};
		System.out.println("Is input array sorted by ASC ? " + isArraySortedByASC(input));
		int input2[] = {4, 5, 9, 21, 21, 30};
		System.out.println("Is input2 array sorted by ASC ? " + isArraySortedByASC(input2));
		
		
	}
	
	private static boolean isArraySortedByASC(final int[] input) {
		boolean isArraySortedByASC = true;
		for(int i=0; i<input.length - 1; i++) {
			if(input[i] > input[i+1]) {
				isArraySortedByASC = false;
				break;
			}
		}
		return isArraySortedByASC;
	}

}
