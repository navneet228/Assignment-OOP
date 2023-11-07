
public class Q66 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {12,33,44,56,29,13,16};
        int num = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0)
            	num++;
            System.out.print(" "+arr[i]);
        }
        System.out.println();
        System.out.println("Number of even numbers : " + num);
        System.out.println("Number of odd numbers  : " + (arr.length - num));

	}

}
