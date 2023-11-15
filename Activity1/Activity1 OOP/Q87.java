import java.util.Scanner;

public class Q87 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kk = new Scanner(System.in);
        System.out.print("Enter The Limit: ");
        int n=kk.nextInt();
        int sum=0,a;
        for(int i=1;i<=n;i++)
        {
            System.out.print("Enter The Number "+i+": ");
            a=kk.nextInt();
            sum+=a;//sum=sum+a;
        }
        System.out.println("The sum of given numbers is : "+sum);
        System.out.println("The Average of given numbers is : "+sum/n);
        kk.close();
	}

}
