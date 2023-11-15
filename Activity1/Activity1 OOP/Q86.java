import java.util.Scanner;

public class Q86 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		  System.out.print("Enter the number of terms: ");
		  int n = sc.nextInt();
		  int s = 0, c;                                          // s for terms of series, c for n terms
		  for (c = 1; c <= n; c++)                          // To generate n terms
		  {
		   s = s * 10 + 1;
		   System.out.print(s + " ");
		  }
	}

}
