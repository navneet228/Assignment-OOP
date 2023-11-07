import java.util.Scanner;

public class Q45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb= new Scanner(System.in);
		System.out.print("Enter a num : ");
		int num=kb.nextInt();
		factorial (num);
		kb.close();
		
	}
	public static void factorial (int fn) {
		int i;
		int factorial =1;
		for( i=1; i<=fn; i++) {
			factorial*=i;
		}
		System.out.println("Factorial of "+ fn+ " is "+ factorial );

	}

}
