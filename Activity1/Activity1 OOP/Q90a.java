import java.util.Scanner;

public class Q90a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kk= new Scanner(System.in);
		System.out.print("Enter a number: "); // enter 7
		int n= kk.nextInt();
		
		for (int i=0; i<=n; i++) {
	        for (int j =i; j>=0; j--) {
	            System.out.print(n-j);
	        }
	       
	        System.out.println();
		}
		kk.close();
	}

}
