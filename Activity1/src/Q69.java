import java.util.Arrays;

public class Q69 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array_nums = {12,33,44,55,28,11,16};;

        System.out.println("Original Array: " + Arrays.toString(array_nums));
        System.out.println("integers is without 0 and -1 : " + test(array_nums));
    }
    public static boolean test(int[] numbers) {
        for (int number : numbers) {
            if (number == 0 || number == -1) {
                return false;
            }
        }
        return true;
	}

}
