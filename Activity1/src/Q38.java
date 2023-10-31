import java.util.Scanner;

public class Q38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kk= new Scanner(System.in);
    	System.out.print("enter a number: ");
    	int n= kk.nextInt();
    	int sum=0;
    	
		do{
			sum= sum+n;
			n++;
			System.out.println(sum);
		}while(n<=10);
		System.out.println(sum);
	kk.close();	
	}

}
