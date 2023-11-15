import java.util.Arrays;

public class Q83 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] array = {44,33,2,42,5,89,66,8,10};

	        // Separate even and odd numbers and display the result
	        separateEvenAndOdd(array);
	        System.out.println("Array after separating even and odd numbers: " + Arrays.toString(array));
	    }

	    private static void separateEvenAndOdd(int[] array) {
	        int left = 0;
	        int right = array.length - 1;

	        while (left < right) {
	            while (left < right && array[left] % 2 == 0) {
	                left++;
	            }

	            while (left < right && array[right] % 2 != 0) {
	                right--;
	            }

	            if (left < right) {
	                int temp = array[left];
	                array[left] = array[right];
	                array[right] = temp;
	            }
	        }
	}

}
