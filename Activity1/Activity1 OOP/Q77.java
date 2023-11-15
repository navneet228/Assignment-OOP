import java.util.Arrays;

public class Q77 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] array = {1, 2, 3, 4, 5};
	        System.out.println("Original Array: " + Arrays.toString(array));
	        cyclicRotateArray(array);

	        System.out.println("Rotated Array: " + Arrays.toString(array));
	    }

	    private static void cyclicRotateArray(int[] array) {
	        if (array.length <= 1) {
	            return;
	        }

	        int lastElement = array[array.length - 1];

	        for (int i = array.length - 1; i > 0; i--) {
	            array[i] = array[i - 1];
	        }
	        array[0] = lastElement;
	}

}
