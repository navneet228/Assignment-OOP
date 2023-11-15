 import java.util.Arrays;

public class Q70 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] array_nums = {10, 77, 10, 54, -11,14,5, 10};

        // Print the original array.
        System.out.println("Original Array: " + Arrays.toString(array_nums));

        // Define the search number and the fixed sum.
        int search_num = 10;
        int fixed_sum = 30;
        System.out.println("Result: " + result(array_nums, search_num, fixed_sum));
    }	
    public static boolean result(int[] numbers, int search_num, int fixed_sum) {
        int temp_sum = 0;

        for (int number : numbers) {
            if (number == search_num) {
                temp_sum += search_num;
            }

            if (temp_sum > fixed_sum) {
                break;
            }
        }

        return temp_sum == fixed_sum;
	}

}
