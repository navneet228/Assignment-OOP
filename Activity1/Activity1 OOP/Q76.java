import java.util.Arrays;

public class Q76 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] array = {3,8,9,6};

	        int triangleCount = countTriangles(array);
	        System.out.println("Number of possible triangles: " + triangleCount);
	    }

	    private static int countTriangles(int[] array) {
	        Arrays.sort(array);

	        int triangleCount = 0;

	        for (int i = 0; i < array.length - 2; i++) {
	            for (int j = i + 1; j < array.length - 1; j++) {
	                for (int k = j + 1; k < array.length; k++) {
	                    if (array[i] + array[j] > array[k]) {
	                        triangleCount++;
	                    } else {
	                        break;
	                    }
	                }
	            }
	        }

	        return triangleCount;
	}

}
