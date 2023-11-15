//import java.util.Scanner;

public class Q49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {12,33,44,56,28,11,16};
//		Scanner kk= new Scanner(System.in);
//		System.out.print("Give me number for array elements: ");
//		int find= kk.nextInt();
		int find= 44;

		int index=0;
		for(int i = 1; i < arr.length; i++) {
			if(arr[i]==find){
			index=i;
			break;
			}
			}
		if(index!=0){
			System.out.println("location is "+ index);
		}else {
			System.out.println("location is not found");
		}
//		kk.close();
	}
		
		
	}


