import java.util.Scanner;

public class Q90e {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kk= new Scanner(System.in);
		System.out.print("Enter a number:  ");
		int num= kk.nextInt();
		for (int i = num - 1; i >= 1; i--) {
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }

            System.out.println();
        }for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }

            System.out.println();
        }
        kk.close();
	}

}
