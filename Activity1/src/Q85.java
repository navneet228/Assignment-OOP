import java.util.Scanner;

public class Q85 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Input number of terms : ");
	    Scanner kb = new Scanner(System.in);
			    int n = kb.nextInt();

	     for(int i=1;i<=n;i++)
	     {
	     System.out.println("Number is : " +i+" and cube of " +i+" is : "+(i*i*i));     
	    }
	     kb.close();
	}

}
