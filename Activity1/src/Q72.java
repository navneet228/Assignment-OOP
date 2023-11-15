import java.util.Arrays;

public class Q72 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int[] array = {10,10,60,60,50,80,80};

	        // Remove duplicates and get the updated array length
	        int updatedLength = removeDuplicates(array);

	        System.out.println("Original array: " + Arrays.toString(array));
	        System.out.println("Updated array after removing duplicates: " + Arrays.toString(Arrays.copyOf(array, updatedLength)));
	        System.out.println("Updated array length: " + updatedLength);
	    }

	    private static int removeDuplicates(int[] array) {
	        if (array.length == 0 || array.length == 1) {
	            return array.length; // No duplicates to remove
	        }

	        Arrays.sort(array);

	        int updatedLength = 1;
	        int lastUniqueElement = array[0];

	        for (int i = 1; i < array.length; i++) {
	            if (array[i] != lastUniqueElement) {
	                array[updatedLength] = array[i];
	                lastUniqueElement = array[i];
	                updatedLength++;
	            }
	        }

	        return updatedLength;
       	}

}
