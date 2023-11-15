import java.util.HashMap;

public class Q74 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1, 2, 4, 5, 6};

        int targetValue = 6;
        findSumPair(array, targetValue);
    }

    private static void findSumPair(int[] array, int targetValue) {
        HashMap<Integer, Integer> differenceMap = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            int currentElement = array[i];
            int difference = targetValue - currentElement;

            if (differenceMap.containsKey(difference)) {
                int index = differenceMap.get(difference);

                System.out.println("Pair of elements whose sum equals the target value:");
                System.out.println("Element 1: " + array[index] + " at index " + index);
                System.out.println("Element 2: " + currentElement + " at index " + i);

                return; // Stop after finding the first pair
            }

            differenceMap.put(currentElement, i);
        }

        // If no pair is found
        System.out.println("No pair found with the given sum in the array.");
	}
}
