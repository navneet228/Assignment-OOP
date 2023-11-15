import java.util.Scanner;

public class Q90f {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kk = new Scanner(System.in);
        System.out.print("Enter The Limit: "); // enter 5 to get exact output
        int n=kk.nextInt();
         int nn=1;
        for(int i=0; i<n; i++){
        	for(int j=0; j<=i; j++) {
        		System.out.print(nn+" ");
        		nn++;
        	}
    		System.out.println();	
        }
        kk.close();
	}

}
