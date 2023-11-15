import java.util.Scanner;

public class Q90c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kk= new Scanner(System.in);
		System.out.print("Enter a number:  ");
		int n= kk.nextInt();
		
		for (int i=0; i<n; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(" ");
			}for(int k=0; k<n-i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		kk.close();
	}

}
