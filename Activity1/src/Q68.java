import java.util.Arrays;

public class Q68 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {12,32,44,57,28,11,16};
        System.out.println("Original Array: " + Arrays.toString(arr));

        int largest = arr[0];
        int smallest = arr[0];
        float sum = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            sum += arr[i];
            if (arr[i] > largest)
            	largest = arr[i];
            else if (arr[i] < smallest)
            	smallest = arr[i];
        }

        double x = ((sum - largest - smallest) / (arr.length - 2));
        System.out.printf("sum of integers except the largest and smallest values: ", x);

	}

}
