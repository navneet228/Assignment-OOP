import java.util.Arrays;

public class Q61 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {12,33,44,56,28,11,33,16,44};
        System.out.println("previous Array :" + Arrays.toString(arr));
        int temp, second;
        second = arr.length;

        for(int i = 0; i<second; i++ ){
           for(int j = i+1; j<second; j++){

              if(arr[i]>arr[j]){
                 temp = arr[i];
                 arr[i] = arr[j];
                 arr[j] = temp;
              }
           }
        }
        System.out.println(" second smallest number is:: "+arr[1]); //print arr[0] to get smallest one , arr[1] for second smallest 
	}

}
