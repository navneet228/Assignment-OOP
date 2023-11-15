import java.util.Scanner;

public class Q89 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kk = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=kk.nextInt();
        
        for(int i=1; i<10; i++) {
        	int mpl=i*n;
        	System.out.println(n+"X"+i+"="+mpl);
        }
        kk.close();
	}

}
