import java.util.Arrays;

public class Q64 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        int[] numbers = new int[]{1, 2, 3, 4, 6, 7,8};
        System.out.println(" Array values :" + Arrays.toString(numbers));
		int total_num=7;
        int num_sum = 0;

        int missing = total_num * ((total_num + 1) / 2);
        for (int i : numbers) {
            num_sum += i;
        }

        System.out.print("Missing number is : ");
        System.out.print(missing - num_sum);

        
	}

}
